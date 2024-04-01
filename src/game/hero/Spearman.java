package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

import java.util.List;
import java.util.Map;

public class Spearman extends Hero {

    private int armor;
    private int maxArmor;
    private Hero spearman;// = null;
    private Map<String, List<Hero>> mapTeam;// = new HashMap();

    public Spearman (String name, int x, int y, String team, int initiative){
        super( name,
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );

        this.maxArmor = Spearman.r.nextInt(30, 80);
        this.armor = maxArmor;

    }

    public List<Hero> distanceToEnemySpearman(Hero hero, Map<String, List<Hero>> mapTeam) {
        spearman = hero;
        this.mapTeam = mapTeam;
        return coordinate.distanceToEnemy(hero, mapTeam);
    }

    @Override
    public void step() {
        int vectorXSum = 0;
        int vectorYSum = 0;
        int vectorX = 0;
        int vectorY = 0;

        if (getHp() > 0) {
            List<Hero> heroes = distanceToEnemySpearman(spearman, mapTeam);
            if (!heroes.isEmpty()) {
                Hero hero = heroes.get(0);

                vectorXSum = Math.abs(getCoordinate().getX() - hero.getCoordinate().getX());
                vectorYSum = Math.abs(getCoordinate().getY() - hero.getCoordinate().getY());
                vectorX = getCoordinate().getX() - hero.getCoordinate().getX();
                vectorY = getCoordinate().getY() - hero.getCoordinate().getY();

                if (vectorX == 1|| vectorY == 1){
                    spearman.attack(hero);
                } else if (vectorXSum < vectorYSum) {
                    if (vectorY > 1) {
                        coordinate.setY(getCoordinate().getY() - 1);
                    } else {
                        coordinate.setY(getCoordinate().getY() + 1);
                    }
                } else if (vectorXSum > vectorYSum) {
                    if (vectorX > 1) {
                        coordinate.setX(getCoordinate().getX() - 1);
                    } else {
                        coordinate.setX(getCoordinate().getX() + 1);
                    }
                }
            }
        }

    }

    @Override
    public String toString() {
        return "{Hero = Spearman" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", armor=" + armor +
                ", maxArmor=" + maxArmor +
                ", coordinate=" + coordinate +
                '}';
    }
}
