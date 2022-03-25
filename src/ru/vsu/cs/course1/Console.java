package ru.vsu.cs.course1;

import ru.vsu.cs.util.ArrayUtils;

import java.io.FileNotFoundException;

public class Console {

    public static void main(String[] args) throws FileNotFoundException {
        try {
            String k = args[0];
            String inputFileName = args[1];
            String outputFileName = args[2];
            int count = Integer.parseInt(k);
            int[] input = ArrayUtils.readIntArrayFromFile(inputFileName);
            int[] result = Task.solution(input, count);
            ArrayUtils.writeArrayToFile(outputFileName, result);
        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}
