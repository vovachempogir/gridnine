package com.gridnine.testing.service;

import com.gridnine.testing.entity.Flight;

import java.util.List;

public interface FlightBuilderService {

    List<Flight> departureBeforeNow();

    List<Flight> arrivalBeforeDeparture();

    List<Flight> sumTimeOnGroundMoreThanTwoHours();
}
