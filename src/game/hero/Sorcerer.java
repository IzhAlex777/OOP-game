package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Sorcerer extends Hero {

    private String name;
    private int mana;
    private int maxMana;
    private static CoordinateImpl coordinate = new CoordinateImpl();
    private static String team;

    public Sorcerer (String name, int x, int y, String team){
        super(String.format("Hero_Sorcerer #%d", ++Sorcerer.number),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.coordinate,
                Sorcerer.team
        );
        this.name= name;
        this.maxMana = Spearman.r.nextInt(30, 80);
        this.mana = maxMana;
        coordinate.setX(x);
        coordinate.setY(y);
        this.team = team;
    }

    @Override
    public String toString() {
        return "Sorcerer{" +
                "name='" + name + '\'' +
                ", mana=" + mana +
                ", maxMana=" + maxMana +
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
