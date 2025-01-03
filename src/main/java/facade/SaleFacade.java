package src.main.java.facade;

import src.main.java.product.Product;

public class SaleFacade {
    public void sellProduct(Product product) {
        System.out.println("正在售出商品：" + product.getName());
        generateInvoice(product);
        arrangeShipping(product);
    }

    private void generateInvoice(Product product) {
        System.out.println("生成订单：" + product.getName() + " 已售出");
    }

    private void arrangeShipping(Product product) {
        System.out.println("安排物流：商品 " + product.getName() + " 正在发货");
    }
}
