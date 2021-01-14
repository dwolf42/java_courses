import java.util.Scanner;

public class String_ProcessingString_ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getUrl = "https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost";
        String[] split1 = getUrl.split("=");
        String[] split2 = split1[1].split("\\&");


        for (int i = 0; i < split1.length; i++) {
            System.out.print(split1[i]);
        }
        System.out.println();
        for (int i = 0; i < split2.length; i++) {
            System.out.print(split2[i]);
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