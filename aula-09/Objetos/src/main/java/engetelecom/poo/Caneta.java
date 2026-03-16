package engetelecom.poo;

public class Caneta {

        private String cor ;
        private double nivelTinta;
        private boolean comTampa = true ;

        public void setCor(String c){
                this.cor = c;
        }

        public String getCor(){
                return this.cor;
        }
        public void setNivelTinta(double n){
                this.nivelTinta = n;
        }

        public double getNivelTinta(){
                return this.nivelTinta;
        }

        public void setTampa(){
                this.comTampa = !this.comTampa;
        }

        public String desenhar(double x1, double x2, double y1, double y2){
                if (comTampa) return "Retire a tampa antes de usar a caneta.";
                double distancia = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
                double consumo = distancia * 0.01;
                if ( consumo > this.nivelTinta) return "Não há tinta suficiente para essa distância, desenhar abortado";
                this.nivelTinta -= consumo;
                return String.format("Desenhei %.2f  cm e consumi aproximadamente %.2f de tinta ", distancia,consumo) ;
        }

}
