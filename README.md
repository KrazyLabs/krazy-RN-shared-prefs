
# react-native-krazy-rn-shared-prefs

## Getting started

`$ npm install react-native-krazy-rn-shared-prefs --save`

### Mostly automatic installation

`$ react-native link react-native-krazy-rn-shared-prefs`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNKrazyRnSharedPrefsPackage;` to the imports at the top of the file
  - Add `new RNKrazyRnSharedPrefsPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-krazy-rn-shared-prefs'
  	project(':react-native-krazy-rn-shared-prefs').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-krazy-rn-shared-prefs/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-krazy-rn-shared-prefs')
  	```


## Usage
```javascript
import RNKrazyRnSharedPrefs from 'react-native-krazy-rn-shared-prefs';

// TODO: What to do with the module?
RNKrazyRnSharedPrefs;
```
  