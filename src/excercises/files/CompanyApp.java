package excercises.files;

import excercises.files.Employee;

import java.io.*;

public class CompanyApp {
    public static void main(String[] args) {

        Company company = new Company();

        Employee employee1 = new Employee("Monika", "Iksinski", 1000);
        Employee employee2 = new Employee("Tomasz", "Wałek", 3000);
        Employee employee3 = new Employee("Adam", "Wańko", 5000);

        company.addEmployee(employee1);
        company.addEmployee(employee2);
        company.addEmployee(employee3);



        System.out.println(company.toString());

        String fileName = "employeesTable.obj";
        File oldFile = new File(fileName);

        try (FileOutputStream fileOut = new FileOutputStream(fileName);
             ObjectOutputStream objOut = new ObjectOutputStream(fileOut);){
            objOut.writeObject(company);
            System.out.print("zapisano Company ");
            System.out.println("do pliku: " + oldFile.getAbsolutePath() + "\n");
        } catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Nie zapisano");
        }



        String newFileName = "newCompany.obj";
        File newFile = new File(newFileName);
        oldFile.renameTo(newFile);
        System.out.println(oldFile.exists());

        Company newCompany = null;

        try(FileInputStream fileIn = new FileInputStream(newFileName);
            ObjectInputStream objInput = new ObjectInputStream(fileIn);){

            newCompany = (Company)objInput.readObject();
            System.out.println("Wczytano : " + newFile.getAbsolutePath());

        } catch (IOException e ){
            System.out.println(e.getMessage());
        } catch (ClassCastException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }


        System.out.println(newCompany.toString());





    }

}
