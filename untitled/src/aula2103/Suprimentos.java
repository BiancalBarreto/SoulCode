package aula2103;

public class Suprimentos {
    private int numeroFaturado;
    private String descricao;
    private int qtdeComprada;
    private double precoUnitario;



    public Suprimentos(int numeroFaturado, String descricao, int qtdeComprada, double precoUnitario) {

        if (qtdeComprada < 0 && precoUnitario < 0) {
            this.numeroFaturado = numeroFaturado;
            this.descricao = descricao;
            this.qtdeComprada = 0;
            this.precoUnitario = 0;
        }else {
            this.numeroFaturado = numeroFaturado;
            this.descricao = descricao;
            this.qtdeComprada = qtdeComprada;
            this.precoUnitario = qtdeComprada;
        }
    }


    public int getNumeroFaturado() {
        return numeroFaturado;
    }

    public void setNumeroFaturado(int numeroFaturado) {
        this.numeroFaturado = numeroFaturado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdeComprada() {
        return qtdeComprada;
    }

    public void setQtdeComprada(int qtdeComprada) {
        this.qtdeComprada = qtdeComprada > 0 ? qtdeComprada : 0 ;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario ;
    }

    public double gettotal() {
        return qtdeComprada * precoUnitario;
    }

    @Override
    public String toString() {
        return "Suprimentos{" +
                "numeroFaturado=" + numeroFaturado +
                ", descricao='" + descricao + '\'' +
                ", qtdeComprada=" + qtdeComprada +
                ", precoUnitario=" + precoUnitario +
                '}';
    }
}
