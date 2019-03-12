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
import com.raphaelbussa.navutils.*

/**
 * BaseActivity
 * @property toolbar Toolbar?
 * @property toolbarShadow View?
 * @property animationType Anim
 * @property customAnimation Boolean
 * @property enterResId Int
 * @property exitResId Int
 * @property activity Activity
 */
@SuppressLint("WrongConstant")
@Suppress("MemberVisibilityCanBePrivate", "OverridingDeprecatedMember", "unused")
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

    /**
     * customAnimation
     * @param enterResId Int
     * @param exitResId Int
     */
    fun customAnimation(@AnimRes enterResId: Int, @AnimRes exitResId: Int) {
        this.customAnimation = true
        this.enterResId = enterResId
        this.exitResId = exitResId
    }

    /**
     * setIcon
     * @param icon Int
     */
    fun setIcon(@DrawableRes icon: Int) {
        supportActionBar?.setIcon(icon)
    }

    /**
     * setIcon
     * @param icon Drawable
     */
    fun setIcon(icon: Drawable) {
        supportActionBar?.setIcon(icon)
    }

    /**
     * setTitle
     * @param title String
     */
    fun setTitle(title: String) {
        supportActionBar?.title = title
    }

    /**
     * setTitle
     * @param title Int
     */
    override fun setTitle(@StringRes title: Int) {
        supportActionBar?.setTitle(title)
    }

    /**
     * setTitlePost
     * @param title String
     */
    fun setTitlePost(title: String) {
        toolbar?.post { supportActionBar?.title = title }
    }

    /**
     * setTitlePost
     * @param title Int
     */
    fun setTitlePost(@StringRes title: Int) {
        toolbar?.post { supportActionBar?.setTitle(title) }
    }

    /**
     * setTitleColorRes
     * @param color Int
     */
    fun setTitleColorRes(@ColorRes color: Int) {
        titleColor = ContextCompat.getColor(this, color)
    }

    /**
     * setTitleColor
     * @param color Int
     */
    override fun setTitleColor(@ColorInt color: Int) {
        toolbar?.setTitleTextColor(color)
    }

    /**
     * removeTitle
     */
    fun removeTitle() {
        setTitle("")
    }

    /**
     * setSubtitle
     * @param subtitle String
     */
    fun setSubtitle(subtitle: String) {
        supportActionBar?.subtitle = subtitle
    }

    /**
     * setSubtitle
     * @param subtitle Int
     */
    fun setSubtitle(@StringRes subtitle: Int) {
        supportActionBar?.setSubtitle(subtitle)
    }

    /**
     * setSubtitlePost
     * @param subtitle String
     */
    fun setSubtitlePost(subtitle: String) {
        toolbar?.post { supportActionBar?.subtitle = subtitle }
    }

    /**
     * setSubtitlePost
     * @param subtitle Int
     */
    fun setSubtitlePost(@StringRes subtitle: Int) {
        toolbar?.post { supportActionBar?.setSubtitle(subtitle) }
    }

    /**
     * setSubtitleColorRes
     * @param color Int
     */
    fun setSubtitleColorRes(@ColorRes color: Int) {
        setSubtitleColor(ContextCompat.getColor(this, color))
    }

    /**
     * setSubtitleColor
     * @param color Int
     */
    fun setSubtitleColor(@ColorInt color: Int) {
        toolbar?.setSubtitleTextColor(color)
    }

    /**
     * removeSubtitle
     */
    fun removeSubtitle() {
        setSubtitle("")
    }

    /**
     * setNavigationIcon
     * @param icon Int
     */
    fun setNavigationIcon(@DrawableRes icon: Int) {
        toolbar?.setNavigationIcon(icon)
    }

    /**
     * setNavigationIcon
     * @param icon Drawable
     */
    fun setNavigationIcon(icon: Drawable) {
        toolbar?.navigationIcon = icon
    }

    /**
     * setNavigationOnClickListener
     * @param onClickListener View.OnClickListener
     */
    fun setNavigationOnClickListener(onClickListener: View.OnClickListener) {
        toolbar?.setNavigationOnClickListener(onClickListener)
    }

    /**
     * setFinishOnNavigationOnClickListener
     */
    fun setFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(View.OnClickListener { finish() })
    }

    /**
     * setPopBackStackOrFinishOnNavigationOnClickListener
     */
    fun setPopBackStackOrFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(View.OnClickListener { popBackStackOrFinish() })
    }

    /**
     * setPopSupportBackStackOrFinishOnNavigationOnClickListener
     */
    fun setPopSupportBackStackOrFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(View.OnClickListener { popSupportBackStackOrFinish() })
    }

    /**
     * setStatusBarColor
     * @param color Int
     */
    fun setStatusBarColor(@ColorInt color: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = color
        }
    }

    /**
     * setStatusBarColorRes
     * @param color Int
     */
    fun setStatusBarColorRes(@ColorRes color: Int) {
        setStatusBarColor(ContextCompat.getColor(this, color))
    }

    /**
     * setLightStatusBar
     * @param view View
     */
    fun setLightStatusBar(view: View = findViewById(android.R.id.content)) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            view.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
        }
    }

    /**
     * popSupportBackStackOrFinish
     */
    fun popSupportBackStackOrFinish() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
            return
        }
        supportFragmentManager.popBackStack()
    }

    /**
     * popBackStackOrFinish
     */
    fun popBackStackOrFinish() {
        if (supportFragmentManager.backStackEntryCount == 0) {
            finish()
            return
        }
        supportFragmentManager.popBackStack()
    }

    /**
     * finish
     */
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

    /**
     * setLayoutResource
     * @return Int
     */
    @LayoutRes
    protected abstract fun setLayoutResource(): Int

    /**
     * toolbarId
     * @return Int
     */
    fun toolbarId(): Int {
        return R.id.default_toolbar_id
    }

    /**
     * toolbarShadowId
     * @return Int
     */
    fun toolbarShadowId(): Int {
        return R.id.default_toolbar_shadow_id
    }

    /**
     * setRequestedOrientation
     * @return Int
     */
    @Orientation
    open fun setRequestedOrientation() = NULL

    /**
     * setTheme
     * @return Int
     */
    @StyleRes
    fun setTheme() = 0

}
