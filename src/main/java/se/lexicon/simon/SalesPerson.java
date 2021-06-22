package se.lexicon.simon;

import java.time.LocalDate;

public class SalesPerson extends Employee {

    protected static final int CLIENTS_EXTRA = 500;
    protected static final int CLIENTS_RECRUITED = 1_000;

    public SalesPerson(String name, LocalDate dateHired) {
        super(name, dateHired);
    }

    //TODO
    @Override
    public void calculateSalary() {

    }

}
