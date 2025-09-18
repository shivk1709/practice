package FunctionalInterface.Basic6;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Transaction> transactions = List.of(
                new Transaction("TX001", "credit", 1200, "approved"),
                new Transaction("TX002", "debit", 500, "pending"),
                new Transaction("TX003", "credit", 3000, "approved"),
                new Transaction("TX004", "credit", 200, "failed")
        );

        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(transactions, t -> t.getAmount() <= 500, t -> "Transaction ID - " + t.getId() + ", Transaction Type - " + t.getType());
    }
}
