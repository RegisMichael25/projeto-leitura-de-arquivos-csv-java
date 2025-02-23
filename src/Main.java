
public class Main {
    public static void main(String[] args) {
        User admin = new User("Regis", true, "2356");
        User client = new User("Cliente", false, "1234");


        showSalesMenu();
        showLoginMenu();
         //FileService.writeFile(Products.getPathFileProduct());
         //FileService.readFile(Products.getPathFileProduct());
    }

    static private void showSalesMenu() {
        JOptionPaneFunctions.menuSales();
    }

    static private void showLoginMenu() {
        JOptionPaneFunctions.menuUsers();
    }



}
