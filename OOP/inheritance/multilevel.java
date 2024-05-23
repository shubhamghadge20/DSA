class Car {
    String colour;
    String capacity;

    Car() {
        colour = "red";
        capacity = "five";
    }
}

class Engine extends Car {
    int power;
    String type;

    Engine() {
        power = 1500;
        type = "electric";
    }
}

class Price extends Engine {
    int topvarient;
    int lowvarient;

    Price() {
        topvarient = 140000;
        lowvarient = 78900;
    }
}

public class multilevel {
    public static void main(String[] args) {
        Price p = new Price();

        System.out.println("Colour of car is: " + p.colour);
        System.out.println("Power of car is: " + p.power);
        System.out.println("Price of top variant is: " + p.topvarient);
    }
}
