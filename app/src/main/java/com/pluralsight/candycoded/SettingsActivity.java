package com.pluralsight.candycoded;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import androidx.annotation.Nullable;


@SuppressLint("Registered")
public class SettingsActivity extends PreferenceActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //addPreferencesFromResource();
    }
}
