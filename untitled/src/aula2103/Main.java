package aula2103;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Scanner scanner = new Scanner(System.in);

        Suprimentos item1 = new Suprimentos(1, "prato", 2, 10);

        System.out.println(item1);
        System.out.println(item1.gettotal());
    }

}
