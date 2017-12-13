
# react-native-shared-prefs

## Getting started

`$ npm install react-native-shared-prefs --save`

### Mostly automatic installation

`$ react-native link react-native-shared-prefs`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNSharedPrefsPackage;` to the imports at the top of the file
  - Add `new RNSharedPrefsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-shared-prefs'
  	project(':react-native-shared-prefs').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-shared-prefs/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-shared-prefs')
  	```


## Usage
```javascript
import RNSharedPrefs from 'rreact-native-shared-prefs';

// TODO: What to do with the module?
RNSharedPrefs;
```
  