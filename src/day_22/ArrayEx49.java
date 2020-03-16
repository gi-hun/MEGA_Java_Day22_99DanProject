package day_22;

/*
 * # ������ ����[��ȭ]
 * 1. ������ ������ �����ϰ� 5ȸ �����Ѵ�.
 * 2. ������ ���߸� answer �迭�� 1�� �����ϰ�, Ʋ���� -1�� �����Ѵ�.
 * 3. answer �迭�� ���� 1�̸�, yes �迭�� �� ��ġ���� �����Ѵ�.
 * 4. answer �迭�� ���� -1�̸�, no �迭�� �� ��ġ���� �����Ѵ�.
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
			System.out.println("������ �����ΰ�?");
			int my = sc.nextInt();
			
			if(result[i] == my)
			{
				answer[i] = 1;
				System.out.println("����!");
				count1++;
			}
			else
			{
				answer[i] = -1;
				System.out.println("��!");
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


