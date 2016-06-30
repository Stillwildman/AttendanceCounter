package com.brack.attendancecounter;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

/**
 * Created by vincent.chang on 2016/6/29.
 */
public class SettingManager {

    private static final String TAG = "SettingManager";

    private static final String PREF_TOTAL_COUNTS_MALE_TAIWAN = "TotalCountMaleUSA";
    private static final String PREF_TOTAL_COUNTS_FEMALE_USA = "TotalCountFemaleUSA";
    private static final String PREF_TOTAL_COUNTS_MALE_JAPAN = "TotalCountMaleJapan";
    private static final String PREF_TOTAL_COUNTS_FEMALE_JAPAN = "TotalCountFemaleJapan";
    private static final String PREF_TOTAL_COUNTS_MALE_UK = "TotalCountMaleUK";
    private static final String PREF_TOTAL_COUNTS_FEMALE_UK = "TotalCountFemaleUK";
    private static final String PREF_TOTAL_COUNTS_MALE_FRANCE = "TotalCountMaleFrance";
    private static final String PREF_TOTAL_COUNTS_FEMALE_FRANCE = "TotalCountFemaleFrance";

    private static final String PREF_BUTTON_LOCKS = "ButtonLocks";

    private static SharedPreferences prefs;
    private static SharedPreferences.Editor editor;

    private static Context appContext() {
        return AppController.getInstance().getAppContext();
    }

    public static void initPreferences() {
        if (prefs == null || editor == null) {
            prefs = PreferenceManager.getDefaultSharedPreferences(appContext());
            editor = prefs.edit();

            Log.i(TAG, "PreferenceInit!!");
        }
        else
            Log.i(TAG, "Pref Already Init!!");
    }

    public static void setTotalCountMaleUSA(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_MALE_TAIWAN, counts).apply();
    }

    public static int getTotalCountMaleUSA() {
        return prefs.getInt(PREF_TOTAL_COUNTS_MALE_TAIWAN, 0);
    }

    public static void setTotalCountFemaleUSA(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_FEMALE_USA, counts).apply();
    }

    public static int getTotalCountFemaleUSA() {
        return prefs.getInt(PREF_TOTAL_COUNTS_FEMALE_USA, 0);
    }

    public static void setTotalCountMaleJapan(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_MALE_JAPAN, counts).apply();
    }

    public static int getTotalCountMaleJapan() {
        return prefs.getInt(PREF_TOTAL_COUNTS_MALE_JAPAN, 0);
    }

    public static void setTotalCountFemaleJapan(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_FEMALE_JAPAN, counts).apply();
    }

    public static int getTotalCountFemaleJapan() {
        return prefs.getInt(PREF_TOTAL_COUNTS_FEMALE_JAPAN, 0);
    }

    public static void setTotalCountMaleUK(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_MALE_UK, counts).apply();
    }

    public static int getTotalCountMaleUK() {
        return prefs.getInt(PREF_TOTAL_COUNTS_MALE_UK, 0);
    }

    public static void setTotalCountFemaleUK(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_FEMALE_UK, counts).apply();
    }

    public static int getTotalCountFemaleUK() {
        return prefs.getInt(PREF_TOTAL_COUNTS_FEMALE_UK, 0);
    }

    public static void setTotalCountMaleFrance(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_MALE_FRANCE, counts).apply();
    }

    public static int getTotalCountMaleFrance() {
        return prefs.getInt(PREF_TOTAL_COUNTS_MALE_FRANCE, 0);
    }

    public static void setTotalCountFemaleFrance(int counts) {
        editor.putInt(PREF_TOTAL_COUNTS_FEMALE_FRANCE, counts).apply();
    }

    public static int getTotalCountFemaleFrance() {
        return prefs.getInt(PREF_TOTAL_COUNTS_FEMALE_FRANCE, 0);
    }

    public static void setButtonEnable(boolean enable) {
        editor.putBoolean(PREF_BUTTON_LOCKS, enable).apply();
    }

    public static boolean getButtonEnable() {
        return prefs.getBoolean(PREF_BUTTON_LOCKS, true);
    }
}
