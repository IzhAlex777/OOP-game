package game.hero;


import game.hero.base.Hero;

public class Robber extends Hero {
    private int cunning;
    private int maxCunning;

    public Robber (){
        super(String.format("Hero_Robber #%d", ++Robber.number),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200),
                Robber.r.nextInt(200, 300),
                Robber.r.nextInt(100, 200)
        );
        this.maxCunning = Robber.r.nextInt(30, 80);
        this.cunning = maxCunning;
    }

    @Override
    public String toString() {
        return "Hero : Robber " ;
    }
}
