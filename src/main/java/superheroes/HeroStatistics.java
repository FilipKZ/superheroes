package superheroes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeroStatistics {
    private int health;
    private int attack;
    private int defense;

    public HeroStatistics(int health, int attack, int defense) {
        this.health = health;
        this.attack = attack;
        this.defense = defense;
    }

    public void increaseAttach (int amount) {
        this.attack += amount;
    }

    public void increaseHealth (int amount) {
        this.health += amount;
    }

    public void increaseDefense (int amount) {
        this.defense += amount;
    }
}
