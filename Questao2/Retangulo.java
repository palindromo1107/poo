public class Retangulo{

    private int largura;
    private int comprimento;

    public Retangulo(int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;
    }
    
    public int calcularArea(){
        return comprimento * largura;
    }
    
    public int calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }
    
    public void imprimir(){
        System.out.println("comprimento: " + comprimento);
        System.out.println("largura: " + largura);
        System.out.println("area: " + calcularArea());
        System.out.println("perimetro: " + calcularPerimetro());
    }
    
}
