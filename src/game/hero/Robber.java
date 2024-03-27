package game.hero;

import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Robber extends Hero {

    private int cunning;
    private int maxCunning;

    public Robber (String name, int x, int y, String team,int initiative){
        super(name,
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxCunning = Spearman.r.nextInt(30, 80);
        this.cunning = maxCunning;

    }

    @Override
    public void step() {

    }

    @Override
    public String toString() {
        return "{Hero = Robber" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", cunning=" + cunning +
                ", maxCunning=" + maxCunning +
                ", coordinate=" + coordinate +
                '}';
    }
}
