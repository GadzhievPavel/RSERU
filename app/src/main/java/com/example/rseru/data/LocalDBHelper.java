package com.example.rseru.data;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;



public class LocalDBHelper extends SQLiteOpenHelper {

    static final String DB_NAME="localDB";
    static int VERSION=1;

    //tabel SETTINGS
    static final String SETTINGS_TABLE="'settings'";
    static final String START_DATE="'startDate'";
    static final String END_DATE="'endDate'";
    static final String IS_NUMERATOR="'true'";
    //tabel TIMES
    static final String ID="'id'";
    static final String FROM="'from'";
    static final String TO="'to'";
    //tabels timeLine
    static final String NUMERATOR_TABEL="'numerator'";
    static final String DENOMINATOR="'denominator'";
    static final String WEEKDAY="'weekday'";
    static final String TIME_ID="'timeId'";
    static final String DURATION="'duration'";
    static final String TITLE="'title'";
    static final String TYPE="'type'";
    static final String OPTIONAL="'optional'";
    static final String TEACHERS="'teachers'";
    static final String ROOM="'room'";
    static final String BUILD="'build'";
    static final String DATES="'dates'";

    public LocalDBHelper(Context context){
        super(context,DB_NAME,null,VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE "+SETTINGS_TABLE+"("+START_DATE+" TEXT NOT NULL,"+END_DATE+
                " TEXT NOT NULL, "+IS_NUMERATOR+" TEXT NOT NULL)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
