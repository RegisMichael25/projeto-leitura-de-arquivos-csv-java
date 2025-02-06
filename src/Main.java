import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "Menus \n" +
                        "[1] - Menu Aluno\n" +
                        "[2] - Menu Livro"
        );

        System.out.println("Qual menu deseja entrar?");

        String escolha = scanner.nextLine();
        ExecucaoCodigo.escolhaUsuario(escolha);
    }
}