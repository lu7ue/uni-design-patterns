package src.main.java;

import src.main.java.inventory.Inventory;
import src.main.java.observer.Admin;
import src.main.java.product.*;

public class Main {
    public static void main(String[] args) {
        // 创建工厂
        ProductFactory fruitFactory = new FruitFactory();

        // 创建产品
        Product apple = fruitFactory.createProduct("苹果");

        // 动态添加装饰
        Product importedApple = new ImportedProduct(apple);
        Product discountedApple = new DiscountedProduct(importedApple);

        // 创建库存并添加观察者
        Inventory inventory = new Inventory();
        inventory.addObserver(new Admin("张三"));
        inventory.addObserver(new Admin("李四"));

        // 入库操作
        discountedApple.store();
        inventory.addProduct(discountedApple);
    }
}

