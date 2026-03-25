package engetelecom.poo;

public class Horario {
    private int hora,
                minuto,
                segundo;

    public Horario(int hor, int min, int seg){
        if(!(this.setHora(hor) && this.setMinuto(min) && this.setSegundo(seg))){
            this.hora = this.minuto = this.segundo = 0;
        }
    }
    public Horario(int hor)             { this(hor,0,0); }
    public Horario(int hora, int min)   { this(hora,min,0);}

    public boolean setHora(int hor){
        if(hor >= 0 && hor < 24) {
            this.hora = hor;
            return true;
        }
        return false;
    }
    public boolean setMinuto(int min){
        if(min >= 0 && min < 60) {
            this.minuto = min;
            return true;
        }
        return false;
    }
    public boolean setSegundo(int seg){
        if(seg >= 0 && seg < 60) {
            this.segundo = seg;
            return true;
        }
        return false;
    }

    public StringBuilder porExtenso(){
        StringBuilder extenso= new StringBuilder();
        int[] horarioMatriz = new int[]{this.hora,70,this.minuto,80,this.segundo,90};
        for (int tempo : horarioMatriz) {
            if(tempo == 0) {
                extenso.append("zero ");
                continue;
            }
            boolean menor20 = tempo < 20 ? true : false;
            int[] dezenaEunidade = new int[]{menor20 ? 0 : (tempo / 10) * 10 ,menor20 ? tempo : tempo % 10};
            for(int num : dezenaEunidade){
                switch (num) {
                    case 0: extenso.append( tempo == 0 ? " zero": ""); break;
                    case 1: extenso.append(" um ");         break;
                    case 2: extenso.append(" dois ");       break;
                    case 3: extenso.append(" três ");       break;
                    case 4: extenso.append(" quatro ");     break;
                    case 5: extenso.append(" cinco ");      break;
                    case 6: extenso.append(" seis ");       break;
                    case 7: extenso.append(" sete ");       break;
                    case 8: extenso.append(" oito ");       break;
                    case 9: extenso.append(" nove ");       break;
                    case 10: extenso.append(" dez ");       break;
                    case 11: extenso.append(" onze ");      break;
                    case 12: extenso.append(" doze ");      break;
                    case 13: extenso.append(" treze ");     break;
                    case 14: extenso.append(" quatorze ");  break;
                    case 15: extenso.append(" quinze ");    break;
                    case 16: extenso.append(" dezeseis ");  break;
                    case 17: extenso.append(" dezesete ");  break;
                    case 18: extenso.append(" dezoito ");   break;
                    case 19: extenso.append(" dezenove ");  break;
                    case 20: extenso.append(" vinte ");     break;
                    case 30: extenso.append(" trinta ");    break;
                    case 40: extenso.append(" quarenta ");  break;
                    case 50: extenso.append(" cinquenta "); break;
                    case 70: extenso.append(num != 1 ? "horas,": "hora,");       break;
                    case 80: extenso.append(num != 1 ? "minutos e ":"minuto e"); break;
                    case 90: extenso.append(num != 1 ? "segundos": "segundo");    break;
                }
                extenso.append(num > 19 && dezenaEunidade[1] > 0 ? "e":"");
            }
        }
        return extenso;
    }

    public int paraSegundos(){
        return this.hora*3600 + this.minuto*60 + this.segundo;
    }
    public int diferencaHorarios(Horario outro){
        return this.paraSegundos() - outro.paraSegundos();
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora,this.minuto,this.segundo);
    }
}
