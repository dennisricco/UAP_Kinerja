/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;

/**
 *
 * @author Ricco
 */
public class CarRent {
    private int rentDur;
    private Car car;
    private CarRider rider;

    public CarRent(CarRider rider, Car car, int rentDur) {
        this.rentDur = rentDur;
        this.car = car;
        this.rider = rider;
    }

    public int getRentDur() {
        return rentDur;
    }

    public Car getCar() {
        return car;
    }

    public CarRider getRider() {
        return rider;
    }

}
