package excercises.innerClasses;

import java.util.Arrays;

public class BubleSort {


    public static void main(String[] args) {

        int[] table = {1,3,2,5,7,0,4};

        Sortable bubleSort = new Sortable(){
            @Override
            public int[] sort(int[] tab) {
                for (int i = 0; i < tab.length; i++) {
                    for (int j = 1; j < tab.length-i; j++) {
                        System.out.println(tab[j-1] + ", " + tab[j]);
                        if (tab[j-1]>tab[j]){
                            int temp = tab[j-1];
                            tab[j-1]=tab[j];
                            tab[j]=temp;
                            System.out.println(tab[j-1] + ", " + tab[j]);
                        }
                    }
                    System.out.println("---------------");
                }

                return tab;
            }
        };

        for (int i : table) {
            System.out.print(i + ", ");
        }

        System.out.println("-------------------");

        bubleSort.sort(table);

        for (int i : table) {
            System.out.print(i + ", ");
        }

    }

}
