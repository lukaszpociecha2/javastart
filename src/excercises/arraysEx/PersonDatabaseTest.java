package excercises.arraysEx;

public class PersonDatabaseTest {

    public static void main(String[] args) {
        PersonDatabase pDb = new PersonDatabase();
        Person person1 = new Person("Lukasz", "Pociecha", "83050202714");
        Person person2 = new Person("Jolanta", "Guzik", "123456");
        Person person3 = new Person("Jacek", "Place", "1234");
        Person person4 = new Person("Kubuś", "Puchatek", "1");

        pDb.add(person1);
        pDb.add(person2);
        pDb.add(person3);

        System.out.println("Długość tablicy: " + pDb.size());

        for (Person person : pDb.persons) {
            System.out.println(person.toString());
        }

        /*pDb.removePerson(person2);
        System.out.println("Długość tablicy: " + pDb.size());
        for (Person person : pDb.persons) {
            System.out.println(person.toString());
        }*/



    }
}
