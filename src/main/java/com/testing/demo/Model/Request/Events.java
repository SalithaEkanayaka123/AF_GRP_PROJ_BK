package com.testing.demo.Model.Request;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Events {
    @Id
    private String id;
    private String eventName;
    private String eventPlace;
    private Date datetime;
    private String organizerName;
    private String eventType;
    private String mainSpeaker;
    private String description;
    private String limitOfPeople;
    private String sponsor;
    private String status;

    //DEFAULT
    public Events (){

    }

    //OVERLOADED
    public Events(String id, String eventName, String eventPlace, Date datetime, String organizerName, String eventType, String mainSpeaker, String description, String limitOfPeople, String sponsor, String status) {
        this.id = id;
        this.eventName = eventName;
        this.eventPlace = eventPlace;
        this.datetime = datetime;
        this.organizerName = organizerName;
        this.eventType = eventType;
        this.mainSpeaker = mainSpeaker;
        this.description = description;
        this.limitOfPeople = limitOfPeople;
        this.sponsor = sponsor;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventPlace() {
        return eventPlace;
    }

    public void setEventPlace(String eventPlace) {
        this.eventPlace = eventPlace;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getOrganizerName() {
        return organizerName;
    }

    public void setOrganizerName(String organizerName) {
        this.organizerName = organizerName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getMainSpeaker() {
        return mainSpeaker;
    }

    public void setMainSpeaker(String mainSpeaker) {
        this.mainSpeaker = mainSpeaker;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLimitOfPeople() {
        return limitOfPeople;
    }

    public void setLimitOfPeople(String limitOfPeople) {
        this.limitOfPeople = limitOfPeople;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
