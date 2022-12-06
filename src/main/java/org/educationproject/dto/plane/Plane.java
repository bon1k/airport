package org.educationproject.dto.plane;

import lombok.Data;

@Data
public class Plane {
    String sideNumber;
    String location;
    int flightRange;
    int passengerCapacity;
    int fuelPerHundredKilometers;

}
