package rebus.navutils.sample;

import android.os.Bundle;
import android.view.View;

import rebus.navutils.NavUtils;
import rebus.navutils.activity.ActivityUtils;
import rebus.navutils.activity.BaseActivity;
import rebus.navutils.chrome.ChromeUtils;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("NavUtils Utils");
        setSubtitle("MainActivity");
        setIcon(R.mipmap.ic_launcher);
        setFinishOnNavigationOnClickListener();
        setStatusBarColorRes(R.color.colorAccent);
        setLightStatusBar();
        findViewById(R.id.horizontal_right).setOnClickListener(this);
        findViewById(R.id.horizontal_left).setOnClickListener(this);
        findViewById(R.id.vertical_bottom).setOnClickListener(this);
        findViewById(R.id.vertical_top).setOnClickListener(this);
        findViewById(R.id.none).setOnClickListener(this);
        findViewById(R.id.system).setOnClickListener(this);
        findViewById(R.id.chrome).setOnClickListener(this);
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.activity_main;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.horizontal_right:
                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.HORIZONTAL_RIGHT)
                        .start(ResultActivity.class);
                break;
            case R.id.horizontal_left:
                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.HORIZONTAL_LEFT)
                        .start(ResultActivity.class);
                break;
            case R.id.vertical_bottom:
                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.VERTICAL_BOTTOM)
                        .start(ResultActivity.class);
                break;
            case R.id.vertical_top:
                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.VERTICAL_TOP)
                        .start(ResultActivity.class);
                break;
            case R.id.none:
                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.NONE)
                        .start(ResultActivity.class);
                break;
            case R.id.system:
                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.SYSTEM)
                        .start(ResultActivity.class);
                break;
            case R.id.chrome:
                ChromeUtils.Builder(getActivity())
                        .setShowTitle(true)
                        .animationType(NavUtils.VERTICAL_BOTTOM)
                        .setToolbarColorRes(R.color.colorAccent)
                        .load("https://github.com/rebus007/NavUtils");
                break;
        }

    }
}
