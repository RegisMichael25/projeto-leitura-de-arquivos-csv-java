package main.java.br.com.vendaProd.controller;

import main.java.br.com.vendaProd.model.User;
import main.java.br.com.vendaProd.view.DisplayService;
import main.java.br.com.vendaProd.view.InputService;

public class MainMenuController {

    public static void exibirMenuPrincipal() {
        String tipoUsuario = InputService.inputTipoUsuario();

        switch (tipoUsuario) {
            case "1": // Cliente
                User cliente = new User("Client", false, "1234");
                autenticarUsuario(cliente);
                break;
            case "2": // Admin
                User admin = new User("Regis", true, "2356");
                autenticarUsuario(admin);
                break;
            default:
                DisplayService.showMensagemErro("Opção inválida!");
                exibirMenuPrincipal();
        }
    }


    private static void autenticarUsuario(User user) {
        String nome = InputService.inputLoginNome();
        String senha = InputService.inputLoginSenha();

        if (nome.equalsIgnoreCase(user.getNameUser()) && senha.equalsIgnoreCase(user.getPassword())) {
            if (user.isAdmin()) {
                AdminMenuController.exibirMenu();
                DisplayService.showMensagemSucesso("Login do admin realizado com sucesso!");
            } else {
                DisplayService.showMensagemSucesso("Login do cliente realizado com sucesso!");
                ClientMenuController.exibirMenu();
                
            }
        } else {
            DisplayService.showMensagemErro("Usuário ou senha incorretos.");
            exibirMenuPrincipal(); 
        }
    }
}


