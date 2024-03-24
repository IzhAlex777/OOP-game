package game.hero;



import game.hero.base.Hero;
import game.hero.coordinate.Coordinate;
import game.hero.coordinate.CoordinateImpl;

import java.util.List;
import java.util.Map;

public class Crossbowman extends Hero implements Coordinate {

    private String name;
    private int accuracy;
    private int maxAccuracy;
    private int armorPenetration;
    private int maxArmorPenetration;
    private static CoordinateImpl coordinate = new CoordinateImpl();
    private static String team;

    public Crossbowman (String name, int x, int y, String team){
        super(String.format("Hero_Name %s", name),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.coordinate,
                Crossbowman.team
        );
        this.name = name;
        this.maxAccuracy = Spearman.r.nextInt(30, 80);
        this.accuracy = maxAccuracy;
        this.maxArmorPenetration = Spearman.r.nextInt(50, 100);
        this.armorPenetration = maxArmorPenetration;
        coordinate.setX(x);
        coordinate.setX(y);
        Crossbowman.team = team;
    }



    @Override
    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam) {


        return coordinate.distanceToEnemy(hero, mapTeam);
    }

    @Override
    public String toString() {
        return "Crossbowman{" +
                "name='" + name + '\'' +
                ", accuracy=" + accuracy +
                ", maxAccuracy=" + maxAccuracy +
                ", armorPenetration=" + armorPenetration +
                ", maxArmorPenetration=" + maxArmorPenetration +
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
