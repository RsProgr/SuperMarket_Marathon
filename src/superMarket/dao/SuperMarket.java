package superMarket.dao;

import superMarket.product.Product;

public interface SuperMarket {
    boolean addProduct(Product product);
    Product removeProduct(long barCode);
    Product findProduct(long barCode);
    int quantity();
    double price();
    double discount();
    void printProduct();
    Product updateProduct(long barCode, String name);
    double originalPrice();
    double salePrice();



}
