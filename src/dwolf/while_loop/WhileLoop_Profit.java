package dwolf.while_loop;

import java.util.Scanner;

public class WhileLoop_Profit {
    public static void main(String[] args) {

        System.out.println(interestTime());

    }

    public static int interestTime() {
        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextInt();
        double percent = scanner.nextInt();
        double goal = scanner.nextInt();

        double percentToMultiplier = percent / 100;
        int countIterations = 0;

        while (money < goal) {

            money += money * percentToMultiplier;
            countIterations++;

        }

        return countIterations;

    }
}

/*
Ann put M money in the bank. The bank increases Ann's deposit by P percent every year.
Ann wants to know how many years should pass until her deposit in the bank reaches K money. Can you help her to answer this question?
Input contains three integers - M,P,K. It is guaranteed that all numbers are positive and K >= M.
Output the answer to Ann's question.

Sample Input 1:
1 100 8

Sample Output 1:
3

Sample Input 2:
100 15 120

Sample Output 2:
2

*/
