package excercises.object;

public class NotebookShop {

    public static void main(String[] args) {
        Computer computer1 = new Computer("Comodore", "64");
        Computer computer2 = new Computer("Lenovo", "IdeaPad");
        Computer computer3 = new Computer("Comodore", "64");

        DataStore dataStore = new DataStore();
        dataStore.add(computer1);
        dataStore.add(computer2);
        dataStore.add(computer3);

        /*System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);*/

        System.out.println(dataStore.computersToString());

        System.out.println("Ilość dostępnych Comodore 64: \t" + dataStore.checkAvailability(new Computer("Comodore", "64")));
        System.out.println("Ilość dostępnych Lenovo IdeaPad: \t" + dataStore.checkAvailability(new Computer("Lenovo", "IdeaPad")));
        System.out.println("Ilość dostępnych Amiga 600: \t" + dataStore.checkAvailability(new Computer("Amiga", "600")));
        System.out.println("Ilość dostępnych null: \t" + dataStore.checkAvailability(null));

    }
}
