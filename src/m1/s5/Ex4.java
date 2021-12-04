package m1.s5;

public class Ex4 {

    /*Faça a seguinte classe compilar:

    class FinalAttributes {
    ** private final int** _FINAL_ATTRIBUTE1_;
    **private final static int ** _FINAL_ATTRIBUTE2_;

    // seu código aqui
    }*/

    private final int _FINAL_ATTRIBUTE1_ = 0;
    private final static int _FINAL_ATTRIBUTE2_ = 1;

    public static void main(String[] args) {
        System.out.println(new Ex4()._FINAL_ATTRIBUTE1_);
        System.out.println(_FINAL_ATTRIBUTE2_);
    }
}
