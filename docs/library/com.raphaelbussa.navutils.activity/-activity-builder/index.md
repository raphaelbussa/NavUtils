---
title: ActivityBuilder - library
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">library</a> / <a href="../index.html">com.raphaelbussa.navutils.activity</a> / <a href="./index.html">ActivityBuilder</a></div>

# ActivityBuilder

<div class="signature"><code><span class="keyword">class </span><span class="identifier">ActivityBuilder</span></code></div>

### Constructors

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="-init-.html">&lt;init&gt;</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="identifier">ActivityBuilder</span><span class="symbol">(</span><span class="symbol">)</span></code></div>

</td>
</tr>
</tbody>
</table>

### Functions

<table class="api-docs-table">
<tbody>
<tr>
<td markdown="1">

<a href="animation-type.html">animationType</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">animationType</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$animationType(com.raphaelbussa.navutils.NavUtils.Anim)/animationType">animationType</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils/-nav-utils/-anim/index.html"><span class="identifier">Anim</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

animationType


</td>
</tr>
<tr>
<td markdown="1">

<a href="arguments.html">arguments</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">arguments</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$arguments(android.os.Bundle)/arguments">arguments</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/os/Bundle.html"><span class="identifier">Bundle</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

arguments


</td>
</tr>
<tr>
<td markdown="1">

<a href="clear-stack.html">clearStack</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">clearStack</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$clearStack(kotlin.Boolean)/clearStack">clearStack</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html"><span class="identifier">Boolean</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

clearStack


</td>
</tr>
<tr>
<td markdown="1">

<a href="custom-animation.html">customAnimation</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">customAnimation</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$customAnimation(kotlin.Int, kotlin.Int)/enterResId">enterResId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">, </span><span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$customAnimation(kotlin.Int, kotlin.Int)/exitResId">exitResId</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html"><span class="identifier">Int</span></a><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

customAnimation


</td>
</tr>
<tr>
<td markdown="1">

<a href="scene-transition.html">sceneTransition</a>


</td>
<td markdown="1">
<div class="signature"><code><span class="keyword">fun </span><span class="identifier">sceneTransition</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$sceneTransition(androidx.core.util.Pair((android.view.View, kotlin.String)))/sceneTransition">sceneTransition</span><span class="symbol">:</span>&nbsp;<span class="identifier">Pair</span><span class="symbol">&lt;</span><a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span><span class="symbol">,</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><span class="symbol">&gt;</span><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">sceneTransition</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$sceneTransition(android.view.View, kotlin.String)/sharedElement">sharedElement</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$sceneTransition(android.view.View, kotlin.String)/sharedElementName">sharedElementName</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html"><span class="identifier">String</span></a><br/><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">sceneTransition</span><span class="symbol">(</span><span class="parameterName" id="com.raphaelbussa.navutils.activity.ActivityBuilder$sceneTransition(android.view.View)/sharedElement">sharedElement</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/view/View.html"><span class="identifier">View</span></a><span class="symbol">?</span><span class="symbol">)</span><span class="symbol">: </span><a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a></code></div>

sceneTransition


</td>
</tr>
</tbody>
</table>
