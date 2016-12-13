package utilities;

import android.util.Log;

public class Logger {

    private static final boolean DEGUB_STATUS = true;
    private static final String TAG = "Logger :|";

    public static void d(String message) {
        if (DEGUB_STATUS)
            Log.d(TAG, message);
    }

    public static void i(String message) {
        if (DEGUB_STATUS)
            Log.i(TAG, message);
    }

    public static void e(final String message, Throwable e) {
        if (e != null)
            Log.e(TAG, message, e);
        else
            Log.e(TAG, message);
    }

}
