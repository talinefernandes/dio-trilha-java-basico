public class contaTerminal {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem vindo ao banco XYZ!");
        System.out.print("Por favor, digite o número da agência: ");
        int agência = scanner.nextInt();

        scanner.nextLine(); //

        System.out.print("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();  

        scanner.nextLine(); //

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("\nOlá " + "nomeCliente" + ",obrigado por criar uma conta em nosso banco.");
        System.out.println("sua agência é :" + agência + "conta ," + numero + ",e seu saldo de :" + saldo + " já está disponovel para saque.");

        scanner.close();

    }
}
