package com.raphaelbussa.navutils.activity

import android.annotation.SuppressLint
import android.app.Activity
import android.graphics.drawable.Drawable
import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.annotation.*
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.R
import com.raphaelbussa.navutils.NAV_ANIM
import com.raphaelbussa.navutils.NULL
import com.raphaelbussa.navutils.NavUtils
import com.raphaelbussa.navutils.Orientation

abstract class BaseActivity : AppCompatActivity() {

    var toolbar: Toolbar? = null
        private set
    var toolbarShadow: View? = null
        private set
    var animationType = NavUtils.Anim.SYSTEM

    private var customAnimation = false
    private var enterResId = 0
    private var exitResId = 0

    val activity: Activity
        get() = this

    @SuppressLint("WrongConstant")
    public override fun onCreate(savedInstanceState: Bundle?) {
        if (setTheme() != 0) setTheme(setTheme())
        super.onCreate(savedInstanceState)
        if (setRequestedOrientation() != NULL) {
            requestedOrientation = setRequestedOrientation()
        }
        if (setLayoutResource() != 0) {
            setContentView(setLayoutResource())
            if (toolbarId() != 0) {
                toolbar = findViewById(toolbarId())
                if (toolbar != null) {
                    setSupportActionBar(toolbar)
                }
            }
            if (toolbarShadowId() != 0) {
                toolbarShadow = findViewById(toolbarShadowId())
            }
        }
        if (intent.hasExtra(NAV_ANIM)) {
            animationType = NavUtils.valueOfAnim(intent?.extras?.getInt(NAV_ANIM) ?: -1)
                    ?: NavUtils.Anim.SYSTEM
        }
    }

    fun customAnimation(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        this.customAnimation = true
        this.enterResId = enterResId
        this.exitResId = exitResId
    }

    fun setIcon(@DrawableRes icon: Int) {
        supportActionBar?.setIcon(icon)
    }

    fun setIcon(icon: Drawable) {
        supportActionBar?.setIcon(icon)
    }

    fun setTitle(title: String) {
        supportActionBar?.title = title
    }

    override fun setTitle(@StringRes title: Int) {
        supportActionBar?.setTitle(title)
    }

    fun setTitlePost(title: String) {
        toolbar?.post { supportActionBar?.title = title }
    }

    fun setTitlePost(@StringRes title: Int) {
        toolbar?.post { supportActionBar?.setTitle(title) }
    }

    fun setTitleColorRes(@ColorRes color: Int) {
        titleColor = ContextCompat.getColor(this, color)
    }

    @Suppress("OverridingDeprecatedMember")
    override fun setTitleColor(@ColorInt color: Int) {
        toolbar?.setTitleTextColor(color)
    }

    fun removeTitle() {
        setTitle("")
    }

    fun setSubtitle(subtitle: String) {
        supportActionBar?.subtitle = subtitle
    }

    fun setSubtitle(@StringRes subtitle: Int) {
        supportActionBar?.setSubtitle(subtitle)
    }

    fun setSubtitlePost(subtitle: String) {
        toolbar?.post { supportActionBar?.subtitle = subtitle }
    }

    fun setSubtitlePost(@StringRes subtitle: Int) {
        toolbar?.post { supportActionBar?.setSubtitle(subtitle) }
    }

    fun setSubtitleColorRes(@ColorRes color: Int) {
        setSubtitleColor(ContextCompat.getColor(this, color))
    }

    fun setSubtitleColor(@ColorInt color: Int) {
        toolbar?.setSubtitleTextColor(color)
    }

    fun removeSubtitle() {
        setSubtitle("")
    }

    fun setNavigationIcon(@DrawableRes icon: Int) {
        toolbar?.setNavigationIcon(icon)
    }

    fun setNavigationIcon(icon: Drawable) {
        toolbar?.navigationIcon = icon
    }

    fun setNavigationOnClickListener(onClickListener: View.OnClickListener) {
        toolbar?.setNavigationOnClickListener(onClickListener)
    }

    fun setFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(View.OnClickListener { finish() })
    }

    fun setPopBackStackOrFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(View.OnClickListener { popBackStackOrFinish() })
    }

    fun setPopSupportBackStackOrFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(View.OnClickListener { popSupportBackStackOrFinish() })
    }

    fun setStatusBarColor(@ColorInt color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = color
        }
    }

    fun setStatusBarColorRes(@ColorRes color: Int) {
        setStatusBarColor(ContextCompat.getColor(this, color))
    }

    fun setLightStatusBar(view: View = findViewById(android.R.id.content)) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }

    fun popSupportBackStackOrFinish() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
            return
        }
        supportFragmentManager.popBackStack()
    }

    fun popBackStackOrFinish() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
            return
        }
        supportFragmentManager.popBackStack()
    }

    override fun finish() {
        super.finish()
        if (customAnimation) {
            overridePendingTransition(enterResId, exitResId)
            return
        }
        when (animationType) {
            NavUtils.Anim.HORIZONTAL_RIGHT -> overridePendingTransition(R.anim.horizontal_right_finish_enter, R.anim.horizontal_right_finish_exit)
            NavUtils.Anim.HORIZONTAL_LEFT -> overridePendingTransition(R.anim.horizontal_left_finish_enter, R.anim.horizontal_left_finish_exit)
            NavUtils.Anim.VERTICAL_BOTTOM -> overridePendingTransition(R.anim.fade_in, R.anim.vertical_bottom_finish_exit)
            NavUtils.Anim.VERTICAL_TOP -> overridePendingTransition(R.anim.fade_in, R.anim.vertical_top_finish_exit)
            NavUtils.Anim.NONE -> overridePendingTransition(0, 0)
            NavUtils.Anim.SYSTEM -> {

            }
        }
    }

    @LayoutRes
    protected abstract fun setLayoutResource(): Int

    fun toolbarId(): Int {
        return R.id.default_toolbar_id
    }

    fun toolbarShadowId(): Int {
        return R.id.default_toolbar_shadow_id
    }

    @Orientation
    open fun setRequestedOrientation() = NULL

    @StyleRes
    fun setTheme() = 0

}