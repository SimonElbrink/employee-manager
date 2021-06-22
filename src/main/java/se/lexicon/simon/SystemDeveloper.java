package se.lexicon.simon;

import java.time.LocalDate;
import java.util.Arrays;

public class SystemDeveloper extends Employee{

    protected static final int CERTIFICATE_EXTRA = 1_000;
    protected static final int LANGUAGE_EXTRA = 1_500;

    private String[] certificates;
    private String[] languages;

    public SystemDeveloper(String name, LocalDate dateHired, String[] certificates, String[] languages) {
        super(name, dateHired);
        this.certificates = certificates;
        this.languages = languages;
    }

    public SystemDeveloper(String name, LocalDate dateHired) {
        this(name,dateHired,new String[0],new String[0]);
    }

    @Override
    public void calculateSalary() {
        int certificateExtra = certificates.length * CERTIFICATE_EXTRA;
        int languageExtra = languages.length  * LANGUAGE_EXTRA;
        int salaryTotal = Employee.baseSalary + certificateExtra + languageExtra;
        this.setSalary(salaryTotal);
    }

    public String[] getCertificates() {
        return certificates;
    }

    public void setCertificates(String[] certificates) {
        this.certificates = certificates;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    //Convenient Method
    public void addLanguage(String language){
        String[] newArray = Arrays.copyOf(languages, languages.length + 1);//make bigger array
        newArray[newArray.length-1] = language;//Put the new language in the bigger array
        languages = newArray;
    }

    //Convenient Method
    public void addCertificate(String certificate){
        String[] newArray = Arrays.copyOf(this.certificates, this.certificates.length + 1);//make bigger array
        newArray[newArray.length-1] = certificate;//Put the new certificates in the bigger array
        this.certificates = newArray;

    }


    @Override
    public String toString() {
        return "SystemDeveloper{" +
                "salary=" + this.getSalary() +
                ", certificates=" + Arrays.toString(certificates) +
                ", languages=" + Arrays.toString(languages) +
                '}';
    }
}
