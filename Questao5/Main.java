import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Funcionario pedro = new Funcionario(203, "pedro", "123.456.789-10", "são paulo", "4002-8922", 27, 1200);

        System.out.println(pedro);

        System.out.println();
        System.out.println("digite um novo salario");
        float salarioNew = input.nextFloat();

        pedro.setSalario(salarioNew);

        System.out.println(pedro.calculaSalarioLiquido());

        System.out.println();
        System.out.println(pedro + "\nSalario liquido: " + pedro.calculaSalarioLiquido());

    }

}
