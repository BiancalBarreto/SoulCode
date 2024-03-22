package aula2003;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Criar objeto
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        Animal animal1 = new Animal("Rafael", 10);
        Animal animal2 = new Animal("Bianca", 10);

        //Mostrar atributos
        System.out.println("O nome do animal é: " + animal1.getNome());
        System.out.println("A idade do animal é: " + animal1.getIdade());
        animal1.aniversarioAnimal();
        System.out.println("A nova idade do animal é: " + animal1.getIdade());

        System.out.println("=========");
        System.out.println("nome do animal2: " + animal2.getNome());

        Animal animal3 = new Animal("Giovanna", 40);
        System.out.println("O nome do animal3 é: " + animal3.getNome());



    }
}
