package strategies.joined;

import strategies.joined.service.InfantryService;
import strategies.joined.service.InfantryServiceImpl;

public class AppInfantry {
    public static void main(String[] args) {
        InfantryService infantryService = new InfantryServiceImpl();
        infantryService.createArcher(InfantryType.LIGHT, 290, 550, 600);
        infantryService.createKnight(InfantryType.HEAVY, 300, 1000, true);
    }
}
