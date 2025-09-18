package FunctionalInterface.Basic6;

import java.util.List;

public class ReportGenerator
{
    public void generateReport(List<Transaction> transactions, TransactionFilter transactionFilter, TransactionFormatter formatter)
    {
        transactions.stream().filter(transactionFilter::apply).map(formatter::format).forEach(System.out::println);
    }
}
