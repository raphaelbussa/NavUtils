package rebus.navutils.sample;

import android.os.Bundle;
import android.support.v4.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import rebus.navutils.NavUtils;
import rebus.navutils.activity.ActivityUtils;
import rebus.navutils.activity.BaseActivity;

public class SceneTransitionActivity extends BaseActivity {

    private ImageView testImage;
    private TextView testTitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testImage = findViewById(R.id.test_image);
        testTitle = findViewById(R.id.test_title);

        findViewById(R.id.result).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Pair<View, String> pair1 = Pair.create((View) testImage, "test_image");
                Pair<View, String> pair2 = Pair.create((View) testTitle, "test_title");

                ActivityUtils.Builder(getActivity())
                        .animationType(NavUtils.HORIZONTAL_RIGHT)
                        .sceneTransition(testImage)
                        .start(ResultSceneTransitionActivity.class);
            }
        });
    }

    @Override
    protected int setLayoutResource() {
        return R.layout.activity_scene_transition;
    }
}
