package excercises.arraysEx;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private static final int MAX_PERSONS = 3;
    private static int numberOfPersons = 0;
    public Person[] persons = new Person[INITIAL_CAPACITY];
    private int emptySpace;

   /* public void add(Person person) {
        if (numberOfPersons >= MAX_PERSONS) {
            System.out.println("Brak miejsca");
        } else {
            persons[numberOfPersons] = person;
            numberOfPersons++;
        }
    }*/

    public void add(Person p) {
        if (emptySpace == persons.length) {
            persons = Arrays.copyOf(persons, persons.length * 2);
        }
        persons[emptySpace] = p;
        emptySpace++;
    }

    public void removePerson(Person person) {
       /* if(person==null) return;

        Person[] tempPersons;
        int nullPerson = -1;
        for (int i = 0; i < numberOfPersons; i++) {
            if (persons[i].equals(person)) {
                nullPerson = i;
                break;
            }
        }
        if(nullPerson==-1) {
            System.out.println("No such person");
            return;
        }

        if (nullPerson != -1) {
            tempPersons = new Person[numberOfPersons - 1];
            for (int j = 0; j < nullPerson; j++) {
                tempPersons[j] = persons[j];
            }
            for (int k = nullPerson; k < numberOfPersons - 1; k++) {
                tempPersons[k] = persons[k + 1];
            }
            numberOfPersons--;
            persons=tempPersons;
        }*/


        if (person == null)
            return;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i = 0;
        while (i < persons.length && found == NOT_FOUND) {
            if (person.equals(persons[i])) {
                found = i;
            } else {
                i++;
            }
        }

        if (found != NOT_FOUND) {
            System.arraycopy(persons, found + 1, persons, found, persons.length - found - 1);
            numberOfPersons--;
        }
    }


    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        return persons[index];
    }

    public int size() {
        return emptySpace;
    }

}

