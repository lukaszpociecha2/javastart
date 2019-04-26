package excercises.serialization;

import java.io.*;

public class ObjectWriter {

    public static void main(String[] args) {

        Person person = new Person("Lukasz", "Pociecha");
        String fileName = "persons.obj";

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);) {

            objectOutputStream.writeObject(person);
            System.out.println("zapisano obiekt");

        } catch (IOException e) {
            System.out.println("Błąd zapisu");
            e.printStackTrace();
        }

        Person personFromFile = null;

        try (FileInputStream fi = new FileInputStream(fileName);
             ObjectInputStream oi = new ObjectInputStream(fi);)
        {
            personFromFile = (Person)oi.readObject();
            System.out.println("Wygenerowano nowy obiekt z pliku typu " + personFromFile.getClass().getSimpleName());

        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if(personFromFile!=null){
            System.out.println(personFromFile.getFirstName() + personFromFile.getLastName());
        }

    }
}