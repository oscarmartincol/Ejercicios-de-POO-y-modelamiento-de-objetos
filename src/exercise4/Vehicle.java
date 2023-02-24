package exercise4;

import java.util.Date;

public class Vehicle {
    private int passengersNumber;
    private boolean crewPresence;
    private int wheelsNumber;
    private Date registrationDate;
    private String scrollMeans;

    public Vehicle(){

    }
    public Vehicle(int nPassengers, boolean crewPresence, int wheelsNumber,
                   Date registrationDate, String scrollMeans) {
        this.passengersNumber = nPassengers;
        this.crewPresence = crewPresence;
        this.wheelsNumber = wheelsNumber;
        this.registrationDate = registrationDate;
        this.scrollMeans = scrollMeans;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }

    public boolean isCrewPresence() {
        return crewPresence;
    }

    public void setCrewPresence(boolean crewPresence) {
        this.crewPresence = crewPresence;
    }

    public int getWheelsNumber() {
        return wheelsNumber;
    }

    public void setWheelsNumber(int wheelsNumber) {
        this.wheelsNumber = wheelsNumber;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getScrollMeans() {
        return scrollMeans;
    }

    public void setScrollMeans(String scrollMeans) {
        this.scrollMeans = scrollMeans;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "passengersNumber=" + passengersNumber +
                ", crewPresence=" + crewPresence +
                ", wheelsNumber=" + wheelsNumber +
                ", registrationDate=" + registrationDate +
                ", scrollMeans='" + scrollMeans + '\'' +
                '}';
    }
}
