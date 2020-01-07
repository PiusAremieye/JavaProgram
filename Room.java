public class Room {
    private String wallColor;
    private int bulbs;

    public Room(String wallColor, int bulbs) {
        this.wallColor = wallColor;
        this.bulbs = bulbs;
    }

    public void openWindow() {
        System.out.println("Opening the window");
    }
}
