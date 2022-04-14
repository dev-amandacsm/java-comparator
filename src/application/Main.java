package application;

import entities.Product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        Collections.sort(list);
        //para ordenar **objetos** eh preciso implementar
        //a interface comparable
        //em tipos primitivos nao eh necessario, pois eles ja
        //vem com a implementacao

        System.out.println("PRODUCT LIST-------------");

        for(Product p : list) System.out.println(p);

        List<Integer> myInts = Arrays.asList(5, 1, 3, 8, 2, 4);
        Collections.sort(myInts);

        System.out.println("\n\nINTEGER LIST-------------");
        for(Integer i : myInts) System.out.println(i);

    }
}
