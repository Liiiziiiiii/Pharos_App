package com.example.app.date;


public class DataClass {
    private String dataTitle;
    private float dataHumidity;
    private String dataImage;
    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDataTitle() {
        return dataTitle;
    }

    public float getDataHumidity() {
        return dataHumidity;
    }





    public String getDataImage() {
        return dataImage;
    }

    public DataClass(String dataTitle, float dataHumidity, String dataImage) {
        this.dataTitle = dataTitle;
        this.dataHumidity = dataHumidity;
        this.dataImage = dataImage;
    }

    public DataClass() {
    }
}



