package com.bridgelabz.cabinvoice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCaseCarInvoice {

    CarInvoice carinvoice = new CarInvoice();

    @Test
    void TotalFareForOneRide() {
        int distance = 4; //kilometer
        int time = 20; //minute
        //carInvice(Distance_In_Kilometer,Time_In_Minute)
        int returnValue = carinvoice.carInvoice(distance, time);
        //assertEquals(Experted(Distance_In_Kilometer*MAXIMUM_COST_PER_KILOMETER + Time_In_Minute*COST_PER_MINUTE),Actual_Return_Value)
        Assertions.assertEquals(60, returnValue, 0.0);
    }

    @Test
    void TotalMinFareForOneRide() {
        double distance = 0.2; //kilometer
        int time = 1; //minute
        double returnFare = carinvoice.MinFare(distance, time);
        Assertions.assertEquals(5.0, returnFare); //(assertEquals(expected,actual,delta)
    }

    @Test
    void TotalFareForMultipleRide() {
        // multiple ride value store int array
        Rides[] ride =
                {
                        //take value to constructer
                        new Rides(10.0, 2),
                        new Rides(20.0, 4)
                };
        //return value from caltulatin method
        double returnFare = carinvoice.MultipleRide(ride);
        Assertions.assertEquals(204, returnFare, 0.0);
        //return value from totalcountofrides
        int returnRideCount = carinvoice.calulate_rides(ride);
        Assertions.assertEquals(2, returnRideCount, 0.0);
        //return average for per ride
        double return_average = carinvoice.caltulateAverage(returnFare, returnRideCount);
        Assertions.assertEquals(102, return_average, 0.0);
    }

    //step 5 nrmal ride and primium ride
    @Test
    void PremiumRides() {
        double distance = 4;
        int time = 2;
        double returnPremiumRideFare = carinvoice.caluculatePrimiumFare(distance, time);
        Assertions.assertEquals(64, returnPremiumRideFare);
        ;

    }

}
