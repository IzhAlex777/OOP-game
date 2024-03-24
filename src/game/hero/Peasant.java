package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Peasant extends Hero {

    private String name;
    private int struggle;
    private int maxStruggle;
    private static CoordinateImpl coordinate;// = new CoordinateImpl();
    private static String team;

    public String getTeam() {
        return team;
    }
    public Peasant (String name, int x, int y, String team){
        super(String.format("Hero_Name %s", name),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.coordinate = new CoordinateImpl(),
                Peasant.team
        );
        this.name= name;
        this.maxStruggle = Spearman.r.nextInt(30, 80);
        this.struggle = maxStruggle;
        coordinate.setX(x);
        coordinate.setY(y);
        this.team = team;
    }

    @Override
    public String toString() {
        return "Peasant{" +
                "name='" + name + '\'' +
                ", struggle=" + struggle +
                ", maxStruggle=" + maxStruggle +
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
