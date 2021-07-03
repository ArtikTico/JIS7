package strategies.mappedbysuperclass.service;

import strategies.mappedbysuperclass.entity.Vehicle;

public interface VehicleService {

    Vehicle createTruck(String name, Integer seats, Integer maxLoad, Boolean sleeperCab);

    Vehicle createTank(String name, Integer seats, Integer firePower);
}
