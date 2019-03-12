---
title: NavUtils - library
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">library</a> / <a href="../index.html">com.raphaelbussa.navutils</a> / <a href="./index.html">NavUtils</a></div>

# NavUtils

<div class="signature"><code><span class="keyword">class </span><span class="identifier">NavUtils</span></code></div>

NavUtils

### Types

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-anim/index.html">Anim</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">enum</span> <span class="keyword">class </span><span class="identifier">Anim</span></code></div>

Anim


</td>
</tr>
</tbody>
</table>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">NavUtils</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

NavUtils


</td>
</tr>
</tbody>
</table>

### Companion Object Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="push-activity.html">pushActivity</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(android.content.Context, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/context">context</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/content/Context.html"><span class="identifier">Context</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(android.content.Context, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(android.content.Context, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/activity">activity</span><span class="symbol">:</span>&nbsp;<span class="identifier">FragmentActivity</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/fragment">fragment</span><span class="symbol">:</span>&nbsp;<span class="identifier">Fragment</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

pushActivity


</td>
</tr>
<tr>
<td markdown="1">

<a href="push-chrome-custom-tab.html">pushChromeCustomTab</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushChromeCustomTab</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushChromeCustomTab(android.content.Context, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/context">context</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/content/Context.html"><span class="identifier">Context</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushChromeCustomTab(android.content.Context, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.chrome/-chrome-builder/index.html"><span class="identifier">ChromeBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.chrome/-nav-utils-push-chrome-activity/index.html"><span class="identifier">NavUtilsPushChromeActivity</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushChromeCustomTab</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushChromeCustomTab(androidx.fragment.app.FragmentActivity, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/activity">activity</span><span class="symbol">:</span>&nbsp;<span class="identifier">FragmentActivity</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushChromeCustomTab(androidx.fragment.app.FragmentActivity, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.chrome/-chrome-builder/index.html"><span class="identifier">ChromeBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.chrome/-nav-utils-push-chrome-activity/index.html"><span class="identifier">NavUtilsPushChromeActivity</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushChromeCustomTab</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushChromeCustomTab(androidx.fragment.app.Fragment, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/fragment">fragment</span><span class="symbol">:</span>&nbsp;<span class="identifier">Fragment</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushChromeCustomTab(androidx.fragment.app.Fragment, kotlin.Function1((com.raphaelbussa.navutils.chrome.ChromeBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.chrome/-chrome-builder/index.html"><span class="identifier">ChromeBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.chrome/-nav-utils-push-chrome-activity/index.html"><span class="identifier">NavUtilsPushChromeActivity</span></a></code></div>

pushChromeCustomTab


</td>
</tr>
<tr>
<td markdown="1">

<a href="push-fragment.html">pushFragment</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushFragment</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/activity">activity</span><span class="symbol">:</span>&nbsp;<span class="identifier">FragmentActivity</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/frameId">frameId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.fragment/-fragment-builder/index.html"><span class="identifier">FragmentBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.fragment/-nav-utils-push-fragment/index.html"><span class="identifier">NavUtilsPushFragment</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushFragment</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/fragment">fragment</span><span class="symbol">:</span>&nbsp;<span class="identifier">Fragment</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/frameId">frameId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushFragment(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Int, kotlin.Function1((com.raphaelbussa.navutils.fragment.FragmentBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.fragment/-fragment-builder/index.html"><span class="identifier">FragmentBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.fragment/-nav-utils-push-fragment/index.html"><span class="identifier">NavUtilsPushFragment</span></a></code></div>

pushFragment


</td>
</tr>
<tr>
<td markdown="1">

<a href="value-of-anim.html">valueOfAnim</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">valueOfAnim</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$valueOfAnim(kotlin.Int)/value">value</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="-anim/index.html"><span class="identifier">Anim</span></a><span class="symbol">?</span></code></div>

valueOfAnim


</td>
</tr>
</tbody>
</table>