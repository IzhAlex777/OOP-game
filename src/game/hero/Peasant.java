package game.hero;

import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

import java.util.List;
import java.util.Map;

public class Peasant extends Hero {

    private int struggle;
    private int maxStruggle;
    private Hero peasant;// = null;
    private Map<String, List<Hero>> mapTeam;// = new HashMap();


    public String getTeam() {
        return team;
    }
    public Peasant (String name, int x, int y, String team, int initiative){
        super(name,
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                new CoordinateImpl(x,y),
                team,
                initiative
        );
        this.maxStruggle = Spearman.r.nextInt(30, 80);
        this.struggle = maxStruggle;
    }


    public List<Hero> distanceToEnemyPeasant(Hero hero, Map<String, List<Hero>> mapTeam) {
        peasant = hero;
        this.mapTeam = mapTeam;
        return coordinate.distanceToEnemy(hero, mapTeam);
    }

    @Override
    public void step() {
        int vectorXSum = 0;
        int vectorYSum = 0;
        int vectorX = 0;
        int vectorY = 0;

       // while (vectorX >= 2 || vectorY >= 2){
            if (getHp() > 0) {
                List<Hero> heroes = distanceToEnemyPeasant(peasant, mapTeam);
                if (!heroes.isEmpty()) {
                    Hero hero = heroes.get(0);
                    //System.out.println(getHp() + " " + getName() + " : " + hero.getHp() + " " + hero.getName());

                    vectorXSum = Math.abs(getCoordinate().getX() - hero.getCoordinate().getX());
                    vectorYSum = Math.abs(getCoordinate().getY() - hero.getCoordinate().getY());
                    vectorX = getCoordinate().getX() - hero.getCoordinate().getX();
                    vectorY = getCoordinate().getY() - hero.getCoordinate().getY();

                    if (vectorX == 1|| vectorY == 1){
                        //System.out.println(vectorX +"++ "+ vectorY);
                        peasant.attack(hero);
                        //break;

                    } else if (vectorXSum < vectorYSum) {
                        if (vectorY > 1) {
                            coordinate.setY(getCoordinate().getY() - 1);
                        } else {
                            coordinate.setY(getCoordinate().getY() + 1);
                        }
                    } else if (vectorXSum > vectorYSum) {
                        if (vectorX > 1) {
                            coordinate.setX(getCoordinate().getX() - 1);
                            //System.out.println(vectorX +" "+ vectorY);
                        } else {
                            coordinate.setX(getCoordinate().getX() + 1);
                        }
                    }
                }
            }
        //}
    }

    @Override
    public String toString() {
        return "{Hero = Peasant" +
                ", name='" + name + '\'' +
                ", team='" + team + '\'' +
                ", initiative=" + initiative +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                ", struggle=" + struggle +
                ", maxStruggle=" + maxStruggle +
                ", coordinate=" + coordinate +
                '}';
    }


}
