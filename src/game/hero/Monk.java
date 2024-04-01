package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Monk extends Hero {

    private int faith;
    private int maxFaith;

    public Monk (String name, int x, int y, String team,int initiative){
        super( name,
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );

        this.maxFaith = Spearman.r.nextInt(30, 80);
        this.faith = maxFaith;

    }

    @Override
    public void step() {

    }

    @Override
    public String toString() {
        return "{Hero = Monk" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", faith=" + faith +
                ", maxFaith=" + maxFaith +
                ", coordinate=" + coordinate +
                '}';
    }
}
