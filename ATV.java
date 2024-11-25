/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atv;

class Animal {

private String nome;

public Animal(String nome) {
this.nome = nome;
}

public String getNome() {
return nome;
}

public void setNome(String nome) {
this.nome = nome;
}

void fazerSom() {
System.out.println(";Som do animal");
}
}

// Subclasse Cachorro
class Cachorro extends Animal {
public Cachorro(String nome) {
super(nome);
}

@Override

void fazerSom() {
System.out.println(getNome() + "; diz: Au Au");
}
}

// Subclasse Gato
class Gato extends Animal {
public Gato(String nome) {
super(nome);
}

@Override
void fazerSom() {
System.out.println("Miau diz: Miau"); // Modificado para uma saída fixa
}
}

public class ATV {

    
    public static void main(String[] args) {
 Animal meuCachorro = new Cachorro("Rex");
Animal meuGato = new Gato("Miau");

meuCachorro.fazerSom(); // Saída: Rex diz: Au Au
meuGato.fazerSom(); // Saída: Miau diz: Miau
    }
    }

    