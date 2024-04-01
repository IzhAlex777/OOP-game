package game.hero.base;

import game.hero.coordinate.CoordinateImpl;

import java.util.Random;

public abstract class Hero implements Actions {
    protected static int number;
    protected static Random r;

    protected String team;
    protected CoordinateImpl coordinate;
    protected int coordinateSum;
    protected String name;
    protected int hp;
    protected int maxHp;
    protected int force;
    protected int forceHp;
    protected int protection;
    protected int maxProtection;
    protected int speed;
    protected int maxSpeed;
    protected int dexterity;
    protected int maxDexterity;
    protected int initiative;



    public CoordinateImpl getCoordinate() {
        return coordinate;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public String getInitiative() {
        return team;
    }

    public int getHp() {
        return hp;
    }

    public int getCoordinateSum() {
        return coordinateSum;
    }

    public void setCoordinateSum(int coordinateSum) {
        this.coordinateSum = coordinateSum;
    }

    public void setCoordinate(CoordinateImpl coordinate) {
        this.coordinate = coordinate;
    }

    static {
        Hero.number = 0;
        Hero.r = new Random();
    }

    public Hero(){};

    public Hero(String name,
                int hp,
                int force,
                int protection,
                int maxProtection,
                int speed,
                int maxSpeed,
                int dexterity,
                int maxDexterity,
                CoordinateImpl coordinate,
                String team,
                int initiative

    ) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.force = force;
        this.forceHp = force;
        this.protection = protection;
        this.maxProtection = maxProtection;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.dexterity = dexterity;
        this.maxDexterity = maxDexterity;
        this.coordinate =coordinate;
        this.team = team;
        this.initiative = initiative;

    }


    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void restorationOfProtection(int Protection) {
        this.protection = Protection + this.protection > this.maxProtection
                ? this.maxProtection : Protection + this.protection;
    }

    public void getDamage(int damageHp, int damageProtection) {
        if (this.hp - damageHp > 0) {
            this.hp -= damageHp;
        }
        // else { die(); }
        if (this.protection - damageProtection > 0) {
            this.protection -= damageProtection;
        }
    }

    public void attack(Hero target) {
        int damageHp = Hero.r.nextInt(10, 20);
        int damageProtection = Hero.r.nextInt(10, 20);
        target.getDamage(damageHp, damageProtection);
    }

//    @Override
//    public String toString() {
//        return "Hero{" +
//                "name='" + name + '\'' +
//                ", hp=" + hp +
//                ", maxHp=" + maxHp +
//                ", force=" + force +
//                ", forceHp=" + forceHp +
//                ", protection=" + protection +
//                ", maxProtection=" + maxProtection +
//                ", speed=" + speed +
//                ", maxSpeed=" + maxSpeed +
//                ", dexterity=" + dexterity +
//                ", maxDexterity=" + maxDexterity +
//                '}';
//    }
}
