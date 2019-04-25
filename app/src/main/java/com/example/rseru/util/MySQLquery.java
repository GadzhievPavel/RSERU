package com.example.rseru.util;

import android.content.Context;

import com.example.rseru.R;

import java.util.Calendar;

public class MySQLquery {
    private static Context context;
    public MySQLquery(Context context){
        this.context=context;
    }
    private int nominator=0;
    private int denominator=0;
    Calendar calendar = Calendar.getInstance();
public String getDayOfWeek(){
    String dayOfWeek = null;

     switch (calendar.get(Calendar.DAY_OF_WEEK)){
         case 7:
             dayOfWeek = "'"+context.getString(R.string.saturday_RU)+"'";
             break;
         case 1:
             dayOfWeek ="'"+context.getString(R.string.sunday_RU)+"'";
             break;
         case 2:
             dayOfWeek = "'"+context.getString(R.string.monday_RU)+"'";
             break;
         case 3:
             dayOfWeek = "'"+context.getString(R.string.tuesday_RU)+"'";
             break;
         case 4:
             dayOfWeek = "'"+context.getString(R.string.wednesday_RU)+"'";
             break;
         case 5:
             dayOfWeek = "'"+context.getString(R.string.thursday_RU)+"'";
             break;
         case 6:
             dayOfWeek = "'"+context.getString(R.string.friday_RU)+"'";
             break;
     }
     return dayOfWeek;
}
public String getMonday(){
        return "'"+context.getString(R.string.monday_RU)+"'";
}
public String getTuesday(){
        return "'"+context.getString(R.string.tuesday_RU)+"'";
}
public String getWednesday(){
        return "'"+context.getString(R.string.wednesday_RU)+"'";
}
public String getThursday(){
        return "'"+context.getString(R.string.thursday_RU)+"'";
}
public String getFriday(){
        return "'"+context.getString(R.string.friday_RU)+"'";
}
public String getSaturday(){
        return "'"+context.getString(R.string.saturday_RU)+"'";
}
public String getSunday(){
        return "'"+context.getString(R.string.sunday_RU)+"'";
}
public int dayOfMounth(){
        return calendar.get(Calendar.DAY_OF_MONTH);
}
}
