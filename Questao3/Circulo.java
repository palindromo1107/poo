public class Circulo{

    private int raio;
    private double pi = 3.14;

    public Circulo(int raio){
        this.raio = raio;
        
    }
    
    public int calcularArea(){
        return (int)(pi * raio * raio);
    }

    public int calcularPerimetro(){
        return (int)(2 * pi * raio);
    }
    
    public void imprimir(){
        System.out.println("raio: " + raio);
        System.out.println("area: " + calcularArea());
        System.out.println("perimetro: " + calcularPerimetro());
    }
}
