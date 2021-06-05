package jrr.generics.building.validate;

import jrr.generics.building.Bath;
import jrr.generics.building.Building;
import jrr.generics.building.HighRise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingValidatorServiceTest {

    @Test
    void validate() {
        Building<Byte> highRise = new HighRise();
        highRise.setValue((byte) 100);
        var buildingValidatorService = new BuildingValidatorService();
        buildingValidatorService.validate(highRise);
    }

    @Test
    void validateBathTest() {
        Bath<Integer> bath = new Bath<>();
        bath.setValue(1000);
        var buildingValidatorService = new BuildingValidatorService();
//        buildingValidatorService.validate(bath);
    }
}