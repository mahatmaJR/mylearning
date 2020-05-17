public class Horse {
    int legs = 0;
    String breed = "";
    String color = "";

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.setColor("red");
        System.out.println(horse.getColor());
        horse.setBreed("Stallion");
        System.out.println(horse.getBreed());
        horse.setLegs(4);
        System.out.println(horse.getLegs());
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
