public class Menus {
    static public void showLoginMenu() {

        User admin = new User("Regis", true, "2356");
        User client = new User("Client", false, "1234");

        String isAdmin = JOptionPaneFunctions.adminOrClient();
        switch (isAdmin) {
            case "1":
                JOptionPaneFunctions.menuUsers(client);
                break;
            case "2":
                JOptionPaneFunctions.menuUsers(admin);
                break;
            default:
                System.out.println("Escolha não existe!");
                showLoginMenu();

        }

    }

    static public void showSalesMenu() {
        JOptionPaneFunctions.menuSales();
    }

    public static void showAdminMenu() {
        JOptionPaneFunctions.menuAdmin();
    }

    public static void showAdminClient() {
        JOptionPaneFunctions.menuCleint();
    }
}
