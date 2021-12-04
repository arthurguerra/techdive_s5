package m1.s5;

public class Ex2 {
    /*Crie uma classe com 2 construtores, onde ao instanciar a classe,
    dentro do construtor deverá ser chamado outro*/

    String nome;
    double saldo;

    Ex2(String nome) {
        this(nome, 0);
    }

    Ex2(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    void imprimeEx2() {
        System.out.println("Nome: "+this.nome);
        System.out.println("Saldo: "+this.saldo);
    }

    public static void main(String[] args) {
        Ex2 conta = new Ex2("Arthur");
        Ex2 conta2 = new Ex2("Arthur", 1000);
        conta.imprimeEx2();
        conta2.imprimeEx2();
    }
}
