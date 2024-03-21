package game.hero;


import game.hero.base.Hero;

public class Peasant extends Hero {

    private int struggle;
    private int maxStruggle;

    public Peasant (){
        super(String.format("Hero_Peasant #%d", ++Peasant.number),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200),
                Peasant.r.nextInt(200, 300),
                Peasant.r.nextInt(100, 200)
        );
        this.maxStruggle = Peasant.r.nextInt(30, 80);
        this.struggle = maxStruggle;
    }

    @Override
    public String toString() {
        return "Hero : Peasant " ;
    }
}
