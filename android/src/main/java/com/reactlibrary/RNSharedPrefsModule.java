
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

  public RNSharedPrefsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  public void setSharedPreference(String value) {
      SharedPreferences prefs = getApplicationContext().getSharedPreferences("sharedprefone", Context.MODE_WORLD_READABLE);
  }

  @Override
  public String getName() {
    return "RNSharedPrefs";
  }
}