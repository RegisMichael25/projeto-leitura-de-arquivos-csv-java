import java.io.File;

public class Alunos {
    static String strAluno = "aluno";
    private String nomeAluno;
    private String matriculaAluno;
    private static final String ARQUIVOALUNO = "arquivoaluno.csv";
    private static final String CAMINHOALUNO =
            "C:" + File.separator +
                    "Users" + File.separator +
                    "Regis" + File.separator +
                    "Documents" + File.separator +
                    "PraticaJava" + File.separator +
                    "praticando" + File.separator +
                    "LeituraDeArquivo" + File.separator +
                    "dados" + File.separator + ARQUIVOALUNO;

    static File arquivoAluno = new File(CAMINHOALUNO);

    public Alunos(String matriculaAluno, String nomeAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(String matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public static File getArquivoAluno() {
        return arquivoAluno;
    }

    public static void setArquivoAluno(File arquivoAluno) {
        Alunos.arquivoAluno = arquivoAluno;
    }

    public static void listarAlunos() {
        ArquivoService.leituraDoArquivo(arquivoAluno, strAluno, ExecucaoCodigo.listAlunos, ExecucaoCodigo.listLivros);
    }

    public static void editarAluno() {

    }

    @Override
    public String toString() {
        return "Alunos:\n" +
                "Aluno: " + nomeAluno +
                "Matricula: " + matriculaAluno;
    }
}
