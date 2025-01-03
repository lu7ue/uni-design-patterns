package src.main.java.product;

public class ConcreteProduct extends Product implements ProductPrototype {
    public ConcreteProduct(String name) {
        super(name);
    }

    @Override
    public void store() {
        System.out.println(name + " 已入库");
    }

    @Override
    public ProductPrototype cloneProduct() {
        return new ConcreteProduct(this.name);
    }
}
