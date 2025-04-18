package main.java.br.com.vendaProd.model;
public class User {
    private String nameUser;
    private boolean admin;
    private String password;

    public User(String nameUser, boolean admin, String password) {
        this.nameUser = nameUser;
        this.admin = admin;
        this.password = password;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
