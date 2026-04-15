```mermaid
classDiagram
    Aviao "1"*--"1..8"Motor

    class Aviao{
        - String modelo
        - static int MAXMOTORES
        - int MAXTRIPULANTES
        - int MAXPASSAGEIROS
        - int MAXCARGA
        - int MAXCOMBUSTIVEL
        - ArrayList<Motor> motores
        
        +Aviao(cargamax : int, maxpassa : int, maxtripu : int, maxcomb : int, qtdMotor : int, tipoMotor : String)

        
        
    }
    
    class Motor{
        -String tipoMotor
        -int  CONSUMOHORA
        -bool ligado
        + Motor(tipo : String, consumo : int)
        + ligaMotor()   
        
    }

