package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Sorcerer extends Hero {

    private int mana;
    private int maxMana;

    public Sorcerer (String name, int x, int y, String team,int initiative){
        super( name,
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxMana = Spearman.r.nextInt(30, 80);
        this.mana = maxMana;
    }

    @Override
    public void step() {

    }

    @Override
    public String toString() {
        return "{Hero = Sorcerer" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", mana=" + mana +
                ", maxMana=" + maxMana +
                ", coordinate=" + coordinate +
                '}';
    }
}
