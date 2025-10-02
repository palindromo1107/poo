public class Main{
    
    public static void main (String[] args) {
        
        //objeto
        //tipo| nome | new | classe
        Quadrado quadrado = new Quadrado();
        
        int l = quadrado.lado;
        
        int area = quadrado.calcularArea(l);
        
        int perimetro = quadrado.calcularPerimetro(l);
        
        quadrado.imprimir(area, perimetro);
        
    }
    
}
