package com.driver.controllers;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;

import java.util.Date;


public class AirportService {

    private AirportRepository airportRepository = new AirportRepository();
    public void addAirport(Airport airport) {
        airportRepository.addAirport(airport);
    }

    public String getLargestAirportName() {
        return airportRepository.getLargestAirportName();
    }

    public double getShortestTime(City fromCity, City toCity) {
        return airportRepository.getShortestTime(fromCity, toCity);
    }

    public void addFlight(Flight flight) {
        airportRepository.addFlight(flight);
    }

    public void addPassenger(Passenger passenger) {
        airportRepository.addPassenger(passenger);
    }

    public String bookATicket(Integer flightId, Integer passengerId) {
        return airportRepository.bookATicket(flightId, passengerId);
    }

    public int calculateFare(Integer flightId) {
        return airportRepository.calculateFare(flightId);
    }

    public String cancelTicket(Integer flightId, Integer passengerId) {
        return airportRepository.cancelTicket(flightId, passengerId);
    }

    public int countOfBookingsDoneByPassengerAllCombined(Integer passengerId) {
        return airportRepository.countOfBookingsDoneByPassengerAllCombined(passengerId);
    }

    public String getAirportNameFromFlightId(Integer flightId) {
        return airportRepository.getAirportNameFromFlightId(flightId);
    }

    public int getNumberOfPeople(Date date, String airportName) {
        return airportRepository.getNumberOfPeople(date, airportName);
    }

    public int calculateRevenue(Integer flightId) {
        return airportRepository.calculateRevenue(flightId);
    }
}
