package FunctionalInterface.Basic6;

public class Transaction
{
    private String id;
    private String type;
    private double amount;
    private String status;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "Transaction{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }

    public Transaction(String id, String type, double amount, String status)
    {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.status = status;
    }
}
