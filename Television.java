public class Television {
    private String screen;
    private int speaker;
    private int remoteController;

    public Television(String screen, int speaker) {
        this.screen = screen;
        this.speaker = speaker;
        this.remoteController = 1;
    }

    public void powerUp() {
        System.out.println("Television is on");
    }
}
