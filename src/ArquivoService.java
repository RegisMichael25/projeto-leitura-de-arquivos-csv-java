import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class ArquivoService {
    static List<Alunos> listAlunos = new ArrayList<Alunos>();
    public static void adicionandoItensAoArquivo(String livroOuAluno, File arquivo) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

    int identificador = random.nextInt(1000) - 1;
    String nome;
        try {
            FileWriter escritor = new FileWriter(arquivo, true);
            escritor.write((identificador += 1) + ";");

            System.out.println("----------------------------------------");
            System.out.println("Informe o nome do " + livroOuAluno + ":");

            nome = scanner.nextLine();
            escritor.write(nome + "\n");

            escritor.flush();
            escritor.close();

            System.out.println(livroOuAluno + "adicionado com sucesso.");
            System.out.println("----------------------------------------");

        } catch (Exception e) {

            System.out.println("----------------------------------------");
            System.out.println("Error ao ler o arquivo do: "+ livroOuAluno + ":" + e.getMessage());
            System.out.println("----------------------------------------");
            e.printStackTrace();

        }
    }

    public static  void leituraDoArquivo(File arquivo) {

        try {

            InputStream is = new FileInputStream(arquivo);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linha;


            try {
                while((linha = br.readLine()) != null) {

                        System.out.println(Arrays.toString(linha.split(";")));

                    }

            } catch (Exception e) {

                System.out.println("Error: " + e.getMessage());

            }
        } catch(Exception e) {

            System.out.println("----------------------------------------");
            System.out.println("Ocorreu um erro na tentativa.");
            System.out.println("----------------------------------------");
            e.printStackTrace();

        }

    }


    public static void removerItemDoArquivo(String arquivo, List alunos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual item deseja remover: ");
        String item = scanner.nextLine();
        if (arquivo == Alunos.getArquivoAluno().getName()) {
            try{
                for(Object aluno : alunos) {
                    if(item.equalsIgnoreCase(String.valueOf(aluno))){
                        alunos.remove(item);
                    }
                }

            } catch (Exception e) {
                e.getMessage();
            }
        }

    }

    public static void carregarItensArquivo(File arquivo) {
        List<String> listaTemporaria = new ArrayList<String>();
        try {
            InputStream is = new FileInputStream(arquivo);
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linha;
                if(arquivo.equals(Alunos.getArquivoAluno())) {
                    try {
                        while((linha = br.readLine()) != null) {
                                listaTemporaria.add(linha);
                        }

                        for (Alunos aluno:listaTemporaria ){

                            Alunos alunoTemp = new Alunos();
                            listAlunos.add(alunoTemp);
                        }
                        
                        for (Alunos aluno:listAlunos) {
                            System.out.println(aluno.getNomeAluno()+ "," + aluno.getMatriculaAluno());
                        }

                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    // Inicio do programa executavel

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
                            adicionandoItensAoArquivo(strAluno,Alunos.getArquivoAluno());

                            System.out.println("Aluno adicionado");

                        break;
                        } catch (Exception e) {

                            e.getMessage();

                        }
                    case "2":

                        System.out.println("Aluno editado!");

                        break;
                    case "3":
                        System.out.println("Aluno removido!");
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

                            adicionandoItensAoArquivo(strLivro,Livros.getArquivoLivro());
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
                        System.out.println("Livro removido!");
                        break;
                    case "4":
                        System.out.println("Livros Cadastrados:");
                        Livros.listarLivros();
                        break;
                    default:
                        System.out.println("Sem alterações...");
                        break;
                }
        }
    }


//    public static void testeDosMetodosDoArquivo() {
//    // Retorna todo o caminho do arquivo
//        System.out.println("-------------------------getAbsolutePath()");
//        System.out.println(arquivoLivro.getAbsolutePath());
//        System.out.println(arquivoAluno.getAbsolutePath());
//    // Retorna apenas o nome do arquivo
//        System.out.println("----------------------------getName()");
//        System.out.println(arquivoLivro.getName());
//        System.out.println(arquivoAluno.getName());
//    // Retorna os "parentes" do arquivo (toda a URL antes do arquivo em si)
//        System.out.println("-----------------------------getParent()");
//        System.out.println(arquivoLivro.getParent());
//        System.out.println(arquivoAluno.getParent());
//    // Pega todo o caminho informado para a máquina
//        System.out.println("---------------------getPath()");
//        System.out.println(arquivoLivro.getPath());
//        System.out.println(arquivoAluno.getPath());
//    // Pega a classe importada
//        System.out.println("--------------------------------getClass()");
//        System.out.println(arquivoLivro.getClass());
//        System.out.println(arquivoAluno.getClass());
//    // Pega toda a raiz do arquivo
//        System.out.println("-------------------------------getAbsoluteFile()");
//        System.out.println(arquivoLivro.getAbsoluteFile());
//        System.out.println(arquivoAluno.getAbsoluteFile());
//    }


}
