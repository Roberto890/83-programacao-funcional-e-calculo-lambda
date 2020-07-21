package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program2 {

    public static int compareProducts(Product p1, Product p2) {
        return p1.getPrice().compareTo(p2.getPrice());
    }

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));


        //Na programação funcional pode passar uma função como argumento de outra função
        //Isso significa que a função é um objeto de primeira classe/ordem

        //"method references" Operador ::
        //sintaxe:     Classe::método
        list.sort(Program2::compareProducts);

        list.forEach(System.out::println);

    }
}