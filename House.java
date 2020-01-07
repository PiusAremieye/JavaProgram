public class House {
    private Room room;
    private Refrigerator refrigerator;
    private Television television;

    public House(Room room, Refrigerator refrigerator, Television television) {
        this.room = room;
        this.refrigerator = refrigerator;
        this.television = television;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public Television getTelevision() {
        return television;
    }

    public void setTelevision(Television television) {
        this.television = television;
    }
}
