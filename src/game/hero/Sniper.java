package game.hero;

import game.hero.base.Hero;
import game.hero.coordinate.Coordinate;
import game.hero.coordinate.CoordinateImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sniper extends Hero implements Coordinate {

    private int accuracy;
    private int maxAccuracy;
    private int arrows;
    private Hero sniper = null;
    private Map<String, List<Hero>> mapTeam = new HashMap();

    public Sniper (String name, int x, int y, String team, int  arrows, int initiative){
        super(name,
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxAccuracy = Spearman.r.nextInt(30, 80);
        this.accuracy = maxAccuracy;
        this.arrows = arrows;
    }

    @Override
    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam) {
        sniper = hero;
        this.mapTeam = mapTeam;
        return coordinate.distanceToEnemy(hero, mapTeam);
    }

    @Override
    public void step() {
        if (this.arrows != 0){
            List<Hero> heroes = distanceToEnemy(sniper, mapTeam);
            if(!heroes.isEmpty()){
                for (Hero e: heroes) {
                    if (e.getTeam().equals("1")) {
                        arrows--;
                        sniper.attack(e);
                        break;
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "{Hero = Sniper" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", accuracy=" + accuracy +
                ", maxAccuracy=" + maxAccuracy +
                ", arrows=" + arrows +
                ", coordinate=" + coordinate +
                '}';
    }
}
