/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrent;

import java.util.ArrayList;
/**
 *
 * @author Ricco
 */
public class CarData {
     ArrayList<Car> carList;

    public CarData() {
        carList = new ArrayList<Car>();
    }

    public void addCar(String carType, String polNum, String merk) {
        carList.add(new Car(carType, polNum, merk));
    }

    public void listOfCar() {
        System.out.println("==============================");
        System.out.println("DAFTAR MOBIL");
        System.out.println("==============================");
        for (Car i : carList) {
            System.out.print("TIPE MOBIL : " + i.getCarType());
            System.out.println();
            System.out.print("No. POLISI : " + i.getPolNum());
            System.out.println();
            System.out.print("MERK MOBIL : " + i.getMerk());
            System.out.println();
            System.out.println("==============================");
        }
    }
}
