package connections.oneToMany;

import connections.oneToMany.service.HeroService;

import java.util.List;

public class Ap {
    public static void main(String[] args) {
        HeroService heroService = new HeroService();
        Hero hero = heroService.createHero("Superman");
        var supervisor = heroService.createAbility("Supervisor", 1000, hero);
        var superspeed = heroService.createAbility("Superspeed", 2000, hero);

        System.out.println(hero);
    }
}
