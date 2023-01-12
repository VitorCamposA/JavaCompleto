package Generics;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo1(List<?> list){

        return list.get(list.size() - 1);
    }
    public  static <T> T getUltimo2(List<T> list){

        return list.get(list.size() - 1);
    }
}
