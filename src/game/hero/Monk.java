package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Monk extends Hero {

    private String name;
    private int faith;
    private int maxFaith;
    private static CoordinateImpl coordinate= new CoordinateImpl();
    private static String team;

    public Monk (String name, int x, int y, String team){
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.coordinate,
                Monk.team
        );
        this.name= name;
        this.maxFaith = Spearman.r.nextInt(30, 80);
        this.faith = maxFaith;
        coordinate.setX(x);
        coordinate.setY(y);
        this.team = team;
    }

    @Override
    public String toString() {
        return "Monk{" +
                "name='" + name + '\'' +
                ", faith=" + faith +
                ", maxFaith=" + maxFaith +
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
