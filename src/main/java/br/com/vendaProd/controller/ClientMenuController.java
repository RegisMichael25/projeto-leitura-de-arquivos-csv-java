package main.java.br.com.vendaProd.controller;

import main.java.br.com.vendaProd.model.Product;
import main.java.br.com.vendaProd.service.FileService;
import main.java.br.com.vendaProd.view.DisplayService;
import main.java.br.com.vendaProd.view.InputService;

public class ClientMenuController {
    public static void exibirMenu() {
        DisplayService.showClientScreen();

        String escolha = InputService.inputClientOption();

        switch(escolha) {
            case "1":
                FileService.readFile(Product.getFilePath());
                break;
            case "2":
                
                break;
            default:
                DisplayService.showMensagemErro("Opção Inválida!");
        }
    }
}
