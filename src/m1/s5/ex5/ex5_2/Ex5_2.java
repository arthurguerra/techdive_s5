package m1.s5.ex5.ex5_2;

public class Ex5_2 {

    /*Crie 2 pacotes diferentes com 1 classe em cada, onde:

    a classe do pacote-um consiga acessar um método da classe do pacote-dois (usando objeto)
    a classe do pacote-um consiga acessar um método da classe do pacote-dois (usando static)*/

    public void metodoObjeto() {
        System.out.println("método da classe do pacote-dois (usando objeto)");
    }

    public static void metodoClasse() {
        System.out.println("metodo da classe do pacote-dois (usando static)");
    }
}
