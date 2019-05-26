# Nav Utils 
[![Download](https://api.bintray.com/packages/raphaelbussa/maven/navutils/images/download.svg) ](https://bintray.com/raphaelbussa/maven/navutils/_latestVersion) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-NavUtils-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/7685)


![Logo](https://raw.githubusercontent.com/raphaelbussa/NavUtils/master/img/carbon.png)

Easy manage commit Fragment and Activity, with some little extra

### Import
At the moment the library is in my personal maven repo

```Gradle
repositories {
    maven {
        url 'http://dl.bintray.com/raphaelbussa/maven'
    }
}
```

```Gradle
dependencies {
    implementation 'com.raphaelbussa:navutils:4.0.0.alpha6'
}
```
### How to use
#### Activity
The library provide several methods to commit a new activity, in Fragment and Activity you can use extentions

```Kotlin
pushActivity(ResultActivity::class) {
    //remove all activity from current stack 
    clearStack(true)
    //add arguments 
    arguments(Bundle.EMPTY)
    //add standard animation
    animationType(NavUtils.Anim.HORIZONTAL_RIGHT)
    //add custom animation
    customAnimation(R.anim.popup_enter, R.anim.popup_exit)
    //add scene transition
    sceneTransition(view)     
}.commit()
```
For commit an Activty with result

```Kotlin
.commit(requestCode = 9000)
```
#### Fragment
The library provide several methods to commit a new fragment, in Fragment and Activity you can use extentions

```Kotlin
pushFragment(ResultFragment::class, R.id.container) {
    //add standard animation
    animationType(animationType)
    //remove start animation
    noEnterAnimations(true)
    //remove exit animation
    noExitAnimations(true)
    //add arguments 
    arguments(Bundle.EMPTY)
    //add custom animation
    customAnimation(R.anim.popup_enter, R.anim.popup_exit, R.anim.popup_enter, R.anim.popup_exit)
    //add fragment to backstack
    addToBackStack()
    //set custom tag
    tag("custom tag")
}.replace()
```
If you want to add

```Kotlin
.add()
```

# That's all folks!

### Sample
Browse the sample code [here](https://github.com/raphaelbussa/NavUtils/tree/master/sample)

### Kotlin doc
Browse Kotlin doc [here](https://raphaelbussa.github.io/NavUtils/library/)

### App using Nav Utils
If you use this lib [contact me](mailto:raphaelbussa@gmail.com?subject=NavUtils) and I will add it to the list below:

### Developed By
Raphaël Bussa - [raphaelbussa@gmail.com](mailto:raphaelbussa@gmail.com)

[ ![Twitter](https://raw.githubusercontent.com/raphaelbussa/NavUtils/master/img/social/twitter-icon.png) ](https://twitter.com/raphaelbussa)[ ![Linkedin](https://raw.githubusercontent.com/raphaelbussa/NavUtils/master/img/social/linkedin-icon.png) ](https://www.linkedin.com/in/raphaelbussa)

### License
```
The MIT License (MIT)

Copyright (c) 2017-2019 Raphaël Bussa

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
