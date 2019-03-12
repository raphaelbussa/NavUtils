---
title: BaseFragment - library
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">library</a> / <a href="../index.html">com.raphaelbussa.navutils.fragment</a> / <a href="./index.html">BaseFragment</a></div>

# BaseFragment

<div class="signature"><code><span class="keyword">abstract</span> <span class="keyword">class </span><span class="identifier">BaseFragment</span>&nbsp;<span class="symbol">:</span>&nbsp;<span class="identifier">Fragment</span></code></div>

BaseFragment

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">BaseFragment</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

BaseFragment


</td>
</tr>
</tbody>
</table>

### Properties

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="root-view.html">rootView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">var </span><span class="identifier">rootView</span><span class="symbol">: </span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span></code></div>

View?


</td>
</tr>
<tr>
<td markdown="1">

<a href="support-fragment-manager.html">supportFragmentManager</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">supportFragmentManager</span><span class="symbol">: </span><span class="identifier">FragmentManager</span><span class="symbol">?</span></code></div>

FragmentManager?


</td>
</tr>
<tr>
<td markdown="1">

<a href="toolbar.html">toolbar</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">toolbar</span><span class="symbol">: </span><span class="identifier">Toolbar</span><span class="symbol">?</span></code></div>

Toolbar?


</td>
</tr>
<tr>
<td markdown="1">

<a href="toolbar-shadow.html">toolbarShadow</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">val </span><span class="identifier">toolbarShadow</span><span class="symbol">: </span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span></code></div>

View?


</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="find-view-by-id.html">findViewById</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="symbol">&lt;</span><span class="identifier">T</span>&nbsp;<span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">&gt;</span> <span class="identifier">findViewById</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$findViewById(kotlin.Int)/id">id</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="find-view-by-id.html#T"><span class="identifier">T</span></a><span class="symbol">?</span></code></div>

findViewById


</td>
</tr>
<tr>
<td markdown="1">

<a href="on-create-view.html">onCreateView</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">open</span> <span class="keyword">fun </span><span class="identifier">onCreateView</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)/inflater">inflater</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/LayoutInflater.html"><span class="identifier">LayoutInflater</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)/container">container</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/ViewGroup.html"><span class="identifier">ViewGroup</span></a><span class="symbol">?</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle)/savedInstanceState">savedInstanceState</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/os/Bundle.html"><span class="identifier">Bundle</span></a><span class="symbol">?</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span></code></div>

onCreateView


</td>
</tr>
<tr>
<td markdown="1">

<a href="on-support-back-pressed.html">onSupportBackPressed</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">onSupportBackPressed</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$onSupportBackPressed(android.os.Bundle)/bundle">bundle</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/os/Bundle.html"><span class="identifier">Bundle</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a></code></div>

onSupportBackPressed


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

<a href="set-icon.html">setIcon</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setIcon(kotlin.Int)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setIcon(android.graphics.drawable.Drawable)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

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

<a href="set-navigation-icon.html">setNavigationIcon</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setNavigationIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setNavigationIcon(kotlin.Int)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setNavigationIcon</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setNavigationIcon(android.graphics.drawable.Drawable)/icon">icon</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/graphics/drawable/Drawable.html"><span class="identifier">Drawable</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setNavigationIcon


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-navigation-on-click-listener.html">setNavigationOnClickListener</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setNavigationOnClickListener</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setNavigationOnClickListener(android.view.View.OnClickListener)/onClickListener">onClickListener</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View/OnClickListener.html"><span class="identifier">OnClickListener</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setNavigationOnClickListener


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-status-bar-color.html">setStatusBarColor</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setStatusBarColor</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setStatusBarColor(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setStatusBarColor


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-status-bar-color-res.html">setStatusBarColorRes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setStatusBarColorRes</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setStatusBarColorRes(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setStatusBarColorRes


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle.html">setSubtitle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setSubtitle(kotlin.Int)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setSubtitle(kotlin.String)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitle


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle-color.html">setSubtitleColor</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitleColor</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setSubtitleColor(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitleColor


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle-color-res.html">setSubtitleColorRes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitleColorRes</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setSubtitleColorRes(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitleColorRes


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-subtitle-post.html">setSubtitlePost</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setSubtitlePost(kotlin.String)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setSubtitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setSubtitlePost(kotlin.Int)/subtitle">subtitle</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setSubtitlePost


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title.html">setTitle</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setTitle(kotlin.Int)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitle</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setTitle(kotlin.String)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitle


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title-color.html">setTitleColor</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitleColor</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setTitleColor(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitleColor


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title-color-res.html">setTitleColorRes</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitleColorRes</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setTitleColorRes(kotlin.Int)/color">color</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitleColorRes


</td>
</tr>
<tr>
<td markdown="1">

<a href="set-title-post.html">setTitlePost</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setTitlePost(kotlin.String)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">setTitlePost</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.fragment.BaseFragment$setTitlePost(kotlin.Int)/title">title</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

setTitlePost


</td>
</tr>
</tbody>
</table>

### Extension Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="../../com.raphaelbussa.navutils/androidx.fragment.app.-fragment/push-activity.html">pushActivity</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">Fragment</span><span class="symbol">.</span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

pushActivity


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../com.raphaelbussa.navutils/androidx.fragment.app.-fragment/push-chrome-custom-tab.html">pushChromeCustomTab</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">Fragment</span><span class="symbol">.</span><span class="identifier">pushChromeCustomTab</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushChromeCustomTab(androidx.fragment.app.Fragment, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.chrome/-chrome-builder/index.html"><span class="identifier">ChromeBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.chrome/-nav-utils-push-chrome-activity/index.html"><span class="identifier">NavUtilsPushChromeActivity</span></a></code></div>

pushChromeCustomTab


</td>
</tr>
<tr>
<td markdown="1">

<a href="../../com.raphaelbussa.navutils/androidx.fragment.app.-fragment/push-fragment.html">pushFragment</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">Fragment</span><span class="symbol">.</span><span class="identifier">pushFragment</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/frameId">frameId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../-fragment-builder/index.html"><span class="identifier">FragmentBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../-nav-utils-push-fragment/index.html"><span class="identifier">NavUtilsPushFragment</span></a></code></div>

pushFragment


</td>
</tr>
</tbody>
</table>
