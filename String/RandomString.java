package String;

import java.util.Scanner;

public class RandomString {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String [] quotes = new String[] {"num1", "num2", "num3", "num4", "num5", "num6", "num7", "num8", "num9", "num10", "num11", "num12", "num13", "num14", "num15", "num16", "num17", "num18", "num19", "num20", "num21", "num22", "num23", "num24", "num25", "num26", "num27", "num28", "num29", "num30", "num31", "num32", "num33", "num34", "num35", "num36", "num37", "num38", "num39", "num40", "num41", "num42", "num43", "num44", "num45", "num46", "num47", "num48", "num49", "num50"};
        System.out.print("number of test cases : ");
        int testCase = num.nextInt();
        for (int i=0; i<testCase; i++){
            int ran = (int)(Math.random() * quotes.length);
            System.out.println(quotes[ran]);
        }

    }
}
