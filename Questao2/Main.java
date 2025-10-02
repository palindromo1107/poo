public class Main{
    
    public static void main (String[] args) {
        
        //objeto
        //tipo| nome | new | classe
        Retangulo r = new Retangulo();
        
        int l = r.largura;
        int c = r.comprimento;
        
        int area = r.calcularArea(l, c);
        
        int perimetro = r.calcularPerimetro(l, c);
        
        r.imprimir(area, perimetro);
        
    }
    
}
