package com.example.rseru.data.json_parser.api.source.subsource;

import com.google.gson.annotations.SerializedName;

public class Settings {
    @SerializedName("startDate")
    private String startDate;
    @SerializedName("endDate")
    private String endDate;
    @SerializedName("isNumerator")
    boolean isNumerator;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean isNumerator() {
        return isNumerator;
    }

    public void setNumerator(boolean numerator) {
        isNumerator = numerator;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }


}
