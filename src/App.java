import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor ganho por hora");
        double ganhosTrabalho = teclado.nextDouble();

        System.out.println("Digite o Numero de horas trabalhadas no Mês");
        double quantidadeHorasTrabalhadas = teclado.nextDouble();

        double SalarioMensal = (ganhosTrabalho * quantidadeHorasTrabalhadas);

        teclado.close();

        System.out.println(SalarioMensal);
    }
}
