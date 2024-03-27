package game;

import game.hero.*;
import game.hero.base.Hero;

import java.util.*;

public class StartGame {
    //"Крестьянин, Разбойник, Снайпер, Колдун,   Копейщик, Арбалетчик,  Монах"
     //Peasant,    Robber,    Sniper,  Sorcerer, Spearman, Crossbowman, Monk
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

    Map<String, List<Hero>> mapTeam = new HashMap<>();


    Peasant peasantOne = new Peasant("Tema",1,0,"1", 0);
    Sorcerer sorcerer = new Sorcerer("Саня",5,0,"1", 1);
    Spearman spearman = new Spearman("Коля",7,0,"1", 2);
    Crossbowman crossbowman = new Crossbowman("Вася",2,0,"1", 50, 3);
    List <Hero> heroesTeamOneSort = new LinkedList<>(List.of(peasantOne, sorcerer, spearman, crossbowman));
        heroesTeamOneSort.sort(Comparator.comparing(Hero::getInitiative));

    Peasant peasantTwo = new Peasant("Петр",-1,0,"2", 0);
    Monk monk = new Monk("Сеня",-3,0,"2", 1);
    Robber robber = new Robber("Веня",-5,0,"2", 2);
    Sniper sniper = new Sniper("Клепа",-2,0,"2", 40, 3);
    List <Hero> heroesTeamTwoSort = new LinkedList<>(List.of(peasantTwo, monk, robber, sniper));
        heroesTeamTwoSort.sort(Comparator.comparing(Hero::getInitiative));

    mapTeam.put("1" , heroesTeamOneSort);
    mapTeam.put("2" , heroesTeamTwoSort);
    System.out.println(ANSI_RED +"Команда 1 : " + ANSI_RESET+ heroesTeamOneSort + "\n");
    System.out.println(ANSI_RED +"Команда 2 : "+ ANSI_RESET + heroesTeamTwoSort);
    System.out.println("------------------------------------------------------------------------------------");
    System.out.println(ANSI_RED +"Ближайшие противники команды 1 : "+ ANSI_RESET+ crossbowman.distanceToEnemy(crossbowman, mapTeam));
    System.out.println(ANSI_RED +"Ближайшие противники команды 2 : "+ ANSI_RESET+ sniper.distanceToEnemy(sniper, mapTeam ));
    System.out.println("------------------------------------------------------------------------------------");
    crossbowman.step();
    sniper.step();
    System.out.println(ANSI_RED +"Состояние героя после атаки после атаки : " + ANSI_RESET+peasantOne.toString());
    System.out.println(ANSI_RED +"Состояние героя после атаки после атаки : " + ANSI_RESET+peasantTwo.toString());



    }


}
