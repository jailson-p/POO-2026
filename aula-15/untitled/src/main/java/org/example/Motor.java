package org.example;

public class Motor {
    private String tipoMotor;
    private final int CONSUMOHORA;
    private boolean ligado;

    public Motor(String tipo, int consumo){
        this.tipoMotor = tipo;
        this.CONSUMOHORA = consumo;
        this.ligado = false;
    }

}
