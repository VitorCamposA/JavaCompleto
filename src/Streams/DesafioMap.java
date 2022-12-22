package Streams;

import java.util.Arrays;
import java.util.List;
public class DesafioMap {

    public static void main(String[] args) {


        List<Integer> nums = Arrays
                .asList(1,2,3,4,5,6,7,8,9);


        nums.stream().map(Integer::toBinaryString)
                .forEach(Utilitarios.println);
        System.out.println();

        nums.stream().map(Integer::toBinaryString)
                .map(Utilitarios.inverterTexto)
                .forEach(Utilitarios.println);
        System.out.println();

        nums.stream().map(Integer::toBinaryString)
                .map(Utilitarios.inverterTexto)
                .map(Utilitarios.binarioParaInt)
                .forEach(Utilitarios.println);





    }
}
