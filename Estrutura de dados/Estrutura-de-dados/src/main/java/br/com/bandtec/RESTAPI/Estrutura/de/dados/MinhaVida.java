package br.com.bandtec.RESTAPI.Estrutura.de.dados;

public class MinhaVida extends Plano{

    private double custoPlano = 199;
    private double desconto = 0.05;

    public MinhaVida(String nome, int idade, String email, String username, String nomePlano,
                     double custoPlano, double desconto) {
        super(nome, idade, email, username, nomePlano);
        this.custoPlano = custoPlano;
        this.desconto = desconto;
    }

    @Override
    public double getCalPlanoAnual() {
        return 199 - (199 * 0.05);
    }
}
