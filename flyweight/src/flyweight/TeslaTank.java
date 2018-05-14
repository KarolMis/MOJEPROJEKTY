package flyweight;

public class TeslaTank {

    private int x;
    private int y;
    private int hpLeft;
    private UnitStats stats;


    public TeslaTank(int x, int y) {
        stats = UnitStatsRepository.getRiflemanStats();
        this.x = x;
        this.y = y;
        this.hpLeft = stats.getHp();
    }
}
