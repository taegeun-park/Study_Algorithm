package 배열.방번호;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
다솜인은 은진이 집 옆집에 이사옴 , 자기방번호를 플라스틱 숫자로 문에 붙이려함
한세트는 0~9까지의 숫자가 하나씩 들어있음.
다솜이의 방번호가 주어질 때, 필요한 세트의 개수의 최소값을 구하라
(6,9) 는 뒤집어서 사용 가능하다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tmp = br.readLine();
        int cnt[] = new int[10];
        int ans = 0;

        for (int i = 0; i < tmp.length(); i++) {
            cnt[tmp.charAt(i) - '0'] ++;
        }

        int sum = cnt[6] + cnt[9];

        if(sum % 2 == 0) {
            cnt[6] = (cnt[6]+cnt[9])/2;
            cnt[9] = cnt[6];
        } else {
            cnt[6] = (cnt[6]+cnt[9])/2;
            cnt[6] ++;
            cnt[9] = cnt[6];
        }


        for(int i : cnt) {
            ans = Math.max(ans,i);
        }
        System.out.print(ans);
    }
}
