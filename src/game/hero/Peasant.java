package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Peasant extends Hero {

    private int struggle;
    private int maxStruggle;

    public String getTeam() {
        return team;
    }
    public Peasant (String name, int x, int y, String team, int initiative){
        super(name,
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxStruggle = Spearman.r.nextInt(30, 80);
        this.struggle = maxStruggle;
    }

    @Override
    public void step() {}

    @Override
    public String toString() {
        return "{Hero = Peasant" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", struggle=" + struggle +
                ", maxStruggle=" + maxStruggle +
                ", coordinate=" + coordinate +
                '}';
    }
}
