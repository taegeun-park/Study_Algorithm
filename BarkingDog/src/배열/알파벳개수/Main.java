package 배열.알파벳개수;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] answer = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i) - 97;
            answer[a] ++;
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]+" ");
        }
    }
}
