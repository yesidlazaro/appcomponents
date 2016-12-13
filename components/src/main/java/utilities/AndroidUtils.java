package utilities;

import android.content.Context;
import android.support.annotation.StringRes;

/**
 * Created by Yesid Lazaro on 12/1/16.
 */

public class AndroidUtils {

    public static String getString(Context context, @StringRes int resId) {
        return context.getString(resId);
    }
}
