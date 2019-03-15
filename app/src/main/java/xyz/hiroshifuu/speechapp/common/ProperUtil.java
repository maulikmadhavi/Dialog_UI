package xyz.hiroshifuu.speechapp.common;

import android.content.Context;
import java.util.Properties;

public class ProperUtil {
    public static Properties getPropertiesURL(Context c) {
        Properties urlProps;
        Properties properties = new Properties();
        try {
            properties.load(c.getAssets().open("config"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        urlProps = properties;
        return urlProps;
    }
}
