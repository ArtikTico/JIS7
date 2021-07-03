package strategies.joined.service;

import strategies.joined.Infantry;
import strategies.joined.InfantryType;

public interface InfantryService {
    Infantry createArcher(InfantryType infantryType, Integer moveSpeed, Integer durability, Integer range);
    Infantry createKnight(InfantryType infantryType, Integer moveSpeed, Integer durability, Boolean hasShield);
}
