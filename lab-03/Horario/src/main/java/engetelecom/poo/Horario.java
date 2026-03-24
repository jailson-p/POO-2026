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
        int[] horarioMatriz = new int[]{this.hora,this.minuto,this.segundo};
        for (int tempo : horarioMatriz) {
            boolean menor20 = tempo < 20 ? true : false;
            int dezena = menor20 ? 0 : (tempo / 10) * 10 ;
            int unidade = menor20 ? tempo : tempo % 10;
            switch (tempo) {
                case 0: extenso.append(" zero ");            break;
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
            }
        }


        return extenso.toString();
    }


    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora,this.minuto,this.segundo);
    }
}
