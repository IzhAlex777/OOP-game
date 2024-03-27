package game.hero.coordinate;


import game.hero.base.Hero;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CoordinateImpl {

    private int x = 0;
    private int y = 0;

    public CoordinateImpl(int x, int y){
        this.x = x;
        this.y = y;
    }

    public List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam){
        List<Hero> heroesOne;
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
                        if(e.getCoordinate().x <0){
                            if (-(int) e.getCoordinate().x < minX) {
                                minX = e.getCoordinate().x;
                                minY = e.getCoordinate().y;
                                result.add(e);

                            }
                        }else {
                            if ( e.getCoordinate().x < minX) {
                                minX = e.getCoordinate().x;
                                minY = e.getCoordinate().y;
                                result.add(e);
                            }
                        }

                    }
                }
            }
        }

        if(hero != null) {
            coordinate[0] = minX;
            coordinate[1] = minY;
            //System.out.println("Минимальные координаты : " + Arrays.toString(coordinate));
        }
        return result;
    }

    @Override
    public String toString() {
        return "CoordinateImpl{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
