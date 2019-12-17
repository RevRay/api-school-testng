package products;

import java.util.Date;

public abstract class Product {

    private Date dateProduced;

    /**
     * истек ли срок годности
     */
    abstract boolean isExpired();

    public Product(Date dateProduced) {
        this.dateProduced = dateProduced;
    }

    public Product() {
        this.dateProduced = new Date();
    }

    @Override
    public String toString() {
        return "Product{" +
                this.getClass().getSimpleName() +
                " dateProduced=" + dateProduced +
                '}';
    }
}
