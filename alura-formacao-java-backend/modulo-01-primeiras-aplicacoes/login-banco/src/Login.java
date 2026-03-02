public class Login {
    public static void main(String[] args){
        String name = "Guilherme";
        String password = "1234";

        if (name.equals("Guilherme") && password.equals("1234")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
