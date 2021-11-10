package study;

import java.util.*;

/**
 *
 * 동적계획법 (Dynamic Programming)
 * - 복잡한 문제를 여러 개의 작은 부분 문제로 나눠 해결하는 방법이다.
 * - Memoization을 이용하여 큰 문제로부터 빠른 속도로 최적의 해를 찾아낸다.
 * 
 * - Memoization이란 반복되는 결과를 메모리에 저장해서 중복 호출 되었을 때,
 *	 한번 더 계산하지 않고 메모리에 저장된 걸 가져와 재활용 하는 것이다.
 *	 속도를 얻는 대신 메모리를 잃는다 -> '실행 시간과 메모리를 trade-off'한다.
 *
 *	구현 방식으로는 'Top-Down, Bottom-Up' 이 있다.
 *	Top-Down의 예시 -> Func(n) = Func(n-1) + Func(n-2);
 *
 *	Bottom-Up의 예시 -> (작은 문제를 미리 계산하고 큰 문제를 해결하는 방법)
 *	DP[1] = 1;
 *	DP[2] = 1;
 *	for(int i=3;i<N;i++)
 *   	DP[i] = DP[i-2] + DP[i-1];
 * 
 *
 */


// Coin Change Problem

public class DP동적계획법 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int coin[] = new int[n];
		for(int i=0; i<n; i++) {
			coin[i] = sc.nextInt();
		}
		
		
		// d[i] 는 'i원을 만들기 위해 필요한 동전의 최소 갯수'
		int d[] = new int[k+1];
		for(int i=1; i<=k; i++) {
			d[i] = -1;
			for(int j=0; j<n; j++) {
				if(coin[j] <= i) {
					if(d[i - coin[j]] < 0)
						continue;
					if(d[i] < 0)
						d[i] = d[i - coin[j]] + 1;
					else if (d[i - coin[j]] + 1 < d[i])
						d[i] = d[i - coin[j]] +1;
				}
			}
		}
		
        System.out.println(d[k]);

	}
}
