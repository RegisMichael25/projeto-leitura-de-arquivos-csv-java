package main.java.br.com.vendaProd.view;

import javax.swing.JOptionPane;

public class InputService {

    public static String inputAdminOption() {
        return JOptionPane.showInputDialog("Escolha uma opção:\n1 - Listar Produtos\n2 - Adicionar Produto");
    }
    
    public static String inputClientOption() {
        return JOptionPane.showInputDialog("Escolha uma opção:\n1 - Listar Produtos\n2 - Comprar Produtos");
    }

    public static String inputNome() {
        return JOptionPane.showInputDialog("Informe o nome do produto:");
    }

    public static int inputId() {
        return Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do produto:"));
    }

    public static float inputPreco() {
        return Float.parseFloat(JOptionPane.showInputDialog("Informe o preço do produto:"));
    }

    public static String inputTipoUsuario() {
        return JOptionPane.showInputDialog("Escolha o tipo de acesso:\n1 - Cliente\n2 - Admin");
    }
    
    public static String inputLoginNome() {
        return JOptionPane.showInputDialog("Informe o nome de usuário:");
    }
    
    public static String inputLoginSenha() {
        return JOptionPane.showInputDialog("Informe a senha:");
    }

    
}
