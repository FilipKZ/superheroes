package superheroes.heroes;

import lombok.Getter;
import lombok.Setter;
import superheroes.HeroStatistics;
import superheroes.TeamType;

@Setter
@Getter
public abstract class AbstractHero {
    private String name;
    private HeroStatistics stats;
    private TeamType type;

    private void updateStats() {
        switch (type) {
            case RED:
                stats.increaseHealth(50);
                break;
            case BLUE:
                stats.increaseAttach(50);
                break;
            case GREEN:
                stats.increaseDefense(50);
                break;
        }
    }

    public AbstractHero(String name, HeroStatistics stats, TeamType type) {
        this.name = name;
        this.type = type;
        this.stats = stats;

        updateStats();
        }


    public abstract int getPower();
}
