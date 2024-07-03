package org.example;

public class Main {
    public static void main(String[] args) {
//        var invoiceTest = new InvoicePrinter();
//        System.out.println(invoiceTest.printInvoice("name", 45.99));


        var config = new Config("", "", "http://localhost:8080");
        var validationResult = new ConfigurationValidator().validateConfiguration(null);
        System.out.println("Config validation resulted in:" + validationResult);
    }
}
