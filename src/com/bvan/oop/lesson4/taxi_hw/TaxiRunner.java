package com.bvan.oop.lesson4.taxi_hw;

/**
 * @author bvanchuhov
 */
public class TaxiRunner {

    public static void main(String[] args) {
        TaxiRides taxiRides = new TaxiRides();
        taxiRides.addRide(new TaxiRide(4, 15, 30));
        taxiRides.addRide(new TaxiRide(2, 20, 40));

        long familyPrice = taxiRides.getPrice(new FamilyTaxiTariff());
        System.out.println("familyPrice = " + familyPrice);

        long standardPrice = taxiRides.getPrice(new StandardTaxiTariff());
        System.out.println("standardPrice = " + standardPrice);
    }
}
