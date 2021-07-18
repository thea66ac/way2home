package com.webapp.way2home.trip;

import java.time.LocalDate;

public class Trip {
    private long id;
    private String from;
    private String to;
    private LocalDate depart;
    private LocalDate arrival;

    public Trip(long id, String from, String to, LocalDate depart, LocalDate arrival) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.depart = depart;
        this.arrival = arrival;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public LocalDate getDepart() {
        return depart;
    }

    public void setDepart(LocalDate depart) {
        this.depart = depart;
    }

    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", depart=" + depart +
                ", arrival=" + arrival +
                '}';
    }
}
