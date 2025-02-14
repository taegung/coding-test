package 이분분할;

import java.util.Arrays;
import java.util.Scanner;

public class back2512 {
	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		int N=in.nextInt();
		int arr[] =new int[N];
		int sum=0;
		int max=0;
		int result=0;
		for(int i=0;i<N;i++){
			arr[i]=in.nextInt();
			max=Math.max(max,arr[i]);
			sum+=arr[i];
		}
		int M=in.nextInt();

		if(sum<=M){
			System.out.println(max);
		}else{

			Arrays.sort(arr);

			int left =1;
			int right=arr[N-1];
			int mid=0;


			while(left<right){
				mid=(left+right)/2;
				int answer=0;
				for(int i=0;i<N;i++){
					if(mid<arr[i]){
					  answer+=mid;
					}else{
						answer+=arr[i];
					}
				}

				if(answer<=M){
					result = mid;
					left = mid + 1;
				}else{

					right=mid;
				}

			}
			System.out.println(result);


		}





	}
}
