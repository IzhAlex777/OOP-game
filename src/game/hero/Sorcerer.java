package game.hero;


import game.hero.base.Hero;

public class Sorcerer extends Hero {
    private int mana;
    private int maxMana;

    public Sorcerer (){
        super(String.format("Hero_Sorcerer #%d", ++Sorcerer.number),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200),
                Sorcerer.r.nextInt(200, 300),
                Sorcerer.r.nextInt(100, 200)
        );
        this.maxMana = Sorcerer.r.nextInt(30, 80);
        this.mana = maxMana;
    }

    @Override
    public String toString() {
        return "Hero : Sorcerer " ;
    }
}
