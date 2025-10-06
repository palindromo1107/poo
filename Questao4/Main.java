public class Main {

    public static void main(String[] args) {

        Fitas fita1 = new Fitas("a volta dos que não foram", 12);
        Fitas fita2 = new Fitas("a bela e a fera", 10);
        Fitas fita3 = new Fitas("velozes e furiosos", 20);

        System.out.println("valor do aluguel por dias");

        System.out.println(fita1.getValorAluguel(10));
        System.out.println(fita2.getValorAluguel(7));
        System.out.println(fita3.getValorAluguel(30) + "\n");

        System.out.println("titulo\n");

        System.out.println(fita1.getTitulo());
        System.out.println(fita2.getTitulo());
        System.out.println(fita3.getTitulo() + "\n");

        System.err.println("custo aluguel");

        System.out.println(fita1.getCustoAluguel());
        System.out.println(fita2.getCustoAluguel());
        System.out.println(fita3.getCustoAluguel() + "\n");

        System.out.println("to string");

        System.out.println(fita1.toString());
        System.out.println(fita2.toString());
        System.out.println(fita3.toString());

    }

}
