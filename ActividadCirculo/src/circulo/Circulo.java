package circulo;


public class Circulo implements Comparable<Circulo> {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    public double calcularArea(){
        
        return Math.PI * radio*radio;
    }
    
    public double calcularPerimetro() {
        
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return String.format("%s%f%n%s%f%n%s%f%n", "El radio del circulo es ",radio,"El area del circulo es ",calcularArea(),
                "El perimetro del circulo es ",calcularPerimetro());
    }
    
    @Override
    public int compareTo(Circulo c) {
        if (c.getRadio() > radio) {
            return -1;
        } else {
            return 1;
        }
    }
    
}
