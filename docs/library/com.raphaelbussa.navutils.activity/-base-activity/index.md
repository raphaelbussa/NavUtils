---
title: BaseActivity - library
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">library</a> / <a href="../index.html">com.raphaelbussa.navutils.activity</a> / <a href="./index.html">BaseActivity</a></div>

# BaseActivity

<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">class </span><span class="identifier">BaseActivity</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">AppCompatActivity</span></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">BaseActivity</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="activity.html">activity</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">activity</span><span class="symbol">: </span><a href="https://developer.android.com/reference/android/app/Activity.html"><span class="identifier">Activity</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="animation-type.html">animationType</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">animationType</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils/-nav-utils/-anim/index.html"><span class="identifier">Anim</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="toolbar.html">toolbar</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">toolbar</span><span class="symbol">: </span><span class="identifier">Toolbar</span><span class="symbol">?</span></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="toolbar-shadow.html">toolbarShadow</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">toolbarShadow</span><span class="symbol">: </span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="custom-animation.html">customAnimation</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">customAnimation</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$customAnimation(kotlin.Int, kotlin.Int)/enterResId">enterResId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$customAnimation(kotlin.Int, kotlin.Int)/exitResId">exitResId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

customAnimation


</td>
</tr>
<tr>
<td markdown="1">

<a href="finish.html">finish</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">finish</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

finish


</td>
</tr>
<tr>
<td markdown="1">

<a href="on-create.html">onCreate</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">onCreate</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$onCreate(android.os.Bundle)/savedInstanceState">savedInstanceState</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/os/Bundle.html"><span class="identifier">Bundle</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

</td>
</tr>
<tr>
<td markdown="1">

<a href="pop-back-stack-or-finish.html">popBackStackOrFinish</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">popBackStackOrFinish</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

popBackStackOrFinish


</td>
</tr>
<tr>
<td markdown="1">

<a href="pop-support-back-stack-or-finish.html">popSupportBackStackOrFinish</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">popSupportBackStackOrFinish</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

popSupportBackStackOrFinish


</td>
</tr>
<tr>
<td markdown="1">

<a href="remove-subtitle.html">removeSubtitle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">removeSubtitle</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

removeSubtitle


</td>
</tr>
<tr>
<td markdown="1">

<a href="remove-title.html">removeTitle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">removeTitle</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

removeTitle


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-finish-on-navigation-on-click-listener.html">setFinishOnNavigationOnClickListener</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setFinishOnNavigationOnClickListener</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setFinishOnNavigationOnClickListener


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-icon.html">setIcon</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setIcon(kotlin.Int)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setIcon(android.graphics.drawable.Drawable)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setIcon


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-layout-resource.html">setLayoutResource</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">fun </span><span class="identifier">setLayoutResource</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

setLayoutResource


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-light-status-bar.html">setLightStatusBar</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setLightStatusBar</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setLightStatusBar(android.view.View)/view">view</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a>&nbsp;<span class="symbol">=</span>&nbsp;findViewById(android.R.id.content)<br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setLightStatusBar


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-navigation-icon.html">setNavigationIcon</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setNavigationIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setNavigationIcon(kotlin.Int)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setNavigationIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setNavigationIcon(android.graphics.drawable.Drawable)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setNavigationIcon


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-navigation-on-click-listener.html">setNavigationOnClickListener</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setNavigationOnClickListener</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setNavigationOnClickListener(android.view.View.OnClickListener)/onClickListener">onClickListener</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View/OnClickListener.html"><span class="identifier">OnClickListener</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setNavigationOnClickListener


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-pop-back-stack-or-finish-on-navigation-on-click-listener.html">setPopBackStackOrFinishOnNavigationOnClickListener</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setPopBackStackOrFinishOnNavigationOnClickListener</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setPopBackStackOrFinishOnNavigationOnClickListener


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-pop-support-back-stack-or-finish-on-navigation-on-click-listener.html">setPopSupportBackStackOrFinishOnNavigationOnClickListener</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setPopSupportBackStackOrFinishOnNavigationOnClickListener</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setPopSupportBackStackOrFinishOnNavigationOnClickListener


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-requested-orientation.html">setRequestedOrientation</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">setRequestedOrientation</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

setRequestedOrientation


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-status-bar-color.html">setStatusBarColor</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setStatusBarColor</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setStatusBarColor(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setStatusBarColor


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-status-bar-color-res.html">setStatusBarColorRes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setStatusBarColorRes</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setStatusBarColorRes(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setStatusBarColorRes


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle.html">setSubtitle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setSubtitle(kotlin.String)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setSubtitle(kotlin.Int)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitle


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle-color.html">setSubtitleColor</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitleColor</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setSubtitleColor(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitleColor


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle-color-res.html">setSubtitleColorRes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitleColorRes</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setSubtitleColorRes(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitleColorRes


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle-post.html">setSubtitlePost</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setSubtitlePost(kotlin.String)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setSubtitlePost(kotlin.Int)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitlePost


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-theme.html">setTheme</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTheme</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

setTheme


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title.html">setTitle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setTitle(kotlin.String)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">setTitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setTitle(kotlin.Int)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitle


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title-color.html">setTitleColor</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">setTitleColor</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setTitleColor(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitleColor


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title-color-res.html">setTitleColorRes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitleColorRes</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setTitleColorRes(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitleColorRes


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title-post.html">setTitlePost</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setTitlePost(kotlin.String)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.BaseActivity$setTitlePost(kotlin.Int)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitlePost


</td>
</tr>
<tr>
<td markdown="1">

<a href="toolbar-id.html">toolbarId</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">toolbarId</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

toolbarId


</td>
</tr>
<tr>
<td markdown="1">

<a href="toolbar-shadow-id.html">toolbarShadowId</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">toolbarShadowId</span><span class="symbol">(</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a></code></div>

toolbarShadowId


</td>
</tr>
</tbody>
</table>

### Extension Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../../com.raphaelbussa.navutils/androidx.fragment.app.-fragment-activity/push-activity.html">pushActivity</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">FragmentActivity</span><span class="symbol">.</span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

pushActivity


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../com.raphaelbussa.navutils/androidx.fragment.app.-fragment-activity/push-chrome-custom-tab.html">pushChromeCustomTab</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">FragmentActivity</span><span class="symbol">.</span><span class="identifier">pushChromeCustomTab</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushChromeCustomTab(androidx.fragment.app.FragmentActivity, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.chrome/-chrome-builder/index.html"><span class="identifier">ChromeBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.chrome/-nav-utils-push-chrome-activity/index.html"><span class="identifier">NavUtilsPushChromeActivity</span></a></code></div>

pushChromeCustomTab


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../com.raphaelbussa.navutils/androidx.fragment.app.-fragment-activity/push-fragment.html">pushFragment</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">FragmentActivity</span><span class="symbol">.</span><span class="identifier">pushFragment</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/frameId">frameId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.fragment/-fragment-builder/index.html"><span class="identifier">FragmentBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.fragment/-nav-utils-push-fragment/index.html"><span class="identifier">NavUtilsPushFragment</span></a></code></div>

pushFragment


</td>
</tr>
</tbody>
</table>
