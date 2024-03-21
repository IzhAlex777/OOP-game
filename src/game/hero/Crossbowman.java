package game.hero;


import game.hero.base.Hero;

public class Crossbowman extends Hero {
    private int accuracy;
    private int maxAccuracy;
    private int armorPenetration;
    private int maxArmorPenetration;


    public Crossbowman (){
        super(String.format("Hero_Crossbowman #%d", ++Crossbowman.number),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200),
                Crossbowman.r.nextInt(200, 300),
                Crossbowman.r.nextInt(100, 200)
        );
        this.maxAccuracy = Crossbowman.r.nextInt(30, 80);
        this.accuracy = maxAccuracy;
        this.maxArmorPenetration = Crossbowman.r.nextInt(50, 100);
        this.armorPenetration = maxArmorPenetration;
    }

    @Override
    public String toString() {
        return "Hero : Crossbowman " ;
    }
}
