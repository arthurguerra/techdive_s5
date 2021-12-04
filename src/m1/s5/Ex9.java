package m1.s5;

public class Ex9 {

    /*Crie uma classe com blocos de instância e static que executem código antes do construtor,
    que ao ser instanciada (chamar o new Exercicio9() ), deverá printar:

    - “dentro do bloco static”
    - “dentro do bloco de instância”
    - “dentro do construtor”*/

    static {
        System.out.println("Dentro do bloco static");
    }

    {
        System.out.println("Dentro do ploco de instância");
    }

    Ex9(){
        System.out.println("Dentro do construtor");
    }

    public static void main(String[] args) {
        new Ex9();
        new Ex9();
    }
}
