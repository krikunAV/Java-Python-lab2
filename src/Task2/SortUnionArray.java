package Task2;

import java.util.ArrayList;

public class SortUnionArray {

    public ArrayList<Integer> unionTwoArray(int[] list1, int[] list2) {
        ArrayList<Integer> newList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.length && j < list2.length) {
            if (list1[i] < list2[j]) {
                newList.add(list1[i]);
                i++;
            } else if (list1[i] > list2[j]) {
                newList.add(list2[j]);
                j++;
            }
            else if (list1[i] == list2[j]) {
                newList.add(list1[i]);
                newList.add(list2[j]);
                i++;
                j++;
            }
        }

        while (i < list1.length) {
            newList.add(list1[i]);
            i++;
        }

        while (j < list2.length) {
            newList.add(list2[j]);
            j++;
        }
        return newList;
    }

    public static void main(String[] args) {
        int[] array_1 = {1, 4, 5, 7, 10, 21, 33, 55};
        int[] array_2 = {2, 3, 4, 6, 7, 8, 9, 24, 66};

        SortUnionArray sortUnionArray = new SortUnionArray();
        ArrayList<Integer> unionArray = sortUnionArray.unionTwoArray(array_1, array_2);

        System.out.println(unionArray);
    }

}