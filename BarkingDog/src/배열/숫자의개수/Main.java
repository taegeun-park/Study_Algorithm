package 배열.숫자의개수;
import java.util.*;
// 세개의 자연수 A,B,C 가 주어질 때, A*B*C를 계산한 결과에 0부터 9까지의 숫자가 몇번쓰였는지
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int ABC = A*B*C;

        int[] answer = new int[10];

        while(ABC>0) {
            int num = ABC % 10;
            answer[num] ++;
            ABC = ABC / 10;
        }

        for(int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }
}
