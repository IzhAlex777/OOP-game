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


        Peasant peasantOne = new Peasant("Хрюша",6,9,"1", 0);
        Sorcerer sorcerer = new Sorcerer("Степа",7,9,"1", 1);
        Spearman spearman = new Spearman("Коля",8,9,"1", 2);
        Crossbowman crossbowman = new Crossbowman("Вася",9,9,"1", 50, 3);
        List <Hero> heroesTeamOneSort = new LinkedList<>(List.of(peasantOne, sorcerer, spearman, crossbowman));
            heroesTeamOneSort.sort(Comparator.comparing(Hero::getInitiative));

        Peasant peasantTwo = new Peasant("Филя",4,9,"2", 0);
        Monk monk = new Monk("Сеня",2,9,"2", 1);
        Robber robber = new Robber("Веня",4,8,"2", 2);
        Sniper sniper = new Sniper("Клепа",1,9,"2", 40, 3);
        List <Hero> heroesTeamTwoSort = new LinkedList<>(List.of(peasantTwo, monk, robber, sniper));
            heroesTeamTwoSort.sort(Comparator.comparing(Hero::getInitiative));

        mapTeam.put("1" , heroesTeamOneSort);
        mapTeam.put("2" , heroesTeamTwoSort);
        System.out.println("\n"+ ANSI_RED +"Команда 1 : " + ANSI_RESET+ heroesTeamOneSort + "\n");
        System.out.println(ANSI_RED +"Команда 2 : "+ ANSI_RESET + heroesTeamTwoSort);
        System.out.println("------------------------------------------------------------------------------------");
        System.out.println(ANSI_RED +"Ближайший противник для арбалетчика команды 1 : "+ ANSI_RESET
                + crossbowman.distanceToEnemyCrossbowman(crossbowman, mapTeam));
        System.out.println(ANSI_RED +"Ближайший противник для снайпера команды 2 : "
                + ANSI_RESET+ sniper.distanceToEnemySniper(sniper, mapTeam ));
        System.out.println("------------------------------------------------------------------------------------");
        crossbowman.step();
        sniper.step();
        System.out.println(ANSI_RED +"Состояние героя после атаки | команда 1 : " + ANSI_RESET+ peasantOne);
        System.out.println(ANSI_RED +"Состояние героя после атаки | команда 2 : " + ANSI_RESET+ peasantTwo);
        //System.out.println(ANSI_RED +"Жизнь Крестьянина команда 1 : "+ ANSI_RESET + peasantOne);
        //System.out.println(ANSI_RED +"Команда 2 : "+ ANSI_RESET + heroesTeamTwoSort);

        System.out.println(ANSI_RED +"Ближайший противник для крестьянина команды 1 : "
                + ANSI_RESET+ peasantOne.distanceToEnemyPeasant(peasantOne, mapTeam ));
//        System.out.println(ANSI_RED +"Ближайший противник для снайпера команды 2 : "
//                + ANSI_RESET+ sniper.distanceToEnemySniper(sniper, mapTeam ));
        peasantOne.step();
        System.out.println("\n"+ ANSI_RED +"Команда 1 : " + ANSI_RESET+ heroesTeamOneSort);
        System.out.println(ANSI_RED +"Команда 2 : "+ ANSI_RESET + heroesTeamTwoSort);
        System.out.println(ANSI_RED +"Ближайший противник для крестьянина команды 1 : "
                + ANSI_RESET+ peasantOne.distanceToEnemyPeasant(peasantOne, mapTeam ));
        peasantOne.step();
        System.out.println(ANSI_RED +"Команда 2 : "+ ANSI_RESET + heroesTeamTwoSort);
//        System.out.println("\n"+ ANSI_RED +"Команда 1 : " + ANSI_RESET+ heroesTeamOneSort);


    }


}
