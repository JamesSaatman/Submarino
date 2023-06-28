import java.util.Scanner;

public class ViagemSubmarino {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] pessoas = new String[5];
        String[] motivos = new String[5];

        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            pessoas[i] = input.nextLine();
            System.out.print("Digite o motivo da indicação: ");
            motivos[i] = input.nextLine();
        }

        System.out.println("\nPessoas indicadas e seus motivos:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: " + pessoas[i]);
            System.out.println("Motivo: " + motivos[i]);
            System.out.println();
        }
    }
}