import java.util.Scanner;

public class ProfundidadeSubmarino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a profundidade do submarino em metros: ");
        int profundidade = input.nextInt();

        double probabilidade = 0.0;

        if (profundidade <= 100) {
            probabilidade = 0.1;
        } else if (profundidade <= 500) {
            probabilidade = 0.2;
        } else if (profundidade <= 1000) {
            probabilidade = 0.3;
        } else if (profundidade <= 1500) {
            probabilidade = 0.4;
        } else if (profundidade <= 2000) {
            probabilidade = 0.5;
        } else if (profundidade <= 2500) {
            probabilidade = 0.6;
        } else if (profundidade <= 3000) {
            probabilidade = 0.7;
        } else if (profundidade <= 3500) {
            probabilidade = 0.8;
        } else if (profundidade <= 4000) {
            probabilidade = 0.9;
        } else {
            probabilidade = 1;
        }

        System.out.println("Probabilidade de morte: " + (probabilidade * 100) + "%");
    }
}
