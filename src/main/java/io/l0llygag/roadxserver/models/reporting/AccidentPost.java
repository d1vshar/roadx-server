package io.l0llygag.roadxserver.models.reporting;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "accident")
public class AccidentPost {
    private String name;
    private String mNo;
    private long timeStamp;
    private long lat;
    private long lon;

    public AccidentPost(String name, String mNo, long timeStamp, long lat, long lon) {
        this.name = name;
        this.mNo = mNo;
        this.timeStamp = timeStamp;
        this.lat = lat;
        this.lon = lon;
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

    @Override
    public String toString() {
        return "AccidentPost{" +
                "name='" + name + '\'' +
                ", mNo='" + mNo + '\'' +
                ", lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
