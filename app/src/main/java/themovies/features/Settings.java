package themovies.features;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Aya Ezz on 25/3/16.
 */
public class Settings {
    Context context;
    private final String prefName = "Setting";
    private static final String sortBy = "sortBy";

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    public Settings(Context context) {
        this.context = context;
        preferences = context.getSharedPreferences(prefName,
                Context.MODE_PRIVATE);
        editor = context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                .edit();
    }

    public void setSortBy(String sortBy) {
        editor.putString(Settings.this.sortBy, sortBy);
        editor.apply();
    }

    public String getSortBy() {
        return preferences.getString(Settings.sortBy, "popularity.desc");
    }
}