package model;

public class Carro extends Veiculo{
    protected int quantidadePortas;
    protected int quantidadeBancos;
    protected char conversivel;

    public Carro(int quantidadePortas, int quantidadeBancos, char conversivel,
                 String placa, String tipo, String marca, int ano, int cavalos){

        super(placa, tipo, marca, ano, cavalos);

        if(quantidadePortas <= 0){
            throw new IllegalArgumentException("Numero de portas invalida.");
        }
        if(quantidadeBancos < 0){
            throw new IllegalArgumentException("Quantidade de bancos invalida.");
        }

        this.quantidadePortas = quantidadePortas;
        this.quantidadeBancos = quantidadeBancos;
        this.conversivel = conversivel;
    }

    @Override
    public void texto(){
        super.texto();

        System.out.println("Portas: " + quantidadePortas);
        System.out.println("Bancos: " + quantidadeBancos);
        System.out.println("Conversível: " + conversivel);
    }
}
