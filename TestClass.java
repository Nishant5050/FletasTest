import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
          BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(sc.readLine());
 
        while(t-->0){
            String patten = sc.readLine();
            String text = sc.readLine();
           
            boolean bool=false;;
			
			if(text.contains(patten)){
				bool=true;
			}
			patten = new StringBuilder(patten).reverse().toString();
			if(text.contains(patten)){
				bool=true;
			}
 
            if(bool) System.out.println("YES");
            else System.out.println("NO");
 
        }
}
public static int[] helper(String str){
       int[]arr =new int[26];
        int n = str.length();
        for(int i = 0;i< n;i++){
            arr[str.charAt(i)-'a']++;
        }
 
       
        
        return arr;
        
    }
}