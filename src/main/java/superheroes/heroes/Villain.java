package superheroes.heroes;

import lombok.Getter;
import lombok.Setter;
import superheroes.HeroStatistics;
import superheroes.TeamType;

@Getter
@Setter
public class Villain extends AbstractHero {
    public Villain(String name, HeroStatistics stats, TeamType type) {
        super(name, stats, type);
    }

    public int getPower() {
        return (this.getStats().getHealth() + this.getStats().getAttack()) * this.getStats().getDefense();
    }
}
