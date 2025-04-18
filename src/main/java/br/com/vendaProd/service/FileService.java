package main.java.br.com.vendaProd.service;

import java.io.*;

import main.java.br.com.vendaProd.Main;
import main.java.br.com.vendaProd.model.Product;
import main.java.br.com.vendaProd.view.DisplayService;
import main.java.br.com.vendaProd.view.InputService;

public class FileService {
    public static void writeFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            Product product = new Product(
                InputService.inputNome(),
                InputService.inputId(),
                InputService.inputPreco()
            );

            writer.write(product.getId() + ";" + product.getName() + ";" + product.getPreco());
            writer.newLine();

        } catch (Exception e) {
            System.out.println("Erro ao escrever no arquivo: " + e.getMessage());
        }

        Main.main(null);
    }

    public static void readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
    
            StringBuilder mensagem = new StringBuilder();
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
    
                if (dados.length == 3) {
                    Product produto = new Product(
                        dados[1],
                        Integer.parseInt(dados[0]),
                        Float.parseFloat(dados[2])
                    );
    
                    mensagem.append("📦 Produto:\n");
                    mensagem.append("   ID: ").append(produto.getId()).append("\n");
                    mensagem.append("   Nome: ").append(produto.getName()).append("\n");
                    mensagem.append(String.format("   Preço: R$ %.2f\n", produto.getPreco()));
                    mensagem.append("------------------------------\n");
                }
            }
    
            if (mensagem.length() > 0) {
                DisplayService.showMessage(mensagem.toString());
            } else {
                DisplayService.showMensagemErro("Nenhum produto encontrado.");
            }
    
        } catch (Exception e) {
            DisplayService.showMensagemErro("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
    
}
