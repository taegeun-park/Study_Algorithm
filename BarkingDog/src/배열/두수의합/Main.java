package 배열.두수의합;

import java.io.*;
import java.util.*;

/*
n개의 서로다른 양의정수 수열이 있다.
자연수 x가 주어졌을때, a1 + a2 = x 인 a1,a2 쌍의 수를 구하는 프로그램

숫자 하나씩 다더해본다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int nums[] = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int x = Integer.parseInt(br.readLine());

        br.close();

        Arrays.sort(nums);

        int left = 0, right = n - 1, cnt = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum <= x) {
                if (sum == x) cnt++;
                left++;
            } else
                right--;
        }

        System.out.println(cnt);
    }
}

