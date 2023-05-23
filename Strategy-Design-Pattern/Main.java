import ConcreteStrategy.NormalDriveCapability;
import ConcreteStrategy.SpecialDrivingCapability;
import Context.Vehicle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Vehicle passengerVehicle = new Vehicle("grey", new NormalDriveCapability(), 4);
        Vehicle sportsVehicle = new Vehicle("red", new SpecialDrivingCapability(), 2);
        Vehicle offRoadVehicle = new Vehicle("black", new SpecialDrivingCapability(), 1);

        System.out.print("PASSENGER VEHICLE : ");
        passengerVehicle.drive();
        System.out.print("SPORTS VEHICLE : ");
        sportsVehicle.drive();
        System.out.print("OFF-ROAD VEHICLE : ");
        offRoadVehicle.drive();
    }
}
