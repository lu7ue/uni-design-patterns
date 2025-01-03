package src.main.java;

import src.main.java.inventory.Inventory;
import src.main.java.observer.Admin;
import src.main.java.product.*;
import src.main.java.command.CommandExecutor;
import src.main.java.command.SellProductCommand;
import src.main.java.product.ConcreteProduct;
import src.main.java.product.ProductPrototype;

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

        // 创建商品原型
        ProductPrototype productPrototype = new ConcreteProduct("苹果");

        // 克隆多个商品
        ConcreteProduct product1 = (ConcreteProduct) productPrototype.cloneProduct();
        ConcreteProduct product2 = (ConcreteProduct) productPrototype.cloneProduct();

        // 创建售出命令
        SellProductCommand command1 = new SellProductCommand(product1);
        SellProductCommand command2 = new SellProductCommand(product2);

        // 执行售出命令
        CommandExecutor executor = new CommandExecutor();
        executor.addCommand(command1);
        executor.addCommand(command2);

        executor.executeCommands();
    }
}

