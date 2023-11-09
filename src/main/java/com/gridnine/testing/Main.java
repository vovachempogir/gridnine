package com.gridnine.testing;

import com.gridnine.testing.dto.FlightBuilder;
import com.gridnine.testing.entity.Flight;
import com.gridnine.testing.service.impl.FlightBuilderServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();
        List<Flight> flightsDepartureBeforeNow = new FlightBuilderServiceImpl(flights)
                .departureBeforeNow();
        List<Flight> flightsArrivalBeforeDeparture = new FlightBuilderServiceImpl(flights)
                .arrivalBeforeDeparture();
        List<Flight> flightsTimeOnGroundMoreThanTwoHours = new FlightBuilderServiceImpl(flights)
                .sumTimeOnGroundMoreThanTwoHours();

        System.out.println("Тестовый набор прилетов:\n" + flights);
        System.out.println("Вылет до текущего момента времени:\n" + flightsDepartureBeforeNow);
        System.out.println("Сегменты с датой прилёта раньше даты вылета:\n" + flightsArrivalBeforeDeparture);
        System.out.println("Перелеты, где общее время, проведённое на земле, превышает два часа:\n" + flightsTimeOnGroundMoreThanTwoHours);
    }
}
