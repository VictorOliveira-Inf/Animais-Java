/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv2;

abstract class Veiculo {
    // Método abstrato para ser implementado nas subclasses
    abstract void descricao();
}

// Subclasse Carro
class Carro extends Veiculo {
    private String modelo;
    private String marca;

    public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    void descricao() {
        System.out.println("Carro: " + modelo + " da marca " + marca);
    }
}

// Subclasse Bicicleta
class Bicicleta extends Veiculo {
    private String tipo;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
    }

    @Override
    void descricao() {
        System.out.println("Bicicleta: " + tipo);
    }
}

// Classe principal para testar

public class Atv2 {

   
    public static void main(String[] args) {
       Veiculo meuCarro = new Carro("Fusca", "Volkswagen");
        Veiculo minhaBicicleta = new Bicicleta("Mountain Bike");

        meuCarro.descricao();        // Saída: Carro: Fusca da marca Volkswagen
        minhaBicicleta.descricao();  // Saída: Bicicleta: Mountain Bike
    }
    
}
