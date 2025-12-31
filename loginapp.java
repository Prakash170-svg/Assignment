public class LoginApp {

    public static void main(String[] args) {
        String username = "admin";
        String password = "admin123";

        if (login(username, password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }

    public static boolean login(String user, String pass) {
        return user.equals("admin") && pass.equals("admin123");
    }
}

