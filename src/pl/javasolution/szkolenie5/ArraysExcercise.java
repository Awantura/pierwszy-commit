package pl.javasolution.szkolenie5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExcercise {
    public static void main(String[] args) {
        /*1 Deklaracja tablicy
        typZmienej[] nazwaZmiennej= new typZmiennej[rozmiar]
        2 deklaracja talicy - drugi sposob
        String[] nazwaZmiennej = new String[]{"Hello","World","Java"}
        */
        /*
        Dodawanie wartości
        nazwaTablicy[index] = nowaWartoscDanegoTypu
         */
        int[] firstArray = new int[9];
        firstArray[0] = 22;
        firstArray[1] = 33;
        firstArray[2] = 44;
        firstArray[3] = 55;
        firstArray[4] = 21;
        firstArray[5] = 226;
        firstArray[6] = 223;
        firstArray[7] = 221;
        firstArray[8] = 221;

        //Iterowanie przez tablice: nazwaTablicy.length -> zwraca nam wielkość tablicy
        for (int i = 0; i < firstArray.length; i++) {
            System.out.println("Devalue is :" + firstArray[i]);
        }
        firstArray[5] = 349;
        int fourthIndex = firstArray[4];
        String[] secondArray = new String[]{"Hello", "World", "Java"};
        //Iterowanie za pomocą foreach
        for (String words : secondArray) {
            System.out.println(words);
        }

        //Sout whole array immidiatelly
        System.out.println(Arrays.toString(firstArray));

        //Wielowymiarowe tablice
        // int[][] array= new int[ilWierszy][ilKolumn];
        int[][] multiArray = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                multiArray[i][j] = j;
            }
        }
        multiArray[1][2] = 10;
        System.out.println();
        System.out.println(Arrays.deepToString(multiArray));
        System.out.println();
        for (int[] array : multiArray) {
            System.out.println(Arrays.toString(array));
        }
        System.out.println("----PREDEFINED MULTIDIMENSIONAL ARRAY");
        int[][] preDefined = new int[][]{{1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        int length = preDefined[0].length;
        int length1 = preDefined[1].length;
        int length2 = preDefined[2].length;
        System.out.println(Arrays.deepToString(preDefined));

        for (int[] innerArray : preDefined) {
            for (int number : innerArray) {
                System.out.println("Next number" + number);
            }
        }
    }
}
