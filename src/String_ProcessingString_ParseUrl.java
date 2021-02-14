import java.util.Scanner;

public class String_ProcessingString_ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getUrl = scanner.nextLine();

        String[] split1 = getUrl.split("\\?");
        String join1 = String.join("", split1[1]);
        String[] split2 = join1.split("&");

        int indexOfPass = -1;

        for (int i = 0; i < split2.length; i++) {
            // This part of code comes into play if the URL contains the parameter "pass",
            // it is necessary to save the index-position of pass in due to the requirement of processing "pass" different
            // than other parameters. Also in order to avoid "pass" being processed like other parameters the loop needs
            // to skip the current iteration.
            // Further details see next part.
            if (split2[i].contains("pass")) {
                char[] passChars = split2[i].toCharArray();
                for (int j = 0; j < passChars.length; j++) {
                    if (j != passChars.length - 1 && passChars[j] == '=') {
                        System.out.println(split2[i].replace("=", " : "));
                        indexOfPass = i;
                        break;
                    }
                }
                continue;
            }
            // Here we have the code that processes every parameter that is not "pass" and its values
            // What the part for "pass" and this one here basically do is to iterate over ever index of array split2
            // and since they all contain a string-type value these strings can be split into character arrays.
            // Now the code iterates over the array, checks if there is a '=' and replaces it with the required sentence.
            char[] notPassChars = split2[i].toCharArray();
            for (int k = 0; k < notPassChars.length; k++) {
                if (k == notPassChars.length - 1 && notPassChars[k] == '=') {
                    System.out.println(split2[i].replace("=", " : not found"));
                }
                if (k != notPassChars.length - 1 && notPassChars[k] == '=') {
                    System.out.println(split2[i].replace("=", " : "));

                }
            }
        }
        // This is also part of the treatment for our special snowflake "pass".
        if (indexOfPass > -1) {
            System.out.println(split2[indexOfPass].replace("pass=", "password : "));
        }
    }
}
/*
Parse url
You want to hack a website now. First, get all the available parameters that you can find in the URL. Then print them in the "key : value" format. If a parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain parameter pass, do not print anything after the listed parameters. However, if pass parameter is present, its value cannot be empty.

Note: the order of parameters should be the same as in the URL.
Advice: Check examples for better understanding and carefully learn the structure of the URL.


Sample Input:
https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost

Sample Output:
pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345


Sample Input:
https://target.com/index.html?port=8080&cookie=&host=localhost

Sample Output:
port : 8080
cookie : not found
host : localhost

*/