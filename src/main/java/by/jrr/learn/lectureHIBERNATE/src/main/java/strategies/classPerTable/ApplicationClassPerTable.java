package strategies.classPerTable;

import strategies.classPerTable.service.SpellService;
import strategies.classPerTable.service.SpellServiceImpl;

public class ApplicationClassPerTable {
    public static void main(String[] args) {
        SpellService spellService = new SpellServiceImpl();
//        spellService.createUndefinedSpell(2, 200);
        spellService.createFireSpell(3, 1000, 7);
        spellService.createFrostSpell(3, 250, true);
        spellService.createFrostSpell(3, 300, false);
    }
}
