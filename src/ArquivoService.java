import java.io.*;
import java.util.*;


public class ArquivoService {
    public static void adicionandoItensAoArquivo(String livroOuAluno, File arquivo)
    {
        try(Scanner scanner = new Scanner(System.in))
        {
            FileWriter fr = new FileWriter(arquivo, true);
            BufferedWriter escritor = new BufferedWriter(fr);

            Random random = new Random();

            int identificador = random.nextInt(1000);

            System.out.println("----------------------------------------");
            System.out.println("Informe o nome do " + livroOuAluno + ":");
            String nome = scanner.nextLine();

            if (livroOuAluno.equals("aluno"))
            {
                escritor.write(identificador + ";" + nome + "\n");
            }

            if (livroOuAluno.equals("livro"))
            {
                escritor.write(identificador + ";" + nome + "\n");
            }
                escritor.flush();
            System.out.println("----------------------------------------");

        }
            catch (Exception e)
        {

            System.out.println("Error ao ler o arquivo do: "+ livroOuAluno + ":" + e.getMessage());
            e.printStackTrace();

        }
    }

    private static String toString(int identificador)
    {
        String id = identificador + "";
        return id;
    }

    public static  void leituraDoArquivo(File arquivo, String livroOuAluno, List<Alunos> listaAlunos, List<Livros> listaLivros) {

        try(BufferedReader br = (new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"))))
        {
            String linha;
                while((linha = br.readLine()) != null)
                {
                    if (livroOuAluno.equals("aluno"))
                    {
                        String[] item = linha.split(";");
                        if(item[0].equals("ID") && item[1].equals("NOME"))
                        {
                            System.out.println("Lista de alunos: ");
                        }
                        else
                        {
                            Alunos a = new Alunos(item[0], item[1]);
                            listaAlunos.add(a);
                        }
                    }

                    if (livroOuAluno.equals("livro"))
                    {
                         String[] item = linha.split(";");
                         if(item[0].equals("ID") && item[1].equals("NOME"))
                         {
                             System.out.println("Lista de livros:");
                         }
                         else
                         {
                            Livros l = new Livros(item[0], item[1]);
                            listaLivros.add(l);
                         }

                    }
                }

                if(livroOuAluno.equals("aluno"))
                {
                    for (Alunos aluno : listaAlunos)
                        {
                            System.out.println(" Matricula: " + aluno.getMatriculaAluno() + "\n" + "Nome: " + aluno.getNomeAluno());
                        }

                }

                if(livroOuAluno.equals("livro"))
                {
                    for(Livros livro : listaLivros)
                    {
                        System.out.println("ID: " + livro.getId() + "\n" + "Nome: " + livro.getNomeLivro());
                    }
                }
        }
            catch(Exception e)
        {
            System.out.println("Ocorreu um erro na tentativa. " + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void removerItemDoArquivo(String arquivo, List<Alunos> alunos, List<Livros> livros)
    {
        try(BufferedReader br = (new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8")));Scanner scanner = new Scanner(System.in))
        {
            String item;

            if (arquivo.equals(Alunos.getArquivoAluno().getAbsolutePath()))
            {
                System.out.println("Que aluno deseja remover? ");
                item = scanner.nextLine();

                Iterator<Alunos> iterator = alunos.iterator();

                boolean encontrado = false;

                while(iterator.hasNext())
                {
                    Alunos aluno = iterator.next();

                    if(aluno.getNomeAluno().equalsIgnoreCase(item))
                    {
                        iterator.remove();
                        encontrado = true;
                        System.out.println("Aluno removido com sucesso.");
                        break;
                    }
                }

                if(!encontrado)
                {
                    System.out.println("Aluno não encontrado.");
                }
            }
            else if (arquivo.equals(Livros.getArquivoLivro().getName()))
            {
                System.out.println("Que livro deseja remover? ");
                item = scanner.nextLine();
                Iterator<Livros> iterator = livros.iterator();

                boolean encontrado = false;

                while(iterator.hasNext())
                {
                    Livros livro = iterator.next();

                    if(livro.getNomeLivro().equalsIgnoreCase(item))
                    {
                        iterator.remove();
                        encontrado = true;
                        System.out.println("Livro removido com sucesso.");
                        break;
                    }
                }

                if(!encontrado)
                {
                    System.out.println("Livro não encontrado.");
                }
            }
            else
            {
                System.out.println("Arquivo não encontrado.");
            }
        }
        catch (Exception e)
        {
            System.out.println("Erro ao remover item " + e.getMessage());
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
