import java.util.*;

public class Sorting {
    public static void selectionSort(ArrayList<Integer> list) {
        int smallest;
        int location;
        int temp;
        for(int i = 0; i < list.size(); i++) {
            smallest = list.get(i);
            location = i;
            temp = list.get(i);
            for(int j = i; j < list.size(); j++) {
                if (list.get(j) < smallest) {
                    smallest = list.get(j);
                    location = j;
                }
            }
            temp = list.get(i);
            list.set(i, smallest);
            list.set(location, temp);
            //System.out.println(list);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, 10, 7, 9, 1, 4, 5, 8, 6, 2));

        selectionSort(list1);
        selectionSort(list2);
        selectionSort(list3);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
    }
}