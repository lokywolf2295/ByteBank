package polimorfismo.test;

import java.util.ArrayList;
import java.util.List;

public class TestRespasoArray {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        int numero = 40;
        // WRAPPER
        // Integer numeroObjeto = new Integer(40); deprecado
        Integer numeroObjeto = Integer.valueOf(40);

        List<Integer> lista = new ArrayList<>();
//		primitivo != object
        lista.add(numero); // autoboxing
        lista.add(Integer.valueOf(40));
        lista.add(numeroObjeto);

        // unboxing
        // int valorPrimitivo = numeroObjeto;
        int valorPrimitivo = numeroObjeto.intValue();

        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatIOnteger = numeroObjeto.floatValue();

        System.out.println(Integer.MAX_VALUE); //maximo valor posible
        System.out.println(Integer.MIN_VALUE); //minimo valor posible

        System.out.println(Integer.SIZE); // bits
        System.out.println(Integer.BYTES);// 4

    }
}
