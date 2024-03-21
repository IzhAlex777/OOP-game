package game.hero;


import game.hero.base.Hero;

public class Sniper extends Hero {
    private int accuracy;
    private int maxAccuracy;

    public Sniper (){
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200)
        );
        this.maxAccuracy = Sniper.r.nextInt(30, 80);
        this.accuracy = maxAccuracy;
    }

    @Override
    public String toString() {
        return "Hero : Sniper " ;
    }
}
