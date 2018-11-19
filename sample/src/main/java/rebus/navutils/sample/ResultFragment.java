package rebus.navutils.sample;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import rebus.navutils.NavUtils;
import rebus.navutils.fragment.BaseFragment;
import rebus.navutils.fragment.FragmentUtils;

public class ResultFragment extends BaseFragment implements View.OnClickListener {

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        findViewById(R.id.new_fragment).setOnClickListener(this);
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.fragment_result;
    }

    @SuppressWarnings("WrongConstant")
    @Override
    public void onClick(View v) {
        int navAnim = getArguments().getInt(NavUtils.NAV_ANIM);
        Bundle bundle = new Bundle();
        bundle.putInt(NavUtils.NAV_ANIM, navAnim);
        switch (v.getId()) {
            case R.id.new_fragment:
                FragmentUtils.Builder(getFragmentManager(), R.id.container)
                        .animationType(navAnim)
                        .tag("FROM_FRAGMENT")
                        .addToBackStack()
                        .arguments(bundle)
                        .replace(getActivity(), ResultFragment.class);
                break;
        }
    }
}
