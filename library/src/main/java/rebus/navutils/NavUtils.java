package rebus.navutils;

import android.content.pm.ActivityInfo;
import android.os.Build;
import android.support.annotation.IntDef;
import android.support.annotation.IntRange;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by raphaelbussa on 19/05/17.
 */

public class NavUtils {

    public static final String NAV_ANIM = "rebus.navutils.NavUtils.NAV_ANIM";
    public static final String NAV_SCENE_TRANSITION = "rebus.navutils.NavUtils.NAV_SCENE_TRANSITION";

    public static final int NULL = -100;

    public static final int SYSTEM = -1;
    public static final int NONE = 0;
    public static final int HORIZONTAL_RIGHT = 1;
    public static final int HORIZONTAL_LEFT = 2;
    public static final int VERTICAL_BOTTOM = 3;

    public static final int VERTICAL_TOP = 4;
    @IntDef({SYSTEM,
            NONE,
            HORIZONTAL_RIGHT,
            HORIZONTAL_LEFT,
            VERTICAL_BOTTOM,
            VERTICAL_TOP
    })
    @IntRange(from = -1, to = 4)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Anim {
    }

    @IntDef({NULL,
            ActivityInfo.SCREEN_ORIENTATION_BEHIND,
            ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR,
            ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE,
            ActivityInfo.SCREEN_ORIENTATION_NOSENSOR,
            ActivityInfo.SCREEN_ORIENTATION_PORTRAIT,
            ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE,
            ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT,
            ActivityInfo.SCREEN_ORIENTATION_SENSOR,
            ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE,
            ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT,
            ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED,
            ActivityInfo.SCREEN_ORIENTATION_USER
    })
    @IntRange(from = -1, to = 4)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    public static boolean LOLLIPOP() {
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP;
    }

}
