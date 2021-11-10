package study;

import java.util.*;

/**
 *
 * ������ȹ�� (Dynamic Programming)
 * - ������ ������ ���� ���� ���� �κ� ������ ���� �ذ��ϴ� ����̴�.
 * - Memoization�� �̿��Ͽ� ū �����κ��� ���� �ӵ��� ������ �ظ� ã�Ƴ���.
 * 
 * - Memoization�̶� �ݺ��Ǵ� ����� �޸𸮿� �����ؼ� �ߺ� ȣ�� �Ǿ��� ��,
 *	 �ѹ� �� ������� �ʰ� �޸𸮿� ����� �� ������ ��Ȱ�� �ϴ� ���̴�.
 *	 �ӵ��� ��� ��� �޸𸮸� �Ҵ´� -> '���� �ð��� �޸𸮸� trade-off'�Ѵ�.
 *
 *	���� ������δ� 'Top-Down, Bottom-Up' �� �ִ�.
 *	Top-Down�� ���� -> Func(n) = Func(n-1) + Func(n-2);
 *
 *	Bottom-Up�� ���� -> (���� ������ �̸� ����ϰ� ū ������ �ذ��ϴ� ���)
 *	DP[1] = 1;
 *	DP[2] = 1;
 *	for(int i=3;i<N;i++)
 *   	DP[i] = DP[i-2] + DP[i-1];
 * 
 *
 */


// Coin Change Problem

public class DP������ȹ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int coin[] = new int[n];
		for(int i=0; i<n; i++) {
			coin[i] = sc.nextInt();
		}
		
		
		// d[i] �� 'i���� ����� ���� �ʿ��� ������ �ּ� ����'
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
