import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArquivoService.carregarItensArquivo(Alunos.getArquivoAluno());

        //        Scanner scanner = new Scanner(System.in);
//        System.out.println(
//                "Menus \n" +
//                        "[1] - Menu Aluno\n" +
//                        "[2] - Menu Livro"
//        );
//        String escolha = scanner.nextLine();
//        ArquivoService.escolhaUsuario(escolha);
    }
}