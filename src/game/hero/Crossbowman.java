package game.hero;

import game.hero.base.Hero;
import game.hero.coordinate.Coordinate;
import game.hero.coordinate.CoordinateImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Crossbowman extends Hero implements Coordinate {

    private int accuracy;
    private int maxAccuracy;
    private int armorPenetration;
    private int maxArmorPenetration;
    private int arrows;
    private Hero crossbowman = null;
    private Map<String, List<Hero>> mapTeam = new HashMap();

    public Crossbowman (String name, int x, int y, String team, int  arrows, int initiative){

        super(name,
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxAccuracy = Spearman.r.nextInt(30, 80);
        this.accuracy = maxAccuracy;
        this.maxArmorPenetration = Spearman.r.nextInt(50, 100);
        this.armorPenetration = maxArmorPenetration;
        this.arrows = arrows;
    }

    @Override
    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam) {
        crossbowman = hero;
        this.mapTeam = mapTeam;
        return coordinate.distanceToEnemy(hero, mapTeam);
    }

    @Override
    public void step() {
        if (this.arrows != 0){
            List<Hero> heroes = distanceToEnemy(crossbowman, mapTeam);
            if(!heroes.isEmpty()){
                for (Hero e: heroes) {
                    if (e.getTeam().equals("2")) {
                        arrows--;
                        crossbowman.attack(e);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "{Hero = Crossbowman" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", accuracy=" + accuracy +
                ", maxAccuracy=" + maxAccuracy +
                ", armorPenetration=" + armorPenetration +
                ", maxArmorPenetration=" + maxArmorPenetration +
                ", arrows=" + arrows +
                ", coordinate=" + coordinate +
                '}';
    }
}
