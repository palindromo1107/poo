//visibilidade | palavra chave | nome

public class Retangulo{
    
    //atributo
    
    //tipo | nome | valor
    int largura = 2;
    int comprimento= 4;
    
    // metodo
    
    //visibilidade | retorno | nome
    
    public int calcularArea(int C, int L){
        return C * L;
    }
    
    public int calcularPerimetro(int L, int C){
        return (2 * C) + (2 * L);
    }
    
    public void imprimir(int A, int P){
        System.out.print(A + " " + P);
    }
    
}

