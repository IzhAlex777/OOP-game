package game.hero;


import game.hero.base.Hero;

public class Monk extends Hero {

    private int faith;
    private int maxFaith;

    public Monk (){
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200),
                Monk.r.nextInt(200, 300),
                Monk.r.nextInt(100, 200)
        );
        this.maxFaith = Monk.r.nextInt(30, 80);
        this.faith = maxFaith;
    }

    @Override
    public String toString() {
        return "Hero : Monk " ;
    }
}
