package main.java.br.com.vendaProd.controller;

import main.java.br.com.vendaProd.model.Product;
import main.java.br.com.vendaProd.service.FileService;
import main.java.br.com.vendaProd.view.DisplayService;
import main.java.br.com.vendaProd.view.InputService;

public class AdminMenuController {
    public static void exibirMenu() {
        DisplayService.showAdminScreen();
        String escolha = InputService.inputAdminOption();

        switch(escolha) {
            case "1":
                FileService.readFile(Product.getFilePath());
                break;
            case "2":
                FileService.writeFile(Product.getFilePath());
                break;
            default:
                DisplayService.showMensagemErro("Opção Inválida!");
        }
    }
}
