package aula2103pt2;

public class Main {
    public static void main(String[] args){
        Colaborador c = new Colaborador("Bianca", "Barreto", 90);

        c.setSlarioMensal(20);
        c.ajusteSalario();
        System.out.println(c.salarioAnual());
    }
}
