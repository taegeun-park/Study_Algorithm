package 배열.방배정;

import java.io.*;
import java.util.*;

/*
한방에는 같은학년학생들을 배정해야한다.
성별별로 방배정을해야한다.
한방에 배정할 수 있는 최대인원수 K가 주어졌을때
조건에 맞게 모든학생을 배정하기 위해 필요한 방의 최소 개수를 구하는 프로그램
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 학생 수
        int[][] arr = new int[6][2]; // 행: 1~6학년, 열: 남여
        int K = Integer.parseInt(st.nextToken()); // 한 방 최대 인원 수
        int count = 0; // 방 개수

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken()); // 성별
            int Y = Integer.parseInt(st.nextToken()) - 1; // 학년

            arr[Y][S]++;
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / K > 0) {
                    if (arr[i][j] % K == 0) {
                        count += arr[i][j] / K;
                    } else {
                        count += (arr[i][j] / K) + 1;
                    }
                } else {
                    if (arr[i][j] % K != 0) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
