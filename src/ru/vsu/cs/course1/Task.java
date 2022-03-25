package ru.vsu.cs.course1;


public class Task {
    public static int[] solution(int[] array, int k) {
        SimpleLinkedList<Integer> input = arrayToLinkedList(array);
        try {
            input.checkRemaining(k);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        int[] result = linkedListToArray(input);
        return result;
    }

    public static SimpleLinkedList arrayToLinkedList(int[] array) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<>();
        for(int element: array) {
            list.addLast(element);
        }
        return list;
    }

    public static int[] linkedListToArray(SimpleLinkedList<Integer> list) {
        int[] result = new int[1];
        try {
            result[0] = list.get(0);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
        return result;
    }
}
