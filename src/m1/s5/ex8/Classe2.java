package m1.s5.ex8;

public class Classe2 {

    public static void main(String[] args) {
        Classe1 classe1 = new Classe1();
        System.out.println(classe1.getAtributoPrivado());
        classe1.setAtributoPrivado("Atributo Privado");
        System.out.println(classe1.getAtributoPrivado());
    }
}
