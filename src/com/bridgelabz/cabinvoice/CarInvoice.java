package com.bridgelabz.cabinvoice;
import static org.junit.jupiter.api.DynamicTest.stream;
public class CarInvoice {

        final static int MAXIMUM_COST_PER_KILOMETER=10;
        final static int COST_PER_MINUTE=1;
        final static int MINIMUM_FARE=5;
        //prremiumFare
        final static int PREMIUM_MAXIMUM_COST_PER_KILOMETER=15;
        final static int PREMIUM_COST_PER_MINUTE=2;
        final static int PREMIUM_MINIMUM_FARE=20;

        //calculate carinvice
        static int carInvoice(int kilometer,int minute)
        {
            int invoice=(kilometer*MAXIMUM_COST_PER_KILOMETER)+(minute*COST_PER_MINUTE);
            return invoice;
        }
        //calculate minimun fare calculation
        public double MinFare(double kilometer , int minute) {

            double invoice=(kilometer*MAXIMUM_COST_PER_KILOMETER)+(minute*COST_PER_MINUTE);
            if(invoice<MINIMUM_FARE)
            {
                return MINIMUM_FARE;
            }
            return invoice;
        }
        //calculate multiple ride fare
        public double MultipleRide(Rides[] ride) {
            double returnFare=0.0;
            //using for loop check calculate for every array
            for(Rides rides:ride)
            {
                returnFare=this.MinFare(rides.distance, rides.time);
            }
            return returnFare;
        }
        public int calulate_rides(Rides[]ride)
        {
            int rides_count=0;
            for(Rides rides:ride)
            {
                rides_count++;
            }
            return rides_count;
        }
        public double caltulateAverage(double returnFare, int returnRideCount) {
            double returnAverage=returnFare/returnRideCount;
            return returnAverage;
        }
        public double caluculatePrimiumFare(double distance, int time) {
            double returnPremiumFare=PREMIUM_MAXIMUM_COST_PER_KILOMETER*distance+ PREMIUM_COST_PER_MINUTE*time;
            if(returnPremiumFare<20)
            {
                return PREMIUM_MINIMUM_FARE;
            }
            return returnPremiumFare;
        }
}
