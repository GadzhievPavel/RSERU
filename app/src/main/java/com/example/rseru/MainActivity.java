package com.example.rseru;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.rseru.data.DatabaseHelper;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    private DatabaseHelper databaseHelper;
    private SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseHelper = new DatabaseHelper(this);
        try{
            databaseHelper.updateDataBase();
        } catch (IOException e) {
            throw new Error("UnableToUpdateDatabase");
        }
        try{
            db=databaseHelper.getWritableDatabase();
        }catch (SQLException e){
            throw e;
        }
        textView=(TextView)findViewById(R.id.textView);
        String[] lessons=new String[4];
        Cursor cursor = db.rawQuery("SELECT * FROM timeline" +
                " WHERE dayweek='Вторник'AND (nominator=1 or denominator = 0)" +
                " AND (day=12 OR day=0) AND (mounth = 3 OR mounth=0)",null);
        cursor.moveToFirst();
        for(int i=0;!cursor.isAfterLast();i++) {
            lessons[i]=cursor.getString(4)+" "+cursor.getString(3)+" "+cursor.getString(2)+
                    " "+cursor.getString(5)+" "+cursor.getString(6)+" "+cursor.getString(9)+"!";
            cursor.moveToNext();
        }
        cursor.close();
        textView.setText(lessons[0]);
    }
}
