package org.example;

import java.util.ArrayList;

public class Aviao {

    private String modelo;
    static private final int MAXMOTORES = 8;
    private final int MAXTRIPULANTES;
    private final int MAXPASSAGEIROS;
    private final int MAXCARGA;
    private final int MAXCOMBUSTIVEL;
    private ArrayList<Motor> motores;

    public Aviao(String modelo, int MAXTRIPULANTES, int MAXPASSAGEIROS, int MAXCARGA, int MAXCOMBUSTIVEL, int qtdMotores, String tipoMotor, int consumoMotor) {
        //this.MAXMOTORES = MAXMOTORES;
        this.modelo = modelo;
        this.MAXTRIPULANTES = MAXTRIPULANTES;
        this.MAXPASSAGEIROS = MAXPASSAGEIROS;
        this.MAXCARGA = MAXCARGA;
        this.MAXCOMBUSTIVEL = MAXCOMBUSTIVEL;
        if(qtdMotores <= MAXMOTORES) {

            }
        }
    private addMotor( int qtd, int consumo)(            for (int i = 1; i <= qtdMotores) {
        Motor motor = new Motor(tipoMotor, consumoMotor);
        motores.add(motor);
                )
    }

}
