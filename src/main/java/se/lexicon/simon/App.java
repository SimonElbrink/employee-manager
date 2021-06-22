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


    }
}
