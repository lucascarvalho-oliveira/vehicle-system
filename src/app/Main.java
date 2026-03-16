package app;

import model.Carro;
import model.Moto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a placa do veiculo:");
        String placa = sc.nextLine();
        System.out.println("Qual o tipo do veiculo:");
        String tipo = sc.nextLine();
        System.out.println("Qual a marca do veiculo:");
        String marca = sc.nextLine();
        System.out.println("Qual o ano do veiculo");
        int ano = sc.nextInt();
        System.out.println("Qual a cilindrada do veiculo");
        int cilindrada = sc.nextInt();

        if(tipo.equalsIgnoreCase("carro")){
            sc.nextLine();
            System.out.println("Quantidade de portas:");
            int portas = sc.nextInt();
            sc.nextLine();
            System.out.println("Quantidade de bancos");
            int bancos = sc.nextInt();
            sc.nextLine();
            System.out.println("O carro e conversível 's' ou 'n':");
            char conversivel = sc.next().charAt(0);

            Carro carro = new Carro(portas, bancos, conversivel,
                    placa, tipo, marca, ano, cilindrada);

            System.out.println();
            carro.texto();
        }
        if(tipo.equalsIgnoreCase("moto")){
            sc.nextLine();
            System.out.println("Qual a categoria da moto:");
            String categoria = sc.nextLine();

            Moto moto = new Moto(categoria, placa, tipo, marca, ano, cilindrada);

            System.out.println();
            moto.texto();
        }
        else{
            System.out.println("Tipo de veiculo invalido");
        }

        sc.close();
    }
}