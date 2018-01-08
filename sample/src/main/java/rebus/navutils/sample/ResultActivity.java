package rebus.navutils.sample;

import android.os.Bundle;

import rebus.navutils.NavUtils;
import rebus.navutils.activity.BaseActivity;
import rebus.navutils.fragment.v4.FragmentUtils;

public class ResultActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("NavUtils Utils");
        setNavigationIcon(R.drawable.ic_back);
        setFinishOnNavigationOnClickListener();
        Bundle bundle = new Bundle();
        bundle.putInt(NavUtils.NAV_ANIM, getAnimationType());
        switch (getAnimationType()) {
            case NavUtils.HORIZONTAL_RIGHT:
                FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
                        .animationType(NavUtils.HORIZONTAL_RIGHT)
                        .noEnterAnimations(true)
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                setSubtitle("ResultActivity NavUtils.HORIZONTAL_RIGHT");
                break;
            case NavUtils.HORIZONTAL_LEFT:
                FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
                        .animationType(NavUtils.HORIZONTAL_LEFT)
                        .noEnterAnimations(true)
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                setSubtitle("ResultActivity NavUtils.HORIZONTAL_LEFT");
                break;
            case NavUtils.VERTICAL_BOTTOM:
                FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
                        .animationType(NavUtils.VERTICAL_BOTTOM)
                        .noEnterAnimations(true)
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                setSubtitle("ResultActivity NavUtils.VERTICAL_BOTTOM");
                break;
            case NavUtils.VERTICAL_TOP:
                FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
                        .animationType(NavUtils.VERTICAL_TOP)
                        .noEnterAnimations(true)
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                setSubtitle("ResultActivity NavUtils.VERTICAL_TOP");
                break;
            case NavUtils.NONE:
                FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
                        .animationType(NavUtils.NONE)
                        .noEnterAnimations(true)
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                setSubtitle("ResultActivity NavUtils.NONE");
                break;
            case NavUtils.SYSTEM:
                FragmentUtils.Builder(getSupportFragmentManager(), R.id.container)
                        .animationType(NavUtils.SYSTEM)
                        .noEnterAnimations(true)
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                setSubtitle("ResultActivity NavUtils.SYSTEM");
                break;
        }
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.activity_result;
    }

}
