public class Main {
    public static void main(String[] args){

        Animal dog = new Animal(17, "bingo", "German shepard");
        Animal snake = new Animal(20, "python", "reptiles");

        dog.setName("George");
        dog.feed();
        snake.move();

        Dog puppy = new Dog(17, "bingo", "German shepard");
        puppy.move();

        Refrigerator javaFridge = new Refrigerator("Samsung", 1);
        Room javaRoom = new Room("Red", 5);
        Television javaTelevision = new Television("LCD", 2 );
        House javaHouse = new House(javaRoom, javaFridge, javaTelevision);

        javaHouse.getRoom().openWindow();

    }
}
