

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//한수는 지금 (x, y)에 있다. 직사각형은 각 변이 좌표축에 평행하고, 왼쪽 아래 꼭짓점은 (0, 0), 오른쪽 위 꼭짓점은 (w, h)에 있다. 
		//직사각형의 경계선까지 가는 거리의 최솟값을 구하는 프로그램을 작성하시오.
		
//		1 ≤ w, h ≤ 1,000
//		1 ≤ x ≤ w-1
//		1 ≤ y ≤ h-1
//		x, y, w, h는 정수 = int
		
		Scanner sc = new Scanner(System.in);
		
		int x= sc.nextInt();
		int y= sc.nextInt();
		int w= sc.nextInt();
		int h= sc.nextInt();
		
		int x_min = Math.min(x,w-x);
		int y_min = Math.min(y,h-y);
		
		System.out.println(Math.min(x_min, y_min));

	}

}
