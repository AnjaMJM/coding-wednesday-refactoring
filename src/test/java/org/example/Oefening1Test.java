package org.example;

import org.junit.jupiter.api.Test;

class Oefening1Test {

    @Test
    public void canPrintInvoice() {
        //Arrange
        var customername="Customer Name";
        double amount = 23.23;
        var invoice = new InvoicePrinter();
        //Act
        invoice.printInvoice(customername, amount);
        //Assert

    }

}