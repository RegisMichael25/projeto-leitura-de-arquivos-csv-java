import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExecucaoCodigo {
    static List<Alunos> listAlunos = new ArrayList<>();
    static List<Livros> listLivros = new ArrayList<>();

    public static void escolhaUsuario(String escolhaDoUsuario) {
        Scanner scanner = new Scanner(System.in);
        String escolhaDoUsuarioMenuAluno2;
        switch (escolhaDoUsuario) {
            case "1":
                System.out.println("----------------------------------------");
                System.out.println(
                        "Menu Aluno\n" +
                                "[1] - Adicionar Aluno\n" +
                                "[2] - Editar Aluno\n" +
                                "[3] - Remover Aluno\n" +
                                "[4] - Mostrar Alunos"
                );
                System.out.println("----------------------------------------");
                String strAluno = "aluno";
                escolhaDoUsuarioMenuAluno2 = scanner.nextLine();
                switch (escolhaDoUsuarioMenuAluno2) {
                    case "1":
                        try {
                            ArquivoService.adicionandoItensAoArquivo(strAluno,Alunos.getArquivoAluno());

                            System.out.println("Aluno adicionado");

                            break;
                        } catch (Exception e) {
                            e.getMessage();
                        }
                    case "2":
                        System.out.println("Aluno editado!");
                        break;
                    case "3":
                        ArquivoService.removerItemDoArquivo(String.valueOf(Alunos.getArquivoAluno()),listAlunos,listLivros);
                        break;
                    case "4":
                        Alunos.listarAlunos();
                        break;
                    default:
                        System.out.println("Sem alterações...");
                        break;
                }
                break;
            case "2":

                System.out.println(
                        "Menu Livro\n" +
                                "[1] - Adicionar Livro\n" +
                                "[2] - Editar Livro\n" +
                                "[3] - Remover Livro\n" +
                                "[4] - Mostrar Livros"
                );
                String strLivro = "livro";
                escolhaDoUsuarioMenuAluno2 = scanner.nextLine();
                switch (escolhaDoUsuarioMenuAluno2) {
                    case "1":
                        try {
                            ArquivoService.adicionandoItensAoArquivo(strLivro,Livros.getArquivoLivro());
                            System.out.println("Livro adicionado");
                            break;
                        } catch (Exception e) {
                            e.getMessage();
                        }
                        break;
                    case "2":
                        System.out.println("Livro editado!");
                        break;
                    case "3":
                        ArquivoService.removerItemDoArquivo(String.valueOf(Alunos.getArquivoAluno()),listAlunos,listLivros);
                        System.out.println("Livro removido!");
                        break;
                    case "4":
                        Livros.listarLivros();
                        break;
                    default:
                        System.out.println("Sem alterações...");
                        break;
                }
        }
    }
}
