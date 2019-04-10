package com.example.rseru.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TimelineDBHelper extends SQLiteOpenHelper {
    public final static String DB_NAME="rsreu.db";
    public final static String TABEL_NAME="timeline";
    public final static String COLUMN_GROUP="group";
    public final static String COLUMN_TYPE_LESSON="typeLesson";
    public final static String COLUMN_SUBJECT="subject";
    public final static String COLUMN_TEACHER="teacher";
    public final static String COLUMN_START_TIME="startTime";
    public final static String COLUMN_FINISH_TIME="finishTime";
    public final static String COLUMN_NOMINATOR="nominator";
    public final static String COLUMN_DENOMINATOR="denominator";
    public final static String COLUMN_DAYWEEK="dayweek";
    public final static String COLUMN_MOUNTH="mounth";
    public final static String COLUMN_AUDITORY="auditory";
    public fi
    TimelineDBHelper(Context context){
        super(context,DB_NAME,null,);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
