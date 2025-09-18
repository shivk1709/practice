package FunctionalInterface.Basic3;

public class Product
{
    private int quantity;
    private String name;

    public Product(int quantity, String name)
    {
        this.quantity = quantity;
        this.name = name;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "Product{" +
                "quantity=" + quantity +
                ", name='" + name + '\'' +
                '}';
    }

    public int getQuantity()
    {
        return quantity;
    }

}
