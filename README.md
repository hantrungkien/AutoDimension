# Auto Dimension
Auto Dimension

[![](https://jitpack.io/v/hantrungkien/AutoDimension.svg)](https://jitpack.io/#hantrungkien/AutoDimension)

### install:

**via JitPack (to get current code)**

project/build.gradle
````gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
````
module/build.gradle
````gradle
compile 'com.github.hantrungkien:AutoDimension:1.0.3'
````

#### How to use:

````xml
<TextView
 android:id="@+id/work_time_sheet"
 android:layout_width="match_parent"
 android:layout_height="match_parent"
 android:layout_margin="@dimen/_1dp"/>


### Contribution

If you've found an error, please file an issue.

Patches and new samples are encouraged, and may be submitted by forking this project and submitting a pull request through GitHub.
