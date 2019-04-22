package excercises.object;

import com.sun.istack.internal.NotNull;

public class DataStore {

    private static final int MAX_COMPUTERS = 100;
    private Computer[] computers = new Computer[MAX_COMPUTERS];
    private static int numberOfComputers = 0;


    public void add(Computer computer){
        if(numberOfComputers<MAX_COMPUTERS && computer!=null){
            computers[numberOfComputers]=computer;
            numberOfComputers++;
        }
    }

    public int checkAvailability(Computer computer){
        int result = 0;
        if(computer==null) return 0;
        for (int i = 0; i<numberOfComputers; i++) {
            if(getComputers()[i].equals(computer)){
                result++;
            }
        }
        return result;
    }

    public Computer[] getComputers() {
        Computer[] listOfAvailableComputers = new Computer[numberOfComputers];
        for (int i=0; i<numberOfComputers; i++){
            listOfAvailableComputers[i]=computers[i];
        }
        return listOfAvailableComputers;
    }

    public String computersToString(){
        String result = "";
        for (int i =0 ; i< numberOfComputers; i++) {
            result = result + computers[i].toString() + "\n";
        }
        return result;
    }
}
