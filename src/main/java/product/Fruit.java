package src.main.java.product;

public class Fruit extends Product {
    public Fruit(String name) {
        super(name);
    }

    @Override
    public void store() {
        System.out.println(name + " 已入库（水果）");
    }
}
