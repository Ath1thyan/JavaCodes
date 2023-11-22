// Pairs and vectors can be used together to achieve some amazing results. Here we will learn to use a vector that holds pairs. You are given a vector V of size N. The vector hold pair of integers. Example V={(1,2),(3,4)…}. Now, you need to sum the second elements. First line contains N denoting the size of the array. The second line contains 2*N elements where the (2i - 1)’th and (2i)’th element represent the i’th pair.
// Constraints:
// 1 <= N <= 10^5
// 0 <= Vi <= 10^5

// For each testcase, in a new line, print the required output.

// Input:
//  5
//  1 2 3 4 5 6 7 8 9 10
// Output:
//  30



// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// class PairSum {
//     public static int sumSecondElements(List<Pair<Integer, Integer>> list) {
//         int sum = 0;
//         for (Pair<Integer, Integer> pair : list) {
//             sum += pair.second;
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//        //enter your code here
//     }

//     static class Pair<F, S> {
//         F first;
//         S second;

//         public Pair(F first, S second) {
//             this.first = first;
//             this.second = second;
//         }
//     }
// }





package doubt;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Vector {
    

class PairSum {
    public static int sumSecondElements(List<Pair<Integer, Integer>> list) {
        int sum = 0;
        for (Pair<Integer, Integer> pair : list) {
            sum += pair.second;
        }
        return sum;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        List<Pair<Integer, Integer>> pairList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            pairList.add(new Pair<>(first, second));
        }
        
        int result = sumSecondElements(pairList);
        System.out.println(result);
    }

    static class Pair<F, S> {
        F first;
        S second;

        public Pair(F first, S second) {
            this.first = first;
            this.second = second;
        }
    }
}


}
