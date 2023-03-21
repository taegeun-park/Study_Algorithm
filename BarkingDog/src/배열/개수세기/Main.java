package 배열.개수세기;

import java.io.*;
import java.util.*;

//총 N개의 정수가 주어졌을 때, 정수 v가 몇개인지 구하는 프로그램을 작성하시오
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i = 0; i < n; i++) {
            if(v == nums[i]) {
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}
