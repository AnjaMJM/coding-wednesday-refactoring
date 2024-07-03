package org.example;

public class InvoicePrinter {

    public String printHeader() {
        return "Invoice \r\n" +
                printHorizontalLine();
    }

    private static String printHorizontalLine() {
        return "--------- \r\n";
    }

    private String printBody(String customerName, double amount) {
        return "Customer: " + customerName +
                "\r\nAmount: " + amount + "\r\n";
    }

    private String printFooter() {
        return printHorizontalLine() +
                "Thank you for your business!";
    }

    public String printInvoice(String customerName, double amount) {
        return (printHeader() + printBody(customerName, amount) + printFooter());
    }
}

