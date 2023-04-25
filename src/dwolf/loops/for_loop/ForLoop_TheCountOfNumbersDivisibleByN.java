package dwolf.loops.for_loop;

import java.util.Scanner;

public class ForLoop_TheCountOfNumbersDivisibleByN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // it means that I have to find out how many int's between "start" and "end" are divisible by "divisor", so the remainder is 0

        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int divisor = scanner.nextInt();
        int times = 0;

        for (; start <= end; start++) {
            if (start % divisor == 0) {

                times++;
            }

            if (start == end) {
                System.out.print(times);
            }
        }
    }
}

/*
Write a program that reads a, b, n and outputs the count of numbers divisible by n in the range from a to b (a < b) inclusively.

Note:  It is possible to write this program more efficiently without any loops.

Sample Input 1:
10 20 10

Sample Output 1:
2

Sample Input 2:
15 25 5

Sample Output 2:
3
*/