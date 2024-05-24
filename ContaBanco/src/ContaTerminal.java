import java.util.Scanner; // Passo 1: Importar a classe Scanner

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela classe scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in); // Passso 2: Criar uma instância de Scanner

        System.out.println("Por favor, digite o seu nome: ");
        String nome = scanner.nextLine(); // Usando nextLine() para ler uma String

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine(); // Usando nextLine() para ler uma String

        System.out.println("Por favor, digite o número da sua conta!");
        int conta = Integer.parseInt(scanner.nextLine()); // Usando nextLine() e parseInt() para ler um int

        System.out.println("Por favor, digite o saldo inicial da sua conta!");
        double saldo = Double.parseDouble(scanner.nextLine()); // Usando nextLine() e parseDouble() para ler um double

        // Exibir as informações lidas
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
                           ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();  // Fechar o scanner

    }
}
