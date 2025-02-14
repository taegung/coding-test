package 이분분할;

import java.util.Scanner;

public class back1654
{
	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);

		int K=in.nextInt();
		int N=in.nextInt();
		long arr[] =new long[K];
		long max=0;
		for(int i=0;i<K;i++){
			arr[i]=in.nextInt();
			max=Math.max(max,arr[i]);
		}

		long left =1;
		long right =max;
		long answer=0;
		while(left<=right){

			long mid =(left+right)/2;
			int count=0;
			for(int i=0;i<K;i++){
				count+=arr[i]/mid;
			}
			if(count>=N){
				left=mid+1;
				answer=mid;
			}else{
				right=mid-1;
			}

		}

		System.out.println(answer);



	}
}
