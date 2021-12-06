package m1.s5;

import org.w3c.dom.ls.LSOutput;

public class Ex10 {

    /*Crie uma classe com:

    1 classe interna
    1 classe interna static
    1 classe interna local (dentro de um método)
    1 classe interna anônima
    instancie 1 objeto de cada classe interna criada*/

    Ex10() {
        System.out.println("Construtor da classe Ex10");
    }

    void helloWorld() {
        System.out.println("Hello World!");
    }

    class ClasseInterna {
        ClasseInterna() {
            System.out.println("Classe Interna");
        }
    }

    static class ClasseInternaStatic {
        ClasseInternaStatic() {
            System.out.println("Classe Interna Static");
        }

    }

    public void metodoClasseInternaLocal() {

        class ClasseInternaLocal {
            ClasseInternaLocal() {
                System.out.println("Classe Interna Local (dentro do método)");
            }
        }
        ClasseInternaLocal classeInternaLocal = new ClasseInternaLocal();
    }

    class ClasseInternaAnonima {

        ClasseInternaAnonima() {
            System.out.println("Construtor classe interna anônima");
        }
        Ex10 ex10 = new Ex10() {
            @Override
            void helloWorld() {
                System.out.println("Sobrescreve método através da classe interna anônima");
            }
        };
    }

    public static void main(String[] args) {
        Ex10 ex10 = new Ex10();
        ex10.new ClasseInterna();
        new ClasseInternaStatic();
        ex10.metodoClasseInternaLocal();
        ex10.helloWorld();
    }
}
