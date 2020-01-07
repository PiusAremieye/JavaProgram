public class Dog extends Animal {
    private  int tail;
    private int legs;
    private int ears;

    public Dog(int lifeSpan, String name, String species){
        super(lifeSpan, name, species);
        this.tail =1;
        this.legs =4;
        this.ears =2;
    }

    public void bark(){
        System.out.println("Called bark method in Dog");
    }

    private void walk(){
        System.out.println(super.getName() + " is walking");
    }

    @Override
    public void move(){
        super.move();
        walk();
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEars() {
        return ears;
    }

    public void setEars(int ears) {
        this.ears = ears;
    }
}
