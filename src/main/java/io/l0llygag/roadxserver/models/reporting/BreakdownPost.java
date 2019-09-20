package io.l0llygag.roadxserver.models.reporting;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "breakdown")
public class BreakdownPost {
    private String name;
    private String mNo;
    private long timeStamp;
    private long lat;
    private long lon;
    private int carType;

    public BreakdownPost(String name, String mNo, long timeStamp, long lat, long lon, int carType) {
        this.name = name;
        this.mNo = mNo;
        this.timeStamp = timeStamp;
        this.lat = lat;
        this.lon = lon;
        this.carType = carType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getmNo() {
        return mNo;
    }

    public void setmNo(String mNo) {
        this.mNo = mNo;
    }

    public long getLat() {
        return lat;
    }

    public void setLat(long lat) {
        this.lat = lat;
    }

    public long getLon() {
        return lon;
    }

    public void setLon(long lon) {
        this.lon = lon;
    }

    public int getCarType() {
        return carType;
    }

    public void setCarType(int carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "BreakdownPost{" +
                "name='" + name + '\'' +
                ", mNo='" + mNo + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                ", carType=" + carType +
                '}';
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
