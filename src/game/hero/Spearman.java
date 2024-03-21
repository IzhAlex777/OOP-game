package game.hero;


import game.hero.base.Hero;

public class Spearman extends Hero {

    private int armor;
    private int maxArmor;

    public Spearman (){
        super(String.format("Hero_Spearman #%d", ++Spearman.number),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200),
                Spearman.r.nextInt(200, 300),
                Spearman.r.nextInt(100, 200)
        );
        this.maxArmor = Spearman.r.nextInt(30, 80);
        this.armor = maxArmor;
    }

//    @Override
//    public String toString() {
//        return "Hero : Spearman " ;
//    }

    @Override
    public String toString() {
        return "Hero : Spearman " +
                ", hp=" + hp +
                ", protection=" + protection +
                '}';
    }
}
