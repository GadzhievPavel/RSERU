package com.example.rseru.data;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class TimelineDBHelper extends SQLiteOpenHelper {
    private static String DB_PATH;
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
    private static Context context;
    public final static int VERSHION=1;
   public TimelineDBHelper(Context context){
        super(context,DB_NAME,null,VERSHION);
        this.context=context;
        DB_PATH=context.getFilesDir().getPath()+DB_NAME;
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    public void createDB(){
        InputStream inputStream=null;
        OutputStream outputStream=null;
        try {
            File file = new File(DB_PATH);
            if (!file.exists()){
                this.getReadableDatabase();
                inputStream=context.getAssets().open(DB_NAME);
                String outFileName = DB_PATH;

                outputStream=new FileOutputStream(outFileName);
                byte[] buffer = new byte[1024];
                int length;
                while ((length=inputStream.read(buffer))>0){
                    outputStream.write(buffer,0,length);
                }
                outputStream.flush();
                outputStream.close();
                inputStream.close();
            }
        } catch (IOException e) {
            Log.e("Open Data Base","can't read data base");
        }
    }

    public SQLiteDatabase open() throws SQLException{
       return SQLiteDatabase.openDatabase(DB_PATH,null,SQLiteDatabase.OPEN_READONLY);
    }
}
