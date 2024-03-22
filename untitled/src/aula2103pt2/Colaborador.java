package aula2103pt2;

public class Colaborador {

    private String primeiroNome;
    private String segundoNome;
    private double slarioMensal;

    public Colaborador(String primeiroNome, String segundoNome, double slarioMensal) {
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        if (slarioMensal < 0){
            this.slarioMensal = 0;
        }else {
            this.slarioMensal = slarioMensal;
        }

    }

    public double salarioAnual(){
        return slarioMensal * 12;
    }
    public double ajusteSalario(){
        return slarioMensal *= 1.10;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public double getSlarioMensal() {
        return slarioMensal;
    }

    public void setSlarioMensal(double slarioMensal) {
        this.slarioMensal = slarioMensal;
    }
}
