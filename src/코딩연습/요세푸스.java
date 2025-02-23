package 코딩연습;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 요세푸스 {
	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int  N=in.nextInt();
		int K = in.nextInt();
		int result[]=new int[N];


		List<Integer> arr =new ArrayList<>();
		for(int i=0;i<N;i++){
			arr.add(i+1);

		}
		int index=0;
		int count =0;

		while(!arr.isEmpty()) {
					int num = arr.get(0);
					count++;
					if (count != K) {
						arr.remove(0);
						arr.add(num);
					} else {
						result[index++] = num;
						arr.remove(0);
						count = 0;
					}
		}
		System.out.print("<");
		for(int i=0;i<N;i++){
			if(i==N-1){
				System.out.print(result[i]);
			}else{
				System.out.print(result[i]+", ");
			}


		}
		System.out.println(">");



	}
}
