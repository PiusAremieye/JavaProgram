public class Animal {
    private int body;
    private int lifeSpan;
    private String name;
    private String species;

    public Animal(int lifeSpan, String name, String species) {
        this.body = 1;
        this.lifeSpan = lifeSpan;
        this.name = name;
        this.species = species;
    }

    public void feed(){
        System.out.println(name + " is feeding.");
    }

    public void move(){
        System.out.println(name + " is moving.");
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
