import java.util.Scanner;
import java.util.Arrays;

public class String_ProcessingString_ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getUrl = "https://target.com/index.html?port=8080&cookie=&host=localhost";
        String[] split1 = getUrl.split("https://target.com/index.html");
        String[] split2 = split1[1].split("\\?");
        String[] split3 = split2[1].split("&");

        String section0 = String.join("", split3[0]);
        String section1 = String.join("", split3[1]);
        String section2 = String.join("", split3[2]);

        System.out.println(Arrays.toString(split1));
        System.out.println(Arrays.toString(split2));
        System.out.println(Arrays.toString(split3));

        for (int i = 0; i < split3.length; i++) {
            if (split3[i].contains("pass")) {
                section1[] = split3[i].replaceAll("=", " : ");
            }
        }

//        String section1 = split3[0].repalceAll("=", " : ");


        String[] split4 = section0.split("=");
        String[] split5 = section1.split("=");
        String[] split6 = section2.split("=");

//        String section3 = String.join("", split3[3]);
        String sectionPass = "-";

        System.out.println();

        if (!sectionPass.equals("-")) {
            System.out.println("pass :" + sectionPass);

        }

    }
}
 /*
You want to hack a website now. First, get all the available parameters that you can find in the URL. Then print them in the "key : value" format. If a parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all parameters once again, but with a key password. If a URL does not contain parameter pass, do not print anything after the listed parameters. However, if pass parameter is present, its value cannot be empty.

Note: the order of parameters should be the same as in the URL.
Advice: Check examples for better understanding and carefully learn the structure of the URL.

Sample Input 1:

https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost

Sample Output 1:

pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345


Sample Input 2:

https://target.com/index.html?port=8080&cookie=&host=localhost

Sample Output 2:

port : 8080
cookie : not found
host : localhost

*/