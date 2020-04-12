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

    public static void insertionSort(ArrayList<Integer> list) {
        int temp;  
        for (int i = 1; i < list.size(); i++) {
            for(int j = i ; j > 0 ; j--){
                if(list.get(j) < list.get(j - 1)){
                    temp = list.get(j);
                    list.set(j, list.get(j - 1));
                    list.set(j - 1, temp);
                }
            }
        }
    }  
    

    public static void bubbleSort(ArrayList<Integer> list) {
        int temp;
        int swaps;
        boolean done = false;
        while(!done) {
            swaps = 0;
            for(int i = 0; i < list.size() - 1; i++) {
                if (list.get(i + 1) < list.get(i)) {
                    temp = list.get(i);
                    list.set(i, list.get(i+1));
                    list.set(i+1, temp);
                    swaps++;
                }
            }
            if (swaps == 0) {
                done = true;
            }
        }
    }

    public static void main(String[] args) {
        //selectionSort tests
        ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<Integer> list3 = new ArrayList<Integer>(Arrays.asList(3, 10, 7, 9, 1, 4, 5, 8, 6, 2));

        selectionSort(list1);
        selectionSort(list2);
        selectionSort(list3);
        
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

        //insertionSort tests
        ArrayList<Integer> list4 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list5 = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<Integer> list6 = new ArrayList<Integer>(Arrays.asList(3, 10, 7, 9, 1, 4, 5, 8, 6, 2));

        insertionSort(list4);
        insertionSort(list5);
        insertionSort(list6);
        
        System.out.println(list4);
        System.out.println(list5);
        System.out.println(list6);

        //bubbleSort tests
        ArrayList<Integer> list7 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list8 = new ArrayList<Integer>(Arrays.asList(10, 9, 8, 7, 6, 5, 4, 3, 2, 1));
        ArrayList<Integer> list9 = new ArrayList<Integer>(Arrays.asList(3, 10, 7, 9, 1, 4, 5, 8, 6, 2));

        bubbleSort(list7);
        bubbleSort(list8);
        bubbleSort(list9);
        
        System.out.println(list7);
        System.out.println(list8);
        System.out.println(list9);
    }
}