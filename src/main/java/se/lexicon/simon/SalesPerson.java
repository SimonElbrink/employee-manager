package se.lexicon.simon;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee {

    protected static final int CLIENT_EXTRA = 500;
    protected static final int CLIENT_RECRUITED_EXTRA = 1_000;

    private String[] clients;
    private int clientsRecruited;

    public SalesPerson(String name, LocalDate dateHired, String[] clients, int clientsRecruited) {
        super(name, dateHired);
        this.clients = clients;
        this.clientsRecruited = clientsRecruited;
    }

    public SalesPerson(String name, LocalDate dateHired) {
        this(name, dateHired, new String[0], 0);
    }

    @Override
    public void calculateSalary() {
        int clientExtra = clients.length * CLIENT_EXTRA;
        int ClientRecruitedExtra = clientsRecruited  * CLIENT_RECRUITED_EXTRA;
        int salaryTotal = Employee.baseSalary + clientExtra + ClientRecruitedExtra;
        this.setSalary(salaryTotal);
    }

    /**
     * Convenient Method
     * This method adds a new client to a salesPerson
     *
     * @param clientName Name of the client to add.
     */
    public void addNewClient(String clientName){
        String[] newArray = Arrays.copyOf(clients, clients.length +1);
        newArray[newArray.length -1] = clientName;
        clients = newArray;

        clientsRecruited++;
    }

    /**
     * Convenient Method
     * This method removes client from salesPerson.
     * @param clientName Client to remove.
     * @return True if client was removed, otherwise false.
     */
    public boolean removeClient(String clientName){
        boolean wasRemoved = false;

        boolean nameStored = MyUtil.contains(clients, clientName);

        if (nameStored){

            String[] smallerArray = Arrays.copyOf(clients, clients.length -1);

            int nextIndex = 0;

            for (String client : clients) {

                if (!client.equals(clientName)) {
                    smallerArray[nextIndex++] = client;
                }
            }

            clients = smallerArray;
            wasRemoved = !MyUtil.contains(clients, clientName);

        }

        return wasRemoved;
    }


    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    public int getClientsRecruited() {
        return clientsRecruited;
    }

    public void setClientsRecruited(int clientsRecruited) {
        this.clientsRecruited = clientsRecruited;
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                ", id=" + getId() +
                ", name=" + getName() +
                ", salary=" + getSalary() +
                ", dateHired=" + getDateHired() +
                ", clients=" + Arrays.toString(clients) +
                ", clientsRecruited=" + clientsRecruited +
                '}';
    }
}
