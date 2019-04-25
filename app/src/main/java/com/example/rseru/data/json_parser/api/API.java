package com.example.rseru.data.json_parser.api;

import com.example.rseru.data.json_parser.api.source.GroupTime;
import com.example.rseru.data.json_parser.api.source.TimeList;
import com.example.rseru.data.json_parser.api.source.subsource.Settings;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface API {
    @GET("settings.json")
    Call<Settings> getSettings();
    @GET("{id}"+".json")
    Call<GroupTime> getGroup(@Path("id") int id);
    @GET("times.json")
    Call<TimeList> getTimeList();

}
