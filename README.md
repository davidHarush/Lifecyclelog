

# Lifecyclelog
![GitHub release (latest by date)](https://img.shields.io/github/v/release/davidHarush/Lifecyclelog)
![GitHub top language](https://img.shields.io/github/languages/top/davidHarush/Lifecyclelog)
![GitHub repo size](https://img.shields.io/github/repo-size/davidHarush/Lifecyclelog)
![GitHub issues](https://img.shields.io/github/issues/davidHarush/Lifecyclelog)

### Lifecyclelog is a util to log LifecycleOwner events.<br>

## Installation.
Step 1. Add the JitPack repository to your build file. <br>
Add it in your root build.gradle at the end of repositories:
```sh
allprojects {
  repositories {
	  ...
	  maven { url 'https://jitpack.io' }
	}
}
```
Step 2. Add the dependency<br>
```sh
dependencies {
    implementation 'com.github.davidHarush:Lifecyclelog:1.0'
}
```

for more info:
<br/>
[![](https://jitpack.io/v/davidHarush/Lifecyclelog.svg)](https://jitpack.io/#davidHarush/Lifecyclelog)
<br/>
<br/>


## How to use it.

My recommendation is to create base class to every LifecycleOwner in your project meaning: <br/>
To create BaseFragmnet, BaseActivity and init the Lifecyclelog inside their onCreate function.

```sh
open class BaseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LifecycleLog(lifecycle = lifecycle, isDebug = BuildConfig.DEBUG, level = LifecycleLog.LEVEL_INFO)

    }
}
```
IT'S ALL!.<br/><br/>
And the result.<br/><br/>
<img src="https://github.com/davidHarush/Lifecyclelog/blob/master/images/img1.PNG">
<br/>


