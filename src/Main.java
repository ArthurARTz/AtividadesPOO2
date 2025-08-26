
public class Main {
    public static void main(String[] args) {

        EmailVerificação email = new EmailVerificação();
        email.EnviarEmaildeVerificação("usuario@teste.com");

        RegistrarConta conta = new RegistrarConta();
        conta.RegistrarContaCriada("Arthur123");

        ClassCriarConta criarConta = new ClassCriarConta();
        criarConta.CriarContaa("Arthur123", "arthur@teste.com");


    }

}