package m1.s5.ex5.ex5_1;

import m1.s5.ex5.ex5_2.Ex5_2;

public class Ex5_1 {

    /*Crie 2 pacotes diferentes com 1 classe em cada, onde:

    a classe do pacote-um consiga acessar um método da classe do pacote-dois (usando objeto)
    a classe do pacote-um consiga acessar um método da classe do pacote-dois (usando static)*/

    public static void main(String[] args) {
        new Ex5_2().metodoObjeto();
        Ex5_2.metodoClasse();
    }
}
