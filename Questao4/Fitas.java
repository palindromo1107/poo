public class Fitas {

    private String titulo;
    private int precoAluguel;

    public Fitas(String titulo, int precoAluguel) {
        this.titulo = titulo;
        this.precoAluguel = precoAluguel;
    }

    public int getCustoAluguel() {
        return precoAluguel;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getValorAluguel(int numeroDeDiasAlugada) {
        String output = "O valor do aluguel por " + numeroDeDiasAlugada + " dias é "
                + numeroDeDiasAlugada * precoAluguel;
        return output;
    }

    public String toString() {
        return "Fita{nome='" + titulo + "', valor aluguel=" + precoAluguel + "}";
    }

}
