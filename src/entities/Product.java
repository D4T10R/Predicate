package entities;

public class Product {
    
    // ATRIBUTOS
    private String name;
    private Double preco;
    // ATRIBUTOS

    // CONSTRUTORES
    public Product(String name, Double preco) {
        this.name = name;
        this.preco = preco;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    // ENCAPSULAMENTO

    // METODOS


    public String toString() {
        return "Nome: " + name + " custa: R$" + preco;
    }

    public static boolean staticProductPredicate(Product p) {
        return p.getPreco() >= 100.0;
    }

    public boolean nonStaticProductPredicate() {
        return preco >= 100.0;
    }
    // METODOS

    

    

}
