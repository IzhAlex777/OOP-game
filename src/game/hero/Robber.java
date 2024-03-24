package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Robber extends Hero {

    private String name;
    private int cunning;
    private int maxCunning;
    private static CoordinateImpl coordinate= new CoordinateImpl();
    private static String team;

    public Robber (String name, int x, int y, String team){
        super(String.format("Hero_Robber #%d", ++Robber.number),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.coordinate,
                Robber.team
        );
        this.name= name;
        this.maxCunning = Spearman.r.nextInt(30, 80);
        this.cunning = maxCunning;
        coordinate.setX(x);
        coordinate.setY(y);
        this.team = team;
    }

    @Override
    public String toString() {
        return "Robber{" +
                "name='" + name + '\'' +
                ", cunning=" + cunning +
                ", maxCunning=" + maxCunning +
                ", team='" + team + '\'' +
                ", coordinate=" + coordinate +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", force=" + force +
                ", forceHp=" + forceHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                '}';
    }
}
