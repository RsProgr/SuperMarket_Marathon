package superMarket.product;

import java.util.Objects;

public class Food extends Product{
    private String expDate;

    public Food(double price, String name, long barCode, double originalPrice, double salePrice, String expDate) {
        super(price, name, barCode, originalPrice, salePrice);
        this.expDate = expDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food food)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(expDate, food.expDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), expDate);
    }

    @Override
    public String toString() {
        return "Food: " +
                " expDate= '" + expDate + '\'' +
                "'";
    }
}
