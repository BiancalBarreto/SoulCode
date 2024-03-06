import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------Cadastro---------");

        System.out.println("Digite sua idade?");
        int idade = scanner.nextInt();//variavel que vai reber os numeros que o usuario digitar
        System.out.println("Digite seu nome: ");
        String palavra = scanner.next();
        System.out.println("Digite sua altura: ");
        float altura = scanner.nextFloat();
        System.out.println("Confira seus dados: "  + palavra + "idade: " + idade + "altura: " + altura);



    }
}

//A história da linguagem de programação Java remonta ao início da década de 1990,
// quando a equipe liderada por James Gosling, Mike Sheridan e Patrick Naughton,
//da Sun Microsystems, iniciou o desenvolvimento do que viria a se tornar uma das
//linguagens de programação mais influentes da história.