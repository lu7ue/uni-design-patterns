package src.main.java.inventory;

import src.main.java.observer.Observer;
import src.main.java.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void addProduct(Product product) {
        System.out.println(product.getName() + " 添加到库存"); // 使用 getName() 访问
        notifyObservers(product.getName() + " 已添加到库存");
    }
}