package se.lexicon.simon;

import java.util.Arrays;

public class MyUtil {

    //Helper Method
    public static boolean contains(String[] source, String nameToFind) {
        boolean result = false;

        for (String name : source) {
            if (name.equals(nameToFind)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static String[] AddToArray(String[]source, String elementToAdd){
        String[] target = Arrays.copyOf(source, source.length +1);
        target[target.length -1] = elementToAdd;
        return target;
    }


    /**
     * Business-Logic | Service Method | Utility Method
     * This method is transferring one client to another salesPerson
     *
     * @param transferFrom salesPerson to transfer FROM.
     * @param transferTo salesPerson to transfer TO.
     * @param clientName Name of client to transfer
     * @return Returns true if person was transferred correctly, Otherwise false.
     */
    public static boolean transferClient(SalesPerson transferFrom, SalesPerson transferTo, String clientName){

        boolean wasRemoved = transferFrom.removeClient(clientName);
        boolean wasTransferred = false;

        if (wasRemoved){
            String[] newArray = Arrays.copyOf(transferTo.getClients(), transferTo.getClients().length +1);
            newArray[newArray.length -1] = clientName;

            transferTo.setClients(newArray);

            wasTransferred = MyUtil.contains(transferTo.getClients(), clientName);
        }

        return wasTransferred;
    }
}
