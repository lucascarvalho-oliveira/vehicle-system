package model;

public class Veiculo {
    protected String placa;
    protected String tipo;
    protected String marca;
    protected int ano;
    protected int cavalos;

    public Veiculo(String placa, String tipo, String marca, int ano, int cavalos){
        if(placa == null || placa.trim().isEmpty()){
            throw new IllegalArgumentException("Placa invalida.");
        }
        if(tipo == null || tipo.trim().isEmpty()){
            throw new IllegalArgumentException("Modelo invalido.");
        }
        if(marca == null || marca.trim().isEmpty()){
            throw new IllegalArgumentException("marca invalida.");
        }
        if(ano < 1900){
            throw new IllegalArgumentException("Ano invalido.");
        }
        if(cavalos <=  0){
            throw new IllegalArgumentException("Cilindrada incorreta.");
        }

        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.ano = ano;
        this.cavalos = cavalos;
    }

    public void texto(){
        System.out.println("Placa: " + placa);
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Cavalos: " + cavalos);
    }
}
