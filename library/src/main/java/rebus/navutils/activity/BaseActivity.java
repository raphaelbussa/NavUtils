package rebus.navutils.activity;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.AnimRes;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.support.annotation.StyleRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import rebus.navutils.NavUtils;
import rebus.navutils.R;

/**
 * Created by Raphael on 07/10/2015.
 */
public abstract class BaseActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private View toolbarShadow;

    @NavUtils.Anim
    private int animationType = NavUtils.SYSTEM;
    private boolean customAnimation = false;
    private int enterResId = 0;
    private int exitResId = 0;

    @SuppressWarnings("WrongConstant")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        if (setTheme() != 0) setTheme(setTheme());
        super.onCreate(savedInstanceState);
        if (setLayoutResource() != 0) {
            setContentView(setLayoutResource());
            if (setToolbarId() != 0) {
                toolbar = (Toolbar) findViewById(setToolbarId());
                if (toolbar != null) {
                    setSupportActionBar(toolbar);
                }
            }
            if (setToolbarShadowId() != 0) {
                toolbarShadow = findViewById(setToolbarShadowId());
            }
        }
        if (getIntent().hasExtra(NavUtils.NAV_ANIM)) {
            animationType = getIntent().getExtras().getInt(NavUtils.NAV_ANIM);
        }
    }


    public void animationType(@NavUtils.Anim int animationType) {
        this.animationType = animationType;
    }

    public void customAnimation(@AnimRes int enterResId, @AnimRes int exitResId) {
        this.customAnimation = true;
        this.enterResId = enterResId;
        this.exitResId = exitResId;
    }

    public Toolbar getToolbar() {
        return toolbar;
    }

    public View getToolbarShadow() {
        return toolbarShadow;
    }

    public void setIcon(@DrawableRes int icon) {
        if (getSupportActionBar() != null) getSupportActionBar().setIcon(icon);
    }

    public void setIcon(Drawable icon) {
        if (getSupportActionBar() != null) getSupportActionBar().setIcon(icon);
    }

    public void setTitle(String title) {
        if (getSupportActionBar() != null) getSupportActionBar().setTitle(title);
    }

    public void setTitle(@StringRes int title) {
        if (getSupportActionBar() != null) getSupportActionBar().setTitle(title);
    }

    public void setTitlePost(final String title) {
        if (toolbar != null) toolbar.post(new Runnable() {
            @Override
            public void run() {
                if (getSupportActionBar() != null) getSupportActionBar().setTitle(title);
            }
        });
    }

    public void setTitlePost(@StringRes final int title) {
        if (toolbar != null) toolbar.post(new Runnable() {
            @Override
            public void run() {
                if (getSupportActionBar() != null) getSupportActionBar().setTitle(title);
            }
        });
    }

    public void setTitleColorRes(@ColorRes int color) {
        setTitleColor(ContextCompat.getColor(this, color));
    }

    @SuppressWarnings("deprecation")
    public void setTitleColor(@ColorInt int color) {
        if (toolbar != null) toolbar.setTitleTextColor(color);
    }

    public void removeTitle() {
        setTitle("");
    }

    public void setSubtitle(String subtitle) {
        if (getSupportActionBar() != null) getSupportActionBar().setSubtitle(subtitle);
    }

    public void setSubtitle(@StringRes int subtitle) {
        if (getSupportActionBar() != null) getSupportActionBar().setSubtitle(subtitle);
    }

    public void setSubtitlePost(final String subtitle) {
        if (toolbar != null) toolbar.post(new Runnable() {
            @Override
            public void run() {
                if (getSupportActionBar() != null) getSupportActionBar().setSubtitle(subtitle);
            }
        });
    }

    public void setSubtitlePost(@StringRes final int subtitle) {
        if (toolbar != null) toolbar.post(new Runnable() {
            @Override
            public void run() {
                if (getSupportActionBar() != null) getSupportActionBar().setSubtitle(subtitle);
            }
        });
    }

    public void setSubtitleColorRes(@ColorRes int color) {
        setSubtitleColor(ContextCompat.getColor(this, color));
    }

    public void setSubtitleColor(@ColorInt int color) {
        if (toolbar != null) toolbar.setSubtitleTextColor(color);
    }

    public void removeSubtitle() {
        setSubtitle("");
    }

    public void setNavigationIcon(@DrawableRes int icon) {
        if (toolbar != null) toolbar.setNavigationIcon(icon);
    }

    public void setNavigationIcon(Drawable icon) {
        if (toolbar != null) toolbar.setNavigationIcon(icon);
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (toolbar != null) toolbar.setNavigationOnClickListener(onClickListener);
    }

    public void setFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void setPopBackStackOrFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popBackStackOrFinish();
            }
        });
    }

    public void setPopSupportBackStackOrFinishOnNavigationOnClickListener() {
        setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popSupportBackStackOrFinish();
            }
        });
    }

    public void setStatusBarColor(@ColorInt int color) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(color);
        }
    }

    public void setStatusBarColorRes(@ColorRes int color) {
        setStatusBarColor(ContextCompat.getColor(this, color));
    }

    public void setLightStatusBar(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            view.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
    }

    public void setLightStatusBar() {
        setLightStatusBar(findViewById(android.R.id.content));
    }

    public void popSupportBackStackOrFinish() {
        if (getSupportFragmentManager().getBackStackEntryCount() == 0) {
            finish();
            return;
        }
        getSupportFragmentManager().popBackStack();
    }

    public void popBackStackOrFinish() {
        if (getFragmentManager().getBackStackEntryCount() == 0) {
            finish();
            return;
        }
        getFragmentManager().popBackStack();
    }

    public Activity getActivity() {
        return this;
    }

    @NavUtils.Anim
    public int getAnimationType() {
        return animationType;
    }

    @Override
    public void finish() {
        super.finish();
        switch (animationType) {
            case NavUtils.HORIZONTAL_RIGHT:
                overridePendingTransition(R.anim.horizontal_right_finish_enter, R.anim.horizontal_right_finish_exit);
                break;
            case NavUtils.HORIZONTAL_LEFT:
                overridePendingTransition(R.anim.horizontal_left_finish_enter, R.anim.horizontal_left_finish_exit);
                break;
            case NavUtils.VERTICAL_BOTTOM:
                overridePendingTransition(R.anim.fade_in, R.anim.vertical_bottom_finish_exit);
                break;
            case NavUtils.VERTICAL_TOP:
                overridePendingTransition(R.anim.fade_in, R.anim.vertical_top_finish_exit);
                break;
            case NavUtils.NONE:
                overridePendingTransition(0, 0);
                break;
            case NavUtils.SYSTEM:
            default:
                break;
        }
    }

    @LayoutRes
    protected abstract int setLayoutResource();

    public int setToolbarId() {
        return R.id.default_toolbar_id;
    }

    public int setToolbarShadowId() {
        return R.id.default_toolbar_shadow_id;
    }

    @StyleRes
    public int setTheme() {
        return 0;
    }

}
