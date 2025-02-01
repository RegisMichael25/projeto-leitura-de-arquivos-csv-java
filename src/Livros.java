import java.io.File;

public class Livros {
    private String nomeLivro;
    private int id;
    private static final String ARQUIVOLIVRO = "arquivolivro.csv";
    private static final String CAMINHOLIVRO =
            "C:" + File.separator +
                    "Users" + File.separator +
                    "Regis" + File.separator +
                    "Documents" + File.separator +
                    "PraticaJava" + File.separator +
                    "praticando" + File.separator +
                    "LeituraDeArquivo" + File.separator +
                    "dados" + File.separator + ARQUIVOLIVRO;

    static File arquivoLivro = new File(CAMINHOLIVRO);

    public Livros(String nomeLivro, int id) {
        this.nomeLivro = nomeLivro;
        this.id = id;
    }

    public static void setArquivoLivro(File arquivoLivro) {
        Livros.arquivoLivro = arquivoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static File getArquivoLivro() {
        return arquivoLivro;
    }


    public static void listarLivros() {
        ArquivoService.leituraDoArquivo(arquivoLivro);
    }
}
