package main.java.br.com.vendaProd.view;

import javax.swing.JOptionPane;

public class DisplayService {

        public static void showAdminScreen() {
                JOptionPane.showMessageDialog(null,
                        "\n----------------------------\n" +
                        "|           Admin          |\n" +
                        "|                          |\n" +
                        "============================\n" +
                        "[1] - Listar Produtos\n" +
                        "[2] - Adicionar Produto\n",
                        "Menu Admin",
                        JOptionPane.INFORMATION_MESSAGE);
        }

        public static void showMensagemErro(String menssagem) {
                JOptionPane.showMessageDialog(null, menssagem, "Erro", JOptionPane.ERROR_MESSAGE);
        }

        public static void showMensagemSucesso(String menssagem) {
                JOptionPane.showMessageDialog(null, menssagem, "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }

        public static void showMessage(String mensagem) {
                JOptionPane.showMessageDialog(null, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        

        public static void showClientScreen() {
                JOptionPane.showMessageDialog(null,
                "\n----------------------------\n" +
                "|           Sistema          |\n" +
                "|            Loja            |\n" +
                "============================\n" +
                "[1] - Listar Produtos\n" +
                "[2] - Comprar Produtos\n",
                "Menu de Vendas",
                JOptionPane.INFORMATION_MESSAGE);
        }
        
}