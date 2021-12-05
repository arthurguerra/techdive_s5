package m1.s5;

import java.util.Calendar;
import java.util.Locale;
import static java.lang.System.*;

public class Ex3 {

    /*Crie uma classe com o método main que:

    - Utilize qualquer atributo ou método de classe sem utilizar objetos (static)
    - Devem ser pelo atributos e métodos static de 3 classes diferentes
    - Escolha classes do pacote java.util (ex: Calendar, Locale e Currency)
    - Utilize import static*/

    public static void main(String[] args) {

        int idade = Integer.parseInt("25");
        double altura = Double.parseDouble("1.75");
        double pi = Math.PI;

        out.println("Idade: "+idade);
        out.println("Altura: "+altura);
        out.println("Valor PI: "+pi);

        Calendar calendario = Calendar.getInstance();
        out.println(calendario);
    }
}
