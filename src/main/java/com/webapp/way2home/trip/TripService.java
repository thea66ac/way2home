package com.webapp.way2home.trip;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class TripService {

    public List<Trip> getTrips() {
        return List.of(
                new Trip(1, "Wien", "Grozny",
                        LocalDate.of(2021, Month.JULY, 25),
                        LocalDate.of(2021, Month.AUGUST, 28)),
                new Trip(1, "Grozny", "Wien",
                        LocalDate.of(2021, Month.AUGUST, 17),
                        LocalDate.of(2021, Month.AUGUST, 20))
        );
    }
}
