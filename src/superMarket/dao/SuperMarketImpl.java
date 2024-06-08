package superMarket.dao;

import superMarket.product.Product;

public class SuperMarketImpl implements SuperMarket {
    Product[] products;
    private int size;


    @Override
    public boolean addProduct(Product product) {
        if (product == null || size == products.length || findProduct(product.getBarCode()) != null) {
            return false;
        }
        products[size++] = product;
        return true;
    }

    @Override
    public Product removeProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode) {
                Product victim = products[i];
                products[i] = products[--size];
                return victim;
            }
        }
        return null;
    }

    @Override
    public Product findProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if (products[i].getBarCode() == barCode) {
                return products[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double price() {
        return size;
    }

    @Override
    public double discount() {
        if (size == 0) {
            return 0;
        }
        double totalDiscount = 0;
        for (int i = 0; i < size; i++) {
            double originalPrice = products[i].getOriginalPrice();
            double salePrice = products[i].getSalePrice();
            double discount =  ((originalPrice - salePrice / originalPrice) * 100);
            totalDiscount += discount;
        }
        return totalDiscount / size;
    }

    @Override
    public void printProduct() {

    }

    @Override
    public Product updateProduct(long barCode, String name) {
        return null;
    }

    @Override
    public double originalPrice() {
        return originalPrice();
    }

    @Override
    public double salePrice() {
        return salePrice();
    }
}
