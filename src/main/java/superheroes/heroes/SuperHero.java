package superheroes.heroes;

import superheroes.HeroStatistics;
import superheroes.TeamType;

public class SuperHero extends AbstractHero {
    public SuperHero(String name, HeroStatistics stats, TeamType type) {
        super(name, stats, type);
    }

    public int getPower() {
        return (this.getStats().getDefense() + this.getStats().getAttack()) * this.getStats().getHealth();
    }
}
