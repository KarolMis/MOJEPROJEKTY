package houseClassicBuilder;

public class House {
    private String walls;
    private String floors;
    private String rooms;
    private String roof;
    private String windows;
    private String doors;
    private String garage;

    public String getWalls() {
        return walls;
    }

    public House setWalls(String walls) {
        this.walls = walls;
        return this;
    }

    public String getFloors() {
        return floors;
    }

    public House setFloors(String floors) {
        this.floors = floors;
        return this;
    }

    public String getRooms() {
        return rooms;
    }

    public House setRooms(String rooms) {
        this.rooms = rooms;
        return this;
    }

    public String getRoof() {
        return roof;
    }

    public House setRoof(String roof) {
        this.roof = roof;
        return this;
    }

    public String getWindows() {
        return windows;
    }

    public House setWindows(String windows) {
        this.windows = windows;
        return this;
    }

    public String getDoors() {
        return doors;
    }

    public House setDoors(String doors) {
        this.doors = doors;
        return this;
    }

    public String getGarage() {
        return garage;
    }

    public House setGarage(String garage) {
        this.garage = garage;
        return this;
    }

    @Override
    public String toString() {
        return "House{" +
                "walls='" + walls + '\'' +
                ", floors='" + floors + '\'' +
                ", rooms='" + rooms + '\'' +
                ", roof='" + roof + '\'' +
                ", windows='" + windows + '\'' +
                ", doors='" + doors + '\'' +
                ", garage='" + garage + '\'' +
                '}';
    }
}
