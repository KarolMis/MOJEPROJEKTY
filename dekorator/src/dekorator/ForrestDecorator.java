package dekorator;

public class ForrestDecorator extends TerrainDecorator {

    public ForrestDecorator(Terrain terrain) {
        super(terrain);
    }

    @Override
    public int fuelCost() {
        return terrain.fuelCost() + 5;
    }
}
