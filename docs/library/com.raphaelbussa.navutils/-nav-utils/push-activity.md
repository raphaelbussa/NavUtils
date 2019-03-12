---
title: NavUtils.pushActivity - library
layout: api
---

<div class='api-docs-breadcrumbs'><a href="../../index.html">library</a> / <a href="../index.html">com.raphaelbussa.navutils</a> / <a href="index.html">NavUtils</a> / <a href="./push-activity.html">pushActivity</a></div>

# pushActivity

<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(android.content.Context, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/context">context</span><span class="symbol">:</span>&nbsp;<a href="https://developer.android.com/reference/android/content/Context.html"><span class="identifier">Context</span></a><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(android.content.Context, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(android.content.Context, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

pushActivity

### Parameters

<code>context</code> - Context

<code>target</code> - KClass&lt;*&gt;

<code>builder</code> - ActivityBuilder.() -&gt; Unit

**Return**
NavUtilsPushActivity

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/activity">activity</span><span class="symbol">:</span>&nbsp;<span class="identifier">FragmentActivity</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.FragmentActivity, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

pushActivity

### Parameters

<code>activity</code> - FragmentActivity

<code>target</code> - KClass&lt;*&gt;

<code>builder</code> - ActivityBuilder.() -&gt; Unit

**Return**
NavUtilsPushActivity

</div>
<div class="overload-group" markdown="1">

<div class="signature"><code><span class="keyword">fun </span><span class="identifier">pushActivity</span><span class="symbol">(</span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/fragment">fragment</span><span class="symbol">:</span>&nbsp;<span class="identifier">Fragment</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/target">target</span><span class="symbol">:</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html"><span class="identifier">KClass</span></a><span class="symbol">&lt;</span><span class="identifier">*</span><span class="symbol">&gt;</span><span class="symbol">, </span><br/>&nbsp;&nbsp;&nbsp;&nbsp;<span class="parameterName" id="com.raphaelbussa.navutils.NavUtils.Companion$pushActivity(androidx.fragment.app.Fragment, kotlin.reflect.KClass((kotlin.Any)), kotlin.Function1((com.raphaelbussa.navutils.activity.ActivityBuilder, kotlin.Unit)))/builder">builder</span><span class="symbol">:</span>&nbsp;<a href="../../com.raphaelbussa.navutils.activity/-activity-builder/index.html"><span class="identifier">ActivityBuilder</span></a><span class="symbol">.</span><span class="symbol">(</span><span class="symbol">)</span>&nbsp;<span class="symbol">-&gt;</span>&nbsp;<a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html"><span class="identifier">Unit</span></a>&nbsp;<span class="symbol">=</span>&nbsp;{}<br/><span class="symbol">)</span><span class="symbol">: </span><a href="../../com.raphaelbussa.navutils.activity/-nav-utils-push-activity/index.html"><span class="identifier">NavUtilsPushActivity</span></a></code></div>

pushActivity

### Parameters

<code>fragment</code> - Fragment

<code>target</code> - KClass&lt;*&gt;

<code>builder</code> - ActivityBuilder.() -&gt; Unit

**Return**
NavUtilsPushActivity

</div>