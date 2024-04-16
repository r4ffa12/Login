import java.util.Random;
import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nome de usuario para se cadastrar ao seu gosto
        String username = "admin";
        //Senha do usuario
        String password = "password";

        System.out.println("Digite o nome de usuário: ");
        String inputUsername = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String inputPassword = scanner.nextLine();


        Random random = new Random();
        int numeroAleatorio = random.nextInt(101);
        System.out.println("Numero aleatorio: " + numeroAleatorio);

        System.out.println("Digite o numero para confirmação");
        int inputConfirmacao = scanner.nextInt();
        scanner.nextLine();

        //SE estiver tudo correto sera exibido (login efetuado com sucesso)
        if (inputUsername.equals(username) && inputPassword.equals(password) && inputConfirmacao == numeroAleatorio) {
            System.out.println("Login efetuado com sucesso!");
        } else {
            //SE NÂO ira aparecer (Algo incorreto)
            System.out.println("Nome de usuário ou senha incorretos.");
        }



        scanner.close();
    }
}
