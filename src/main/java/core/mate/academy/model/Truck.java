package core.mate.academy.model;

public class Truck extends Machine {

    public Truck() {
    }

    public Truck(String name, String color) {
        super(name, color);
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
