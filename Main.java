import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nombre = "Tini Stoessel";
        String tipoCuenta = "Cuenta de ahorro";
        double saldo = 1997.28;
        int opcion = 0; // opcion precisa controlar o loop while e ser modificada dentro dele, então é declarada antes do while começar
        Scanner leitura = new Scanner(System.in); // Scanner no Main porque só precisa de uma instância dele para ler todas as entradas do usuário durante a execução do programa

        System.out.println("********************************");
        System.out.println("Bienvenido al Banco de La Nación");
        System.out.println("\n- Datos del cliente: -");
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Tipo de cuenta:   " + tipoCuenta);
        System.out.println("Saldo actual:     $ " + saldo);
        System.out.println("********************************");

        String operaciones = """
                
                - Elija una opción -
                1. Consultar saldo
                2. Recibir dinero
                3. Transferir dinero
                4. Salir
                """;

        while (opcion != 4) {
            /* (PORTEIRO DA FESTA)
            A opcion é diferente de 4? Sim? Então pode entrar e executar o código mais uma vez.
            A opcion é igual a 4? Sim? Então a festa acabou. Ninguém mais entra.
            */

            System.out.println(operaciones); // o menu é feito antes para depois só ser usado como parâmetro
            opcion = leitura.nextInt(); // nextInt() lê apenas o número. Ele não lê a tecla "Enter" pressionada depois

            if (opcion == 1) {
                System.out.println("El saldo actual es: $" + saldo);

            } else if (opcion == 2) {
                System.out.println("¿Qué monto desea recibir?");
                double valorRecibido = leitura.nextDouble();
                saldo += valorRecibido; // Soma o valor ao saldo
                System.out.println("Saldo actualizado: $" + saldo);

            } else if (opcion == 3) {
                System.out.println("¿Qué monto desea transferir?");
                double valorATransferir = leitura.nextDouble();

                if (valorATransferir > saldo) {
                    System.out.println("Saldo insuficiente para la transferencia.");
                } else {
                    saldo -= valorATransferir; // Subtrai o valor do saldo
                    System.out.println("Transferencia realizada. Saldo actualizado: $" + saldo);
                }

            } else if (opcion != 4) {
                System.out.println("Opción inválida. Por favor, intente nuevamente.");
            }
            /* (SEGURANÇA DA FESTA)
                Considera inválido qualquer número que não seja 1, 2 ou 3, EXCETO o 4
                Assim, quando o usuário digita 4, essa condição também é falsa, nada é impresso, e o loop termina de forma limpa.
            */
        }

        System.out.println("Gracias por usar nuestros servicios. ¡Hasta luego!");
    }
}