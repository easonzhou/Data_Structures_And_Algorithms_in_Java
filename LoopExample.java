import java.util.*;
public class LoopExample {
    public static void main(String[] args) {
        int[] temp = {1,2,3,4};
        try {
            int n = temp[5];
            System.out.println("n is " + n);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Don’t try buffer overflow attacks in Java!");
        }


        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(14);
        arrList.add(7);
        arrList.add(39);
        arrList.add(40);

        System.out.println("For Loop");
        for(int counter = 0; counter < arrList.size(); counter++) {
            System.out.println(arrList.get(counter));
        }

        System.out.println("Advanced For loop");
        for(Integer num : arrList) {
            System.out.println(num);
        }

        System.out.println("While Loop");
        int count = 0;
        while(arrList.size() > count) {
            System.out.println(arrList.get(count));
            count++;
        }

        System.out.println("Iterator");
        Iterator iter = arrList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
