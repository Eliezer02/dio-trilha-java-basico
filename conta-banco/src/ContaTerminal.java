import java.util.Scanner;

public class ContaTerminal {
        static Cliente cliente;
        static Scanner scanner = new Scanner(System.in);
       public static void main(String[] args) throws Exception {
         

        System.out.println("Digite o seu nome para cadastro: ");
        String nomeCliente = scanner.nextLine();
           
        System.out.println("Digite o seu número da Agência desejado: ");
        int agencia = scanner.nextInt();
    
        System.out.println("Digite o número da sua conta: ");
        int numeroDaConta = scanner.nextInt();
        
        System.out.println("Insira o valor do seu primeiro depósito: ");
        double saldo = scanner.nextDouble();
               
        cliente = new Cliente(nomeCliente, agencia, numeroDaConta, saldo);
        
        System.out.println("Olá " + cliente.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agencia é " + cliente.getagencia() + ", Conta " + cliente.getnumeroDaConta() + " e seu saldo R$ " + cliente.getsaldo() + "já está disponível para saque!");

    
        realizarSaque();;
    
}

public static void realizarSaque(){
   
    
    System.out.println("Digite o valor do saque: ");
    
    double valorSaque = scanner.nextDouble();
                if (valorSaque > 0 && valorSaque <= cliente.getsaldo()) {
        cliente.setSaldo(cliente.getsaldo() - valorSaque);
        System.out.println("Saque realizado com sucesso, novo saldo: R$ " + cliente.getsaldo());
    
    } else {
        System.out.println("Saldo insuficiente ou valor inválido");
    }


}
}
