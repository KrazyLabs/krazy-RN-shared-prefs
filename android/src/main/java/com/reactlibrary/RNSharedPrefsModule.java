
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class RNSharedPrefsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;
  private final SharedPreferences sharedPrefs;
  private final ReactApplicationContext customContext;

  public RNSharedPrefsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
    this.customContext = null;
    this.sharedPrefs = null;
  }

  public void init (String packageContext) {
    this.customContext = packageContext;
    if(this.customContext != null) {
        Context context = this.reactContext.getApplicationContext().createPackageContext(this.customContext, Context.MODE_WORLD_WRITEABLE);
        this.sharedPrefs = context.getSharedPreferences("KCL-prefs", Context.MODE_WORLD_READABLE);
    } else {
        this.sharedPrefs = this.reactContext.getApplicationContext().getSharedPreferences("KCL-prefs", Context.MODE_WORLD_READABLE)
    }
  }


  public void setSharedPreference(String key, String value) {
//      SharedPreferences prefs = getApplicationContext().getSharedPreferences("sharedprefone", Context.MODE_WORLD_READABLE);
      Editor edit = this.sharedPrefs.edit();
      edit.putString(key, value);
    edit.commit();
  }

    public string getSharedPreference(String key) {
//        SharedPreferences prefs = getApplicationContext().getSharedPreferences("sharedprefone", Context.MODE_WORLD_READABLE);
        return this.sharedPrefs.getString(key,"Couldn't find key");
    }

  @Override
  public String getName() {
    return "RNSharedPrefs";
  }
}