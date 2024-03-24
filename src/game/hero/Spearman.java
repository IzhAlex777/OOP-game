package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Spearman extends Hero {

    private String name;
    private int armor;
    private int maxArmor;
    private static CoordinateImpl coordinate = new CoordinateImpl();
    private static String team;

    public Spearman (String name, int x, int y, String team){
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.coordinate,
                Spearman.team
        );
        this.name= name;
        this.maxArmor = Spearman.r.nextInt(30, 80);
        this.armor = maxArmor;
        coordinate.setX(x);
        coordinate.setY(y);
        this.team = team;
    }

    @Override
    public String toString() {
        return "Spearman{" +
                "name='" + name + '\'' +
                ", armor=" + armor +
                ", maxArmor=" + maxArmor +
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
