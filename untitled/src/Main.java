import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("--------Cadastro---------");
//
//        System.out.println("Digite sua idade?");
//        int idade = scanner.nextInt();//variavel que vai reber os numeros que o usuario digitar
//        System.out.println("Digite seu nome: ");
//        String palavra = scanner.next();
//        System.out.println("Digite sua altura: ");
//        float altura = scanner.nextFloat();
//        System.out.println("Confira seus dados: "  + palavra + "idade: " + idade + "altura: " + altura);


/*
//        1- Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.

            int x = 8, y = 9, z = 7;
            int a = 4, b = 5, c = 6;

            double med1 = ( x + y + z)/3;
            System.out.println("Media 1: " + med1);
            double med2 = (a + b + c)/3;
            System.out.println("Media 2: " + med2);

            double soma = (med1 + med2)/2;
            System.out.println("Soma das medias: " + soma);


        System.out.println("****************************************************************************************");

//        2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.

            Scanner scanner = new Scanner(System.in);

            System.out.println("digite um numero inteiro: ");
            int numero = scanner.nextInt();

            int antecessor = numero -1; //int antecessor = numero--;
            int sucessor = numero + 1; //int antecessor = numero++;

            System.out.println("Numero digitado " + numero + "\n antecessor: " + antecessor + "\n sucessor" + sucessor);

        System.out.println("****************************************************************************************");

//        3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.

            System.out.println("calculando");

            System.out.println("digite um numero inteiro: ");
            int operacao = scanner.nextInt();

        System.out.println("****************************************************************************************");

//        4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final mostre todos os dados informados

            Scanner scanner = new Scanner(System.in);

            System.out.println("digite seus dados");
            System.out.println("Nome: ");
            String nome = scanner.nextLine();
            System.out.println("Sobrenome: ");
            String sobrenome = scanner.nextLine();
            System.out.println("Agora digite sua idade: ");
            int idade = scanner.nextInt();
            System.out.println("Endereço: ");
            String endereco = scanner.next();
            System.out.println("confira os dados informados: ");
            System.out.println("Seu nome: " + nome + "\n sobrenome: " + sobrenome + " \n idade: " + idade + "\n endereço: " + endereco );

        System.out.println("****************************************************************************************");

//        5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse usuario nasceu.
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            System.out.println("Agora sua idade: ");
            int idade = scanner.nextInt();

            int anoNasc = 2024 - idade;
            System.out.println(nome + " Você nasceu em: " + anoNasc);


        System.out.println("****************************************************************************************");

        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual a suda idade? ");
        int idade = leitura.nextInt();

        if(idade >= 18){
            System.out.println("Bem vindo ao sistema!");
        }else{
            System.out.println("Ops, você não pode acessar o sistema!");
        }


        System.out.println("****************************************************************************************");


        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite sua nota final ");
        double nota = leitura.nextDouble();

        if(nota >= 7){
            System.out.println("Aprovado!");
        }else if(nota >= 6){
            System.out.println("Recuperação");
            System.out.println("Digite sua nota de recuperação");
            double notaRec = leitura.nextDouble();
            if(notaRec >= 5){
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado");
            }
        }else {
            System.out.println("Reprovado");
        }

        System.out.println("****************************************************************************************");


        Scanner leitura = new Scanner(System.in);
        double irpr;

        System.out.println("Digite o valor da sua hora de trabalho");
        double vHora = leitura.nextDouble();

        System.out.println("Quantas horas você trablhou no mês?");
        int hTrabalho = leitura.nextInt();

        double salarioBruto = vHora * hTrabalho;

        if( salarioBruto <= 900){
            irpr = 0;
        }else if (salarioBruto <= 1500){
            irpr = salarioBruto * 0.05;
        } else if (salarioBruto <= 2500) {
            irpr = salarioBruto * 0.1;
        }else {
            irpr = salarioBruto * 0.2;
        }

        double descontoInss = salarioBruto * 0.1;
        double fgts = salarioBruto * 0.11;
        double dSindicato = salarioBruto * 0.03;

        double tDesconto = descontoInss + irpr;
        double salarioLiquido = salarioBruto - tDesconto;

        System.out.println("Salário Bruto === " + salarioBruto);
        System.out.println("(-) Imposto de renda === " + irpr);
        System.out.println("(-) INSS === " + descontoInss);
        System.out.println("(-) FGTS === " + fgts);
        System.out.println("Total de desconto = " + tDesconto);
        System.out.println("Salario liquido = " + salarioLiquido);



        Scanner leitura = new Scanner(System.in);

//        System.out.println("Digite um numero correspondente a " + "Um dia da semana considerando o (1) Domingo");
        System.out.println("Selecione uma das opções do menu");
        int diaSemana = leitura.nextInt();

        switch ((diaSemana)){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("");

        }






            ArrayList<Double> notas = new ArrayList<>();
            double soma = 0;

            try (BufferedReader br = new BufferedReader(new FileReader("aluno.txt"))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] partes = linha.split(";");
                    double nota = Double.parseDouble(partes[2]);
                    notas.add(nota);
                    soma += nota;
                }
            } catch (IOException e) {
                System.err.println("Erro ao ler o arquivo: " + e.getMessage());
                System.exit(1);
            }

            if (notas.size() > 0) {
                double media = soma / notas.size();
                System.out.println("Media das notas = " + media);

                for (Double nota : notas) {
                    if (nota >= media) {
                        System.out.println("Nota maior que a media => " + nota);
                    }
                }
            } else {
                System.out.println("Nenhuma nota foi encontrada no arquivo.");
            }

            System.out.println("Fim de programa.");



        //  cire um programa que verifica se um numero digitado pelo usuario é positivo ou negativo

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();
        if (numero < 0 ){
            System.out.println("o numero que você digitou é negativo");
        } else if (numero == 0) {
            System.out.println("o numero que você digitou é zero");
        }else {
            System.out.println("o numero que você digitou é positivo");
        }





        // Solicite ao usuario um dia da semana (em formato numerico de 1 a 7) e exiba o nome correspondente usando bloco switch
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        int diaSemanna = leitura.nextInt();
        switch (diaSemanna){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:

        }




        Scanner leitura = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int numero = leitura.nextInt();

        if (numero > 0) {
            System.out.println("O numero é positivo");
        } else if (numero < 0 ) {
            System.out.println("o numero é negativo");
            numero = Math.abs(numero);
        }else {
            System.out.println("o numero é zero");
        }

        switch (numero % 2){
            case 0:
                System.out.println("o numero é par");
                break;
            case 1:

        }



        //Operardor ternário



        System.out.println("Digite sua idade");
        int idade = leitura.nextInt();

        String retorna = (idade>= 18) ? "Você é maior de iade" : "Você é menor de idade";
        System.out.println(retorna);


        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }



        for (int i = 1 ; i <= 10 ; i++){
            System.out.println(i);
        }

        System.out.println("************************************************");

        for (int k = 10 ; k >= 1 ; k--){
            System.out.println(k);
        }






        // Escreva um programa em java que solicite ao usuario um numero inteiro positivo e, em seguida, exibe uma contagem regressiva a partir desse numero ate zero

        System.out.println("Digite um numero");
        int numero = leitura.nextInt();

        for( int i = numero ; i >= 0 ; i-- ){
            System.out.println(i);

        }


                Random random = new Random();
                int chances = 5, palpite = 0, numerodasorte = random.nextInt(10) + 1;;
                System.out.println(" ==== Vamos iniciar o jogo ====");
                System.out.println(" |                            |");
                System.out.println(" |                            |");
                System.out.println(" | Voce deve acertar o numero |");
                System.out.println(" | que o robo esta pensando   |");
                System.out.println(" |                            |");
                System.out.println(" ==============================");
                for (int i = 5; i > 0; i--) {
                    System.out.println("O jogo começará em " + i + " segundos...");
                    try {
                        Thread.sleep(1000); //nessa linha toda execussao deste codigo vai parar por um segundo
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }

                while(chances > 0 && palpite != numerodasorte){
                    System.out.println("Digite um numero, vamos ver se voce acerta");
                    palpite = leitura.nextInt();

                    if(palpite == numerodasorte){
                        System.out.println("Parabenssssss voce acertou");
                    }else{
                        System.out.println("Tente novamente");
                        chances--;
                        if(chances > 0){
                            System.out.println("Voce ainda tem "+ chances + " chances para acertar" );
                            if (palpite < numerodasorte){
                                System.out.println(" tente um numero maior");
                            }else{
                                System.out.println(" tente um numero menor");
                            }
                        }else{

                            System.out.println("voce nao conseguiu suas chances acabaram!!");
                        }
                    }
                }

                System.out.println("saiu do while");



        int numero;
        numero = 15;

        int[] numeros = new int[3];
        numeros[0] = 9;
        numeros[1] = 10;
        numeros[2] = 5;

        //System.out.println("O valor na primeira posição do array " + numeros[0]);
        //System.out.println("O valor na primeira posição do array " + numeros[1]);
        //System.out.println("O valor na primeira posição do array " + numeros[2]);

        for(int i = 0; i < 3; i++ ){
            System.out.println("o array na posição " + i + " é = " + numeros[i]);
        }


        int[] numeros = {10, 1, 12, 5, 4};

        // Ordenando o array
        Arrays.sort(numeros);

        System.out.println("numeros ordenados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

 */

    //Entrando em orientação a objeto

        System.out.println();









    }

}

