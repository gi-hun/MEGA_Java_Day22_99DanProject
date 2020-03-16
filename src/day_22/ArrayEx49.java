package day_22;

/*
 * # 구구단 게임[심화]
 * 1. 구구단 문제를 랜덤하게 5회 출제한다.
 * 2. 정답을 맞추면 answer 배열에 1을 저장하고, 틀리면 -1을 저장한다.
 * 3. answer 배열의 값이 1이면, yes 배열에 그 위치값을 저장한다.
 * 4. answer 배열의 값이 -1이면, no 배열에 그 위치값을 저장한다.
 * 
 * 3 x 1 = 3
 * 4 x 5 = 3
 * 9 x 7 = 3
 * 3 x 7 = 3
 * 5 x 7 = 35
 * 
 * answer = {1, -1, -1, -1, 1}
 * yes    = {0, 4}
 * no     = {1, 2, 3}
 */
//12:52 - 
import java.util.Scanner;
import java.util.Random;

public class ArrayEx49 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		
		int[] answer = new int[5];
		int[] yes    = null;
		int[] no     = null;
		
		int[] result  = new int[5];
		
		int yes_idx = -1;
		int no_idx = -1;
		int count1 = 0;
		int count2 = 0;
		int i = 0;
		
		while(i<5)
		{
			
			int num1 = ran.nextInt(10);
			int num2 = ran.nextInt(10);
			
			result[i] = num1*num2;
			
			if(num1 == 0 || num2 ==0 )
			{
				continue;
			}
			
			System.out.println(num1+"x"+num2+ "=" +result[i]);
			System.out.println("정답이 무엇인가?");
			int my = sc.nextInt();
			
			if(result[i] == my)
			{
				answer[i] = 1;
				System.out.println("정답!");
				count1++;
			}
			else
			{
				answer[i] = -1;
				System.out.println("땡!");
				count2++;
			}
			
			i++;
		}
		
		yes = new int[count1];
		no = new int[count2];
		
		int k = 0;
		for(int j=0;j<5;j++)
		{
			if(answer[j] == 1)
			{
				yes[k] = j;
				k++;
			}
		}
		
		k = 0;
		for(int j=0;j<5;j++)
		{
			if(answer[j] == -1)
			{
				no[k] = j;
				k++;
			}
		}
		
		for(int j=0;j<5;j++)
		{
			System.out.print(answer[j]+ " ");
		}
		System.out.println();
		for(int j=0;j<count1;j++)
		{
			System.out.print(yes[j]+ " ");
		}
		System.out.println();
		for(int j=0;j<count2;j++)
		{
			System.out.print(no[j]+ " ");
		}
	}
}


