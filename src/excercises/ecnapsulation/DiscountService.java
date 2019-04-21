package excercises.ecnapsulation;

public class DiscountService {

    public double calculateDiscount(Client client, double price) {
        if (client.isPremium()) {
            return calculatePremiumDiscount(price);
        } else {
            return calculateRegularDiscount(price);
        }
    }


    private double calculatePremiumDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.15);
        }

        return applyDiscount(price, 0.1);
    }

    private double calculateRegularDiscount(double price) {
        if (price > 1000) {
            return applyDiscount(price, 0.05);
        }

        return price;
    }

    private double applyDiscount(double price, double discount) {
        return price * (1 - discount);
    }

    public void printFinalPrice(Client client, double price) {

        welcomeMessage(client);
        System.out.println("Cena przed rabatem: " + price);
        // System.out.println("Is client premium? " + client.isPremium());
        System.out.println("Cena po rabacie = " + calculateDiscount(client, price));

    }

    private void welcomeMessage(Client client){
        if((client.getLastName()==null) && (client.getFirstName()!=null)){
            System.out.println("Witaj " + client.getFirstName());
        } else if ((client.getFirstName()==null) && (client.getLastName()!=null)){
            System.out.println("Dzień dobry Panie " + client.getLastName());
        } else if ((client.getFirstName()==null)&&(client.getLastName()==null)){
            System.out.println("Witaj nieznajomy");
        } else {
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        }
    }

}
