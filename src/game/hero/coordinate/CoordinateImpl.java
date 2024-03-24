package game.hero.coordinate;



import game.hero.base.Hero;

import java.util.*;

public class CoordinateImpl {

    private int x = 0;
    private int y = 0;

    public CoordinateImpl() {

    }

    public CoordinateImpl(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam){
        List<Hero> heroesOne = new ArrayList<>();
        List<Hero> result = new ArrayList<>();
        int[] coordinate = new int[2];
        Set<String> key =  mapTeam.keySet();
        int minX = 10;
        int minY =  0;

        for (String k: key) {
            if (!k.equals(hero.getTeam())){
                heroesOne = mapTeam.get(k);
                for (Hero e : heroesOne) {
                    if (!e.equals(hero.getName())) {
                        if ((int) e.getCoordinate().x < minX) {
                            minX = e.getCoordinate().x;
                            minY = e.getCoordinate().y;
                            result.add(e);
                        }
                    }
                }
            }
        }

        coordinate[0] = minX;
        coordinate[1] = minY;
        System.out.println(Arrays.toString(coordinate));
        return result;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "CoordinateImpl{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
