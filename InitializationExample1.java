import java.util.*;
public class InitializationExample1 {
    public static void main(String args[]) {
//        ArrayList<String> obj = new ArrayList<String>(
//                Arrays.asList("Aab", "Baba", "aba")
//        );
//        ArrayList<String> obj = new ArrayList<String>(){
//            {
//                add("Delhi"); add("Agra"); add("Chennai");
//            }};
//        ArrayList<String> books = new ArrayList<String>();
//        books.add("Java Book1");
//        books.add("Java Book2");
//        books.add("Java Book3");
        ArrayList<Integer> intList = new ArrayList<Integer>(Collections.nCopies(10, 0));
        System.out.println("Elements are: "+intList);
    }
}
