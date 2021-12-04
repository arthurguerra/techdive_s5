package m1.s5;

public class Ex1 {

    /*Crie uma classe que imprima no console:

    nome do sistema operacional
    capacidade de memória RAM
    memória RAM alocada
    memória RAM livre*/

    public static void main(String[] args) {
        System.out.println("Nome do sistema operacional: " + System.getProperty("os.name"));

        System.out.println("Capacidade de memória (bytes): " +
                Runtime.getRuntime().maxMemory());

        System.out.println("Memória alocada (bytes): " +
                Runtime.getRuntime().totalMemory());

        System.out.println("Memória livre (bytes): " +
                Runtime.getRuntime().freeMemory());
    }
}
