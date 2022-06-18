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
public class RentArchive {
    ArrayList<CarRent> rentData;

    public RentArchive() {
        rentData = new ArrayList<CarRent>();
    }

    public void Rent(CarRider rider, Car car, int rentDur) {

        if (car.isStatus() == true) {
            System.out.println("MOBIL BERHASIL DISEWA");
            car.setStatus(false);
            rentData.add(new CarRent(rider, car, rentDur));
        } else {
            System.out.println("MAAF, MOBIL SUDAH DISEWA");
        }
    }

    public void info() {
        System.out.println("==============================");
        System.out.println("INFORMASI PELANGGAN");
        System.out.println("==============================");
        for (CarRent i : rentData) {
            System.out.println("NAMA PEMINJAM : " + i.getRider().getName());
            System.out.println("TIPE MOBIL    : " + i.getCar().getCarType());
            System.out.println("NO. POLISI    : " + i.getCar().getPolNum());
            System.out.println("LAMA RENTAL   : " + i.getRentDur());

        }

    }

}
