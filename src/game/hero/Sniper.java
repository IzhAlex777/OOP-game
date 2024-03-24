package game.hero;


import game.hero.base.Hero;
import game.hero.coordinate.CoordinateImpl;

public class Sniper extends Hero {

    private String name;
    private int accuracy;
    private int maxAccuracy;
    private static CoordinateImpl coordinate= new CoordinateImpl();
    private static String team;

    public Sniper (String name, int x, int y, String team){
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.r.nextInt(200, 300),
                Sniper.r.nextInt(100, 200),
                Sniper.coordinate,
                Sniper.team
        );
        this.name= name;
        this.maxAccuracy = Spearman.r.nextInt(30, 80);
        this.accuracy = maxAccuracy;
        coordinate.setX(x);
        coordinate.setY(y);
        this.team = team;
    }

    @Override
    public String toString() {
        return "Sniper{" +
                "name='" + name + '\'' +
                ", accuracy=" + accuracy +
                ", maxAccuracy=" + maxAccuracy +
                ", team='" + team + '\'' +
                ", coordinate=" + coordinate +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", maxHp=" + maxHp +
                ", force=" + force +
                ", forceHp=" + forceHp +
                ", protection=" + protection +
                ", maxProtection=" + maxProtection +
                '}';
    }
}
