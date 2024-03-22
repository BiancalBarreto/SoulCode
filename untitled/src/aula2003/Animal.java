package aula2003;

public class Animal {
    //attributos
    private String nome;
    private int idade;
    String especie;
    String cor;
    String genero;
    String grupo;

    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public void aniversarioAnimal(){
        idade++;
    }
    //esse metodo insere no banco de dados com os atributos nome, idade, etc
    public void inserenobancodedados(){

    }
}
