package src.main.java.product;

public class ImportedProduct extends ProductDecorator {
    public ImportedProduct(Product product) {
        super(product);
    }

    @Override
    public void store() {
        decoratedProduct.store();
        System.out.println(name + " 是进口商品");
    }
}
