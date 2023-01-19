
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

  // bj 1034
public class bj1034 {
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		int m=Integer.parseInt(st.nextToken());
		
		int lam[][]=new int[n][m];
		
		for(int i=0;i<n;i++) {
			String temp=br.readLine();
			for(int j=0;j<m;j++) {
				lam[i][j]=(temp.charAt(j)-48);
			}
		}
		int max=0;
		int k=Integer.parseInt(br.readLine());
		for (int i=0;i<n;i++) {
		int z=0;
		int same=0;
		
		    for(int j=0;j<m;j++) {
		    	if(lam[i][j]==0) {
		    		z++;
		    	}
		    }
		    
		    if(z<=k && ((k-z)%2)==0) { //k번바꿔서 만들수있는지 판단함
		    	
		    	for(int j=0;j<n;j++) {  //같은패턴 가지는행이 있는지 판단함
		    		if(i==j)continue;
		    		
		    		boolean equal=true;
		    		for(int h=0;h<m;h++) {
		    			if(lam[i][h]!=lam[j][h]) {
		    				equal=false;
		    			}
		    		}
		    		if(equal) {
		    			same++;
		    		}
		    	}
		    	max=Math.max(max, same+1);   //+1한 이유는 자기자신을 안세서 그럼
		    }
		    
		
		}
		
		System.out.println(max);
	}
	
}
