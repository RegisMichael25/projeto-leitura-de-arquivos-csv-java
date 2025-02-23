import javax.swing.JOptionPane;

public class JOptionPaneFunctions {

    public static void menuUsers() {
        JOptionPane.showMessageDialog(null,
                "-------------------\n" +
                "Informe seu Login\n" +
                "Nome: \n" +
                "Senha: ",
                "Entrar no Sistema",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static void menuSales() {
        JOptionPane.showMessageDialog(null,
                "\n---Gerenciamento do Sistema---\n" +
                        "|         Sistema de          |\n" +
                        "|       Venda de Produtos     |\n" +
                        "|                             |\n" +
                        "===============================\n",
                "Gerenciamento do Sistema",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public static String inputNome() {
        String nome = JOptionPane.showInputDialog("Informe o nome do produto: ");

        return nome;
    }

    public static int inputId() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Informe a matricula do produto: "));

        return id;
    }

    public static float inputPreco() {
        float preco = Float.parseFloat(JOptionPane.showInputDialog("Informe a preco do produto: "));

        return preco;
    }
}
