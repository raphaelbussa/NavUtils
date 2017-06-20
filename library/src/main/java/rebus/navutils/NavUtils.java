package rebus.navutils;

import android.support.annotation.IntDef;
import android.support.annotation.IntRange;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by raphaelbussa on 19/05/17.
 */

public class NavUtils {

    public static final String NAV_ANIM = "rebus.navutils.NavUtils.ANIM_ACTIVITY";

    public static final int SYSTEM = -1;
    public static final int NONE = 0;
    public static final int HORIZONTAL_RIGHT = 1;
    public static final int HORIZONTAL_LEFT = 2;
    public static final int VERTICAL_BOTTOM = 3;
    public static final int VERTICAL_TOP = 4;

    @IntDef({SYSTEM, NONE, HORIZONTAL_RIGHT, HORIZONTAL_LEFT, VERTICAL_BOTTOM, VERTICAL_TOP})
    @IntRange(from = -1, to = 4)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Anim {
    }

}
