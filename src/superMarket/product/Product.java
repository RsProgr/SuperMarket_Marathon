package superMarket.product;

import java.util.Objects;

public class Product {

    private double price;
    private String name;
    private long barCode;
    private double OriginalPrice;
    private double salePrice;


    public Product(double price, String name, long barCode, double originalPrice, double salePrice) {
        this.price = price;
        this.name = name;
        this.barCode = barCode;
        OriginalPrice = originalPrice;
        this.salePrice = salePrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getOriginalPrice() {
        return OriginalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        OriginalPrice = originalPrice;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Double.compare(price, product.price) == 0 && barCode == product.barCode && Double.compare(OriginalPrice, product.OriginalPrice) == 0 && Double.compare(salePrice, product.salePrice) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, name, barCode, OriginalPrice, salePrice);
    }

    @Override
    public String toString() {
        return "Product: " + "'" +
                "price= " + price +
                ", name= '" + name + '\'' +
                ", barCode= " + barCode +
                ", OriginalPrice= " + OriginalPrice +
                ", salePrice= " + salePrice +
                "'";
    }
}
