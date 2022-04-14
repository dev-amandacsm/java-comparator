package application;

import entities.Product;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        //funcao anonima (ou arrow function):
        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        
        list.sort(comp);

        System.out.println("PRODUCT LIST-------------");

        for(Product p : list) System.out.println(p);

    }
}
