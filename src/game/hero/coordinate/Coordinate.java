package game.hero.coordinate;



import game.hero.base.Hero;

import java.util.List;
import java.util.Map;

public interface Coordinate {

    List<Hero> distanceToEnemy(Hero hero, Map<String, List<Hero>> mapTeam);
}
