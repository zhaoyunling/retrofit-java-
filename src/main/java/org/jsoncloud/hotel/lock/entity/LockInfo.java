package org.jsoncloud.hotel.lock.entity;

import java.util.Date;

/**
 * Created by zhaolingyun on 2018/3/5.
 */
public class LockInfo {

    private String hotelId;

    private String roomId;

    private String buildingId;

    private String timeFrom;

    private String timeTo;

    private String dateFrom;

    private String dateTo;

    private Integer online;

    private Integer electric;

    public LockInfo() {
        super();
    }

    public LockInfo(String hotelId, String buildingId, String roomId) {
        this.hotelId = hotelId;
        this.roomId = roomId;
        this.buildingId = buildingId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getBuildingId() {
        return buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(String timeFrom) {
        this.timeFrom = timeFrom;
    }

    public String getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(String timeTo) {
        this.timeTo = timeTo;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public void setDateTo(String dateTo) {
        this.dateTo = dateTo;
    }

    public Integer getOnline() {
        return online;
    }

    public void setOnline(Integer online) {
        this.online = online;
    }

    public Integer getElectric() {
        return electric;
    }

    public void setElectric(Integer electric) {
        this.electric = electric;
    }
}
