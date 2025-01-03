package src.main.java.product;

public abstract class Product {
    protected String name;

    public Product(String name) {
        this.name = name;
    }

    public abstract void store();

    // 新增一个 getter 方法
    public String getName() {
        return name;
    }
}


