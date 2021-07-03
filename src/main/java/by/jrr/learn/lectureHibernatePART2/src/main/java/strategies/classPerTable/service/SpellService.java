package strategies.classPerTable.service;

import strategies.classPerTable.Spell;

public interface SpellService {

//    Spell createUndefinedSpell(Integer castDuration, Integer damage);

    Spell createFireSpell(Integer castDuration, Integer damage, Integer burningDuration);

    Spell createFrostSpell(Integer castDuration, Integer damage, Boolean hasFrozen);
}
