package br.com.bandtec.RESTAPI.Estrutura.de.dados;

public class MinhaCadeira extends Plano {
    private double custoPlano = 3600;
    private double desconto = 0.05;


    public MinhaCadeira(String nome, int idade, String email, String username, String nomePlano,
                        double custoPlano, double desconto) {
        super(nome, idade, email, username, nomePlano);
        this.custoPlano = custoPlano;
        this.desconto = desconto;
    }

    @Override
    public double getCalPlanoAnual() {
        return 3600 - (3600 * 0.05);
    }

}
