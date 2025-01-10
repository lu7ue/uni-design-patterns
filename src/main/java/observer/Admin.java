package src.main.java.observer;

public class Admin implements Observer {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Administrator " + name + " received message: " + message);
    }
}
