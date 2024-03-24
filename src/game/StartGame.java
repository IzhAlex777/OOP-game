package game;



import game.hero.*;
import game.hero.base.Hero;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StartGame {
    //"Крестьянин, Разбойник, Снайпер, Колдун, Копейщик, Арбалетчик, Монах"
//Peasant, Robber, Sniper, Sorcerer, Spearman, Crossbowman, Monk
    public static void main(String[] args) {

    Map<String, List<Hero>> mapTeam = new HashMap<>();

    Peasant peasantOne = new Peasant("Tema",3,0,"1");
    Sorcerer sorcerer = new Sorcerer("Саня",5,0,"1");
    Spearman spearman = new Spearman("Коля",7,0,"1");
    Crossbowman crossbowman = new Crossbowman("Вася",0,1,"1");

    Peasant peasantTwo = new Peasant("Петр",1,0,"2");
    Monk monk = new Monk("Сеня",3,0,"2");
    Robber robber = new Robber("Веня",5,0,"2");
    Sniper sniper = new Sniper("Клепа",6,0,"2");
    List<Hero> heroesOne = List.of(peasantOne, sorcerer, spearman, crossbowman);
    mapTeam.put("1" , heroesOne);
    List<Hero> heroesTwo = List.of(peasantTwo, monk, robber, sniper);
    mapTeam.put("2" , heroesTwo);

    System.out.println(spearman.toString());
    spearman.attack(spearman);

    System.out.println(crossbowman.toString());
    System.out.println(monk.toString());
    System.out.println(peasantOne.toString());
    System.out.println(peasantTwo.toString());
    System.out.println(robber.toString());
    System.out.println(sniper.toString());
    System.out.println(sorcerer.toString());

    System.out.println(spearman.toString());
    System.out.println(crossbowman.distanceToEnemy(crossbowman, mapTeam));

    }


}
