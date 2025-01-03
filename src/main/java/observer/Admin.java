package src.main.java.observer;

public class Admin implements Observer {
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("管理员 " + name + " 收到通知: " + message);
    }
}
