package main.java.br.com.vendaProd.view;

import main.java.br.com.vendaProd.model.User;

public class AuthService {

    private static User admin = new User("Regis", true, "2356");
    private static User client = new User("Client", false, "1234");

    public static boolean authenticate(String nome, String password) {
        
        if((nome.equalsIgnoreCase(admin.getNameUser()) && password.equals(admin.getPassword())) || (nome.equalsIgnoreCase(client.getNameUser()) && password.equals(client.getPassword()))) {
            return true;
        }
        
        return false;
    }

    public static User getUser(String nome) {

        if(nome.equalsIgnoreCase(admin.getNameUser())){
            return admin;
        } else {
            return client;
        }

    }

}
