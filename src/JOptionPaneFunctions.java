import javax.swing.JOptionPane;

public class JOptionPaneFunctions {

    public static void menuUsers(User user) {

        JOptionPane.showMessageDialog(null,
                "-------------------\n" +
                "Informe seu Login\n" +
                "Nome: \n" +
                "Senha: ",
                "Entrar no Sistema",
                JOptionPane.INFORMATION_MESSAGE);

        String nome = JOptionPane.showInputDialog("Nome: ");
        String password =  JOptionPane.showInputDialog("Password: ");

        if(nome.equalsIgnoreCase(user.getNameUser()) && password.equalsIgnoreCase(user.getpassword())) {
            if(user.isAdmin()){
                Menus.showAdminMenu();
            } else if(nome.equalsIgnoreCase(user.getNameUser()) && password.equalsIgnoreCase(user.getpassword())) {
                Menus.showAdminClient();
            } else {
                System.out.println("Create an account!");
            }
        }
    }

    public static void menuAdmin() {
        JOptionPane.showMessageDialog(null,
                "\n----------------------------\n" +
                        "|             Admin           |\n" +
                        "|                             |\n" +
                        "===============================\n",
                "Admin sistem",
                JOptionPane.INFORMATION_MESSAGE);

        switchAdmin();
    }

    public static void menuCleint() {
        JOptionPane.showMessageDialog(null,
                "\n----------------------------\n" +
                        "|            Client           |\n" +
                        "|                             |\n" +
                        "===============================\n",
                "Client Sistem",
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

    public static String adminOrClient() {
        String isAdminOrClient = JOptionPane.showInputDialog("-------------\n" +
                "[1] - Menu Client\n" +
                "[2] - Menu Admin\n");

        return isAdminOrClient;
    }

    private static void switchAdmin() {
        String escolha = JOptionPane.showInputDialog(null, "---------------\n" +
                "[1] - Listar Produtos.\n" +
                "[2] - Adicionar Porduto.\n" +
                "-----------------------\n");

        switch(escolha) {
            case "1":
                FileService.readFile(Products.getPathFileProduct());
                break;
            case "2":
                FileService.writeFile(Products.getPathFileProduct());
        }
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
