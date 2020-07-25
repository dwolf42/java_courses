import java.util.Arrays;
import java.util.Scanner;

public class Array_Experimenting {
    public static void main(String[] args) {

        int[] easiestWayToInstantateAndInitializeAnArray = {1, 2, 3, 4};
        System.out.println("Containment of easiestWayToInstantateAndInitializeAnArray: " + Arrays.toString(easiestWayToInstantateAndInitializeAnArray));
        System.out.println("Length of easiestWayToIntantateAndInitializeAnArray: " + easiestWayToInstantateAndInitializeAnArray.length + '\n');

        int a = 1, b = 2, c = 3, d = 4;
        int[] anotherWayToInitializeAnArrayByVariables = {a, b, c, d};
        System.out.println("Containment of anotherWayToInitializeAnArrayByVariables: " + Arrays.toString(anotherWayToInitializeAnArrayByVariables));
        System.out.println("Length of anotherWayToInitializeAnArrayByVariables: " + anotherWayToInitializeAnArrayByVariables.length + '\n');

        int n = 12;
        int[] arrayByUsingKeywordNew = new int[n];
        arrayByUsingKeywordNew[5] = 122;
        System.out.println("Containment of arryByUsingKeywordNew: " + Arrays.toString(arrayByUsingKeywordNew));
        System.out.println("Length of arrayByUsingKeywordNew: " + arrayByUsingKeywordNew.length + '\n');

        int[] arrayNewWON = new int[12];
        arrayNewWON[11] = 122;
        System.out.println("Containment of arrayNewWON: " + Arrays.toString(arrayNewWON));
        System.out.println("Length of arrayNewWON: " + arrayNewWON.length + '\n');

        int[] separateDeclarationAndInstantiation; // declaration
        separateDeclarationAndInstantiation = new int[]{1, 5, 6}; // instantiation and initialization with default values

        int length = separateDeclarationAndInstantiation.length;
        System.out.println("Containment of separateDeclarationAndInstantiation: " + Arrays.toString(separateDeclarationAndInstantiation));
        System.out.println("Length of separateDeclarationAndInstantaion: " + length + '\n');

        int[] numbers = new int[3]; // numbers: [0, 0, 0,]
        numbers[0] = 1; // numbers: [1, 0, 0]
        numbers[1] = 2; // numbers: [1, 2, 0]
        numbers[2] = numbers[0] + numbers[1]; // numbers: [1, 2, 3]
        int honey = numbers[2];
        System.out.println("Containment of numbers: " + Arrays.toString(numbers));
        System.out.println("Containment of honey: " + honey + '\n');

        int[] numbers2 = new int[4];
        numbers2[0] = 1;
        numbers2[1] = numbers[0] * 2;
        numbers2[2] = numbers[0] + numbers[1];
        numbers2[3] = numbers[1] * numbers[1];
        System.out.println("Containment of numbers2: " + Arrays.toString(numbers2) + '\n');

        String[] mixedChars = {"Poring", "Poporing", "Metalling", "Angeling", "Drops", "ArchAngeling"};
        Arrays.sort(mixedChars);
        System.out.println(Arrays.toString(mixedChars) + '\n');

        char[] mixed = {'Z', 'K', 'P', 'F'};
        Arrays.sort(mixed);
        System.out.println(Arrays.toString(mixed) + '\n');

        char[] mixed2 = {'Z', 'K', 'P', 'F'};
        System.out.println(Arrays.equals(mixed, mixed2));
        System.out.print('\n');

        int sizeOfArray = 10;
        char[] charactersToFill = new char[sizeOfArray];
        Arrays.fill(charactersToFill, 0, sizeOfArray / 3, 'A');
        Arrays.fill(charactersToFill, sizeOfArray / 3, sizeOfArray / 2 + 1, 'B');
        Arrays.fill(charactersToFill, sizeOfArray / 2 + 1, sizeOfArray - 1, 'C');
        Arrays.fill(charactersToFill, sizeOfArray - 1, sizeOfArray, 'W');
        System.out.println(Arrays.toString(charactersToFill) + '\n');

        int arr[] = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21};
        int n1 = 6;
        n1 = arr[arr[n1] / 2];
        System.out.println(n1);
    }

}

