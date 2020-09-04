package br.com.bandtec.RESTAPI.Estrutura.de.dados;


public class MinhaHistoria extends Plano {

    private double custoPlano = 484.50;
    private double desconto = 0.05;

    public MinhaHistoria(String nome, int idade, String email, String username, String nomePlano,
                         double custoPlano, double desconto) {
        super(nome, idade, email, username, nomePlano);
        this.custoPlano = custoPlano;
        this.desconto = desconto;
    }

    @Override
    public double getCalPlanoAnual() {
        return 484.50 - (484.50 * 0.05);
    }

    
}
