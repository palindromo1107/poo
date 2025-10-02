public class Main {

    public static void main(String[] args) {

        Calendario calendario1 = new Calendario(25, 7, 2006);
        Calendario calendario2 = new Calendario(12, 9, 2024);

        calendario1.mostrarData();
        calendario2.mostrarData();

        calendario1.anoBissexto();
        calendario2.anoBissexto();

    }
    
}
