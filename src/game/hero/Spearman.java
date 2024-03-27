package game.hero;

import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Spearman extends Hero {

    private int armor;
    private int maxArmor;

    public Spearman (String name, int x, int y, String team, int initiative){
        super( name,
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );

        this.maxArmor = Spearman.r.nextInt(30, 80);
        this.armor = maxArmor;

    }

    @Override
    public void step() {

    }

    @Override
    public String toString() {
        return "{Hero = Spearman" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", armor=" + armor +
                ", maxArmor=" + maxArmor +
                ", coordinate=" + coordinate +
                '}';
    }
}
