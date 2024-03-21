package game;


import game.hero.*;
import game.hero.base.Hero;

public class StartGame {
    public static void main(String[] args) {
        Hero hero  = new Hero();


    Crossbowman crossbowman = new Crossbowman();
    Monk monk = new Monk();
    Peasant peasant = new Peasant();
    Robber robber = new Robber();
    Sniper sniper = new Sniper();
    Sorcerer sorcerer = new Sorcerer();
    Spearman spearman = new Spearman();

    System.out.println(spearman.toString());
    spearman.attack(spearman);

    System.out.println(crossbowman.toString());
    System.out.println(monk.toString());
    System.out.println(peasant.toString());
    System.out.println(robber.toString());
    System.out.println(sniper.toString());
    System.out.println(sorcerer.toString());


    System.out.println(spearman.toString());

    }


}
