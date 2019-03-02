package superheroes.heroes;

import superheroes.HeroStatistics;
import superheroes.TeamType;

// fabryka abstrakcyjna
public abstract class HeroCreator {

    // metody stworzeniowe, metody factory
    public static AbstractHero createVillain() {
        return new Villain("Marian", new HeroStatistics(50, 50, 50), TeamType.RED);
    }

    public static AbstractHero createVillain(String name) {
        return new Villain(name, new HeroStatistics(50, 50, 50), TeamType.RED);
    }

    public static AbstractHero createSuperHero(String name) {
        return new SuperHero(name, new HeroStatistics(150, 150, 25), TeamType.GREEN);
    }
}
