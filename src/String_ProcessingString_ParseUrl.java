import java.util.Scanner;
import java.util.Arrays;

public class String_ProcessingString_ParseUrl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String getUrl = "https://target.com/index.html?port=8080&cookie=&host=localhost";
        String[] split1 = getUrl.split("https://target.com/index.html\\?");
        System.out.println("s1: " + Arrays.toString(split1));
        // [, port=8080&cookie=&host=localhost]

        String cleaned1 = String.join("", split1);
        System.out.println("c1: " + cleaned1);
        // port=8080&cookie=&host=localhost

        String[] split2 = cleaned1.split("&");
        System.out.println("s2: " + Arrays.toString(split2));
        // [port=8080, cookie=, host=localhost]

        boolean hasPass = cleaned1.contains("pass=") && !cleaned1.contains("pass=&");
        boolean hasPort = cleaned1.contains("port=") && !cleaned1.contains("port=&");
        boolean hasCookie = cleaned1.contains("cookie=") && !cleaned1.contains("cookie=&");

        boolean hasHost = false;

        char[] ofHost = {};
        for (int i = 0; i < split2.length; i++) {
            if (split2[i].contains("host=")) {
                ofHost = split2[i].toCharArray();
                break;
            }
        }
        /*
        Gedankenstütze:
        mit ofHost[] soll gecheckt werden, ob "host=" an der Indexposition split[i] enthalten ist. Falls ja, dann wird
        ofHost[] = split[i]
        Ich muss noch einen Test einbauen, ob nach dem "=" ein "&" kommt, falls dem so ist, hasHost = false;
        dann Code fertig entwickeln. Es ist unklar ob in der URL auch "host=" stehen kann, also ohne einen Value.
        ggf. muss ich später meinen Code entsprechend anpassen.
        */
        System.out.println(Arrays.toString(ofHost));


        String part1 = "-1";
        String part2 = "-1";
        String part3 = "-1";
        String part4 = "-1";


        if (split2.length >= 1) {
        }

        if (split2.length >= 2) {

        }

        if (split2.length >= 3) {

        }

        if (split2.length >= 4) {

        }

        String cleaned2 = String.join("", split2[0]);
        System.out.println("c2: " + cleaned2);
        // port=8080cookie=host=localhost

//
//        for (String part : split3) {
//            if (part.contains("pass") && part.length() > 5){
//                section0 = part.replaceAll("=", " : ");
//            }
//        }

//        split3[i].replaceAll("=", " : ");
//        for (int i = 0; i < split3.length; i++) {
//            if (split3[i].contains("pass") && (split3[i].length > 5)) {
//                split3[i].replaceAll("=", " : ");
//            }
//        }

//package stackoverflow.q_24933319;
//
//        public class FindLength {
//            public static void main(String[] args) {
//                String[] arr = {"abc","bgfgh","gtddsffg"};
//                System.out.println("Array size is: " + arr.length);
//                for(String s : arr) {
//                    System.out.println("Value is " + s + ", length is " + s.length());
//                }
//            }
//        }


//        String section1 = split3[0].repalceAll("=", " : ");


//        String[] split4 = section0.split("=");
//        String[] split5 = section1.split("=");
//        String[] split6 = section2.split("=");

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