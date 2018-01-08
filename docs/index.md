# Nav Utils
[![Download](https://api.bintray.com/packages/raphaelbussa/maven/nav-utils/images/download.svg) ](https://bintray.com/raphaelbussa/maven/nav-utils/_latestVersion)

![Logo](https://raw.githubusercontent.com/rebus007/NavUtils/master/sample/src/main/ic_launcher-web.png)

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
    compile 'rebus:nav-utils:2.0.5'
}
```
### How to use
#### Push a new Activity

```Java
ActivityUtils.Builder(getActivity())
        .animationType(NavUtils.HORIZONTAL_RIGHT)
        .start(ResultActivity.class);
```
#### Push a new Fragment

```Java
FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
        .animationType(NavUtils.HORIZONTAL_RIGHT)
        .replace(getActivity(), ResultFragment.class);
```


# That's all folks!

### Sample
Browse the sample code [here](https://github.com/rebus007/NavUtils/tree/master/sample)

### Javadoc
Browse Javadoc [here](https://rebus007.github.io/NavUtils/javadoc/)

### App using Nav Utils
If you use this lib [contact me](mailto:raphaelbussa@gmail.com?subject=NavUtils) and I will add it to the list below:

### Developed By
Raphaël Bussa - [raphaelbussa@gmail.com](mailto:raphaelbussa@gmail.com)

[ ![Twitter](https://raw.githubusercontent.com/rebus007/NavUtils/master/img/social/twitter-icon.png) ](https://twitter.com/rebus_007)[ ![Google Plus](https://raw.githubusercontent.com/rebus007/NavUtils/master/img/social/google-plus-icon.png) ](https://plus.google.com/+RaphaelBussa/posts)[ ![Linkedin](https://raw.githubusercontent.com/rebus007/NavUtils/master/img/social/linkedin-icon.png) ](https://www.linkedin.com/in/rebus007)

### License
```
The MIT License (MIT)

Copyright (c) 2017 Raphaël Bussa

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
