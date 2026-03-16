package model;

public class Moto extends Veiculo{
    protected String categoria;

    public Moto(String categoria, String placa, String tipo, String marca, int ano, int cavalos){

        super(placa, tipo, marca, ano, cavalos);

        if(categoria == null || categoria.trim().isEmpty()){
            throw new IllegalArgumentException("Categoria invalida.");
        }

        this.categoria = categoria;
    }

    @Override
    public void texto(){
        super.texto();

        System.out.println("Categoria: " + categoria);
    }
}
