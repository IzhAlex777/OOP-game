package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

import java.util.List;
import java.util.Map;

public class Robber extends Hero {

    private int cunning;
    private int maxCunning;
    private Hero robber;// = null;
    private Map<String, List<Hero>> mapTeam;// = new HashMap();

    public Robber (String name, int x, int y, String team,int initiative){
        super(name,
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxCunning = Spearman.r.nextInt(30, 80);
        this.cunning = maxCunning;

    }

    public List<Hero> distanceToEnemyRobber(Hero hero, Map<String, List<Hero>> mapTeam) {
        robber = hero;
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
            List<Hero> heroes = distanceToEnemyRobber(robber, mapTeam);
            if (!heroes.isEmpty()) {
                Hero hero = heroes.get(0);

                vectorXSum = Math.abs(getCoordinate().getX() - hero.getCoordinate().getX());
                vectorYSum = Math.abs(getCoordinate().getY() - hero.getCoordinate().getY());
                vectorX = getCoordinate().getX() - hero.getCoordinate().getX();
                vectorY = getCoordinate().getY() - hero.getCoordinate().getY();

                if (vectorX == 1|| vectorY == 1){
                    robber.attack(hero);
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
        return "{Hero = Robber" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", cunning=" + cunning +
                ", maxCunning=" + maxCunning +
                ", coordinate=" + coordinate +
                '}';
    }
}
