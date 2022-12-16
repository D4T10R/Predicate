package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.0));
        list.add(new Product("Mouse", 50.0));
        list.add(new Product("Tablet", 350.0));
        list.add(new Product("HD Case", 80.90));


        System.out.println("\nLista normal: ");
        for (Product p : list) {
            System.out.println(p);
           
        }

        Double min = 100.0;

        // list.removeIf(p -> p.getPreco() >= 100.0);  Forma NORMAL

        // list.removeIf(new ProductPredicate()); Usando uma classe Util que Implementa Predicate e retnorva TRUE ou FALSE 

        // list.removeIf(Product::staticProductPredicate); Metodo statico presente na classe Product que excluir produtos de acordo com a condição

        // list.removeIf(Product::nonStaticProductPredicate); Metodo NÃO statico presente na classe Product que excluir produtos de acordo com a condição
        
        // Predicate<Product> pred = p -> p.getPreco() >= min; Desta forma faço uma função anonyma ue recebe um predicado
        
        list.removeIf(p -> p.getPreco() >= min); // Não precisa declarar um predicado dentro de uma função anonyma

        System.out.println("\nLista depois de removeIf() : ");
        for (Product p : list) {
            System.out.println(p);
        }

    }


}