package com.example.youshengchang.androidsearchviewactionbar;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SearchRecentSuggestionsProvider;
import android.database.Cursor;
import android.net.Uri;

public class MyContentProvider extends SearchRecentSuggestionsProvider{
    public final static String AUTHORITY = "com.infotech.provider";
    public final static int MODE = DATABASE_MODE_QUERIES;




    public MyContentProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }


}
