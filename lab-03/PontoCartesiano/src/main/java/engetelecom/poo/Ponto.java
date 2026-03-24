package engetelecom.poo;

public class Ponto {
        private double  x,
                        y;

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x)  { this.x = x; }
    public void setY(double y)  { this.y = y; }
    public double getX()        { return this.x; }
    public double getY()        { return this.y; }

    public double distancia(Ponto outro){
        double deltaX = Math.pow(outro.x-this.x,2);
        double deltaY = Math.pow(outro.y-this.y,2);
        return Math.sqrt(deltaX+deltaY);
    }

    @Override
    public String toString() {
        return String.format("(%.1f , %.1f)", this.x,this.y);
    }
}
