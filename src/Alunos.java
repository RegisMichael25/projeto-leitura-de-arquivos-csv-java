import java.io.File;

public class Alunos {
    private String nomeAluno;
    private int matriculaAluno;
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

    public Alunos(String nomeAluno, int matriculaAluno) {
        this.nomeAluno = nomeAluno;
        this.matriculaAluno = matriculaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public int getMatriculaAluno() {
        return matriculaAluno;
    }

    public void setMatriculaAluno(int matriculaAluno) {
        this.matriculaAluno = matriculaAluno;
    }

    public static File getArquivoAluno() {
        return arquivoAluno;
    }

    public static void setArquivoAluno(File arquivoAluno) {
        Alunos.arquivoAluno = arquivoAluno;
    }

    public static void listarAlunos() {
        ArquivoService.leituraDoArquivo(arquivoAluno);
    }

    public static void editarAluno() {

    }

    @Override
    public String toString() {
        return "Alunos:\n" +
                "Aluno: " + nomeAluno +
                "matriculaAluno=" + matriculaAluno;
    }
}
