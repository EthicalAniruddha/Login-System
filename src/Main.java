public class Main {
    public static void main(String[] args) {

        ID_Pass id_pass = new ID_Pass();

        LoginPage loginPage = new LoginPage(id_pass.getLoginInfo());
    }
}
