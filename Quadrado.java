//visibilidade | palavra chave | nome

public class Quadrado{
    
    //atributo
    
    //tipo | nome | valor
    int lado = 2;
    
    // metodo
    
    //visibilidade | retorno | nome
    
    public int calcularArea(int lado){
        return lado * lado;
    }
    
    public int calcularPerimetro(int l){
        return 4*l;
    }
    
    public void imprimir(int A, int P){
        System.out.print(A + " " + P);
    }
    
}

