package excercises.bankAccount;

public class Bank {

    public static void printAccountBalance(BankAccount account){
        if (account.balance==0) { return;}
        System.out.println("Account balance = " + account.balance);
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.firstName = "Lukasz";
        person1.lastName = "Pociecha";
        person1.addressPrimary = new Address();
        person1.addressPrimary.city = "Krakow";
        person1.addressPrimary.streetName = "Krakowska";
        person1.addressPrimary.streetNumber = 723;
        person1.addressPrimary.aparmentNumber = 34;
        person1.addressSecondary = null;


        Person person2 = new Person();
        person2.firstName = "Michael";
        person2.lastName = "Bronx";
        person2.addressPrimary = new Address();
        person2.addressPrimary.city = "New York";
        person2.addressPrimary.streetName = "5th Ave";
        person2.addressPrimary.streetNumber = 666;
        person2.addressPrimary.aparmentNumber = 41;
        person2.addressPrimary.cityCode = "NY E1";
        person2.addressSecondary = new Address();
        person2.addressSecondary.city = "Munich";
        person2.addressSecondary.streetName = "HeilStrasse";
        person2.addressSecondary.streetNumber = 45;
        person2.addressSecondary.aparmentNumber = 1;
        person2.addressSecondary.cityCode = "33-01";

        BankAccount bA1 = new BankAccount();
        bA1.owner = person1;
        bA1.balance = 0.0;

        Credit credit1 = new Credit();
        credit1.debtor = person2;
        credit1.debt = 1000;
        credit1.interest = 5;

        //System.out.println("Imię właściciela konta nr 1 : " + bA1.owner.firstName);
        //System.out.println("Balans konta nr 1 : " + bA1.balance);


        printAccountBalance(bA1);



    }
}
