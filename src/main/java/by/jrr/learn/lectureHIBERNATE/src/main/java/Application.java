import strategies.mappedbysuperclass.entity.Vehicle;
import strategies.mappedbysuperclass.service.VehicleService;
import strategies.mappedbysuperclass.service.VehicleServiceImpl;


public class Application {
    public static void main(String[] args) {
        VehicleService vehicleService = new VehicleServiceImpl();
        Vehicle e100 = vehicleService.createTruck("E100", 2, 10000, true);
        Vehicle T54 = vehicleService.createTank("E100", 5, 380);
    }
}
