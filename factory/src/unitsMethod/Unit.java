package unitsMethod;

public abstract class Unit {
    private int hp;
    private int exp;
    private int dmgDone;


    Unit(int hp, int exp, int dmgDone) {
        this.hp = hp;
        this.exp = exp;
        this.dmgDone = dmgDone;
    }
}
