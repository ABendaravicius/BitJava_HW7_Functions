package com.arnas.nd7;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        Scanner inputArr =  new Scanner(System.in);
        System.out.println("Įveskite masyvo skaičius atskirtus tarpais, pvz.: 8 9 17 25 ... -> ");
        String input = inputArr.nextLine();
        System.out.println("Įvesti skaičiai: " + input);

        // Masyvo formavimas
        System.out.println("... Masyvo formavimas");
        String[] inputSplit = input.split(" ");
        int[] numArr = new int[inputSplit.length];
        for (int i = 0; i < inputSplit.length; i++) {
            numArr[i] = Integer.parseInt(inputSplit[i]);
        }
        System.out.println("Suformuotas masyvas: " + Arrays.toString(numArr));

        // Kviečiama funkcija surasti didžiausią skaičių
        System.out.println("... Funckija didžiausio skaičiaus masyve radimui");
        int maxInArr = maxOfArr(numArr);
        System.out.println("Didžiausias skaičius masyve yra: " + maxInArr);

        // Kviečiama funkcija surasti mažiausią skaičių
        System.out.println("... Funckija mažiausio skaičiaus masyve radimui");
        int minInArr = minOfArr(numArr);
        System.out.println("Mažiausias skaičius masyve yra: " + minInArr);

        // Kviečiama funkcija surasti masyvo elementų sumai
        System.out.println("... Funckija masyvo elementų sumos skaičiavimui");
        int suma = sumOfArr(numArr);
        System.out.println("Masyvo elementų suma yra lygi: " + suma);

        // Kviečiama funkcija masyvo elementų rikiavimui
        System.out.println("... Funkcija masyvo elementų rikiavimui");
        int[] sortedArr = sortArr(numArr);
        System.out.println("Masyvas po rikiavimo: " + Arrays.toString(sortedArr));
    }

    // Didžiausio elemento masyve radimo funkcija
    public static int maxOfArr(int[] array) {
        int maxIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[maxIdx]) {
                maxIdx = i;
            }
        }
        return array[maxIdx];
    }

    // Mažiausio elemento masyve radimo funkcija
    public static int minOfArr(int[] array) {
        int minIdx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= array[minIdx]) {
                minIdx = i;
            }
        }
        return array[minIdx];
    }

    // Masyve esančių elementų sumos funkcija
    public static int sumOfArr(int[] array) {
        int sumArr = 0;
        for (int i : array) {
            sumArr += i;
        }
        return sumArr;
    }

    // Masyve esančių elementų rikiavimo nuo mažiausio iki didžiausio funkcija
    public static int[] sortArr(int[] array) {
        System.out.println("Prieš rikiavimą: " + Arrays.toString(array));
        int minIdx = 0;
        for (int i = 0; i < array.length; i++) {
            minIdx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIdx]) {
                    minIdx = j;
                }
            }
            System.out.println("--> Skaicius " + array[minIdx] + " perkeltas iš " + minIdx + " pozicijos masyve į " + i + " poziciją.");
            int temp = array[minIdx];
            array[minIdx] = array[i];
            array[i] = temp;
        }
        return array;
    }
}