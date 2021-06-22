package se.lexicon.simon;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( "Hello World!" );

        SystemDeveloper simon = new SystemDeveloper("Simon", LocalDate.of(2020,1,1));
        simon.addCertificate("OCA");

        simon.calculateSalary();
        System.out.println("simon.getSalary() = " + simon.getSalary());

        String[] certificates = {"OCA", "OCP"};
        Employee erik = new SystemDeveloper("Erik", LocalDate.parse("2016-01-01"), certificates, new String[]{"Java"," C++"});
        System.out.println("simon = " + simon);
        System.out.println("erik = " + erik);



        SalesPerson salesPerson01 = new SalesPerson("Kent",LocalDate.of(2020,1,1));
        salesPerson01.addNewClient("Bertil - AB");

        System.out.println("salesPerson01 = " + salesPerson01);

        SalesPerson salesPerson02 = new SalesPerson("Marcus",LocalDate.of(2020,1,1));

        MyUtil.transferClient(salesPerson01,salesPerson02, "Bertil - AB");

        System.out.println("salesPerson01 = " + salesPerson01);
        System.out.println("salesPerson02 = " + salesPerson02);




    }
}
