package com.kodilla.mod1;

public class App5 {
    public static void main(String args[]) {
        FixedSalaryEmployee employee1 = new FixedSalaryEmployee(10000.00);
        HourlySalaryEmployee employee2 = new HourlySalaryEmployee(160, 32.50);
        ProductSalaryEmployee employee3 = new ProductSalaryEmployee(5, 599.99);
        BonusSalaryEmployee employee4 = new BonusSalaryEmployee(10000, 0.25, true);

        SalaryPayoutProcessor processor1 = new SalaryPayoutProcessor(employee1);
        processor1.processPayout();
        SalaryPayoutProcessor processor2 = new SalaryPayoutProcessor(employee2);
        processor2.processPayout();
        SalaryPayoutProcessor processor3 = new SalaryPayoutProcessor(employee3);
        processor3.processPayout();
        SalaryPayoutProcessor processor4 = new SalaryPayoutProcessor(employee4);
        processor4.processPayout();

    }
}
