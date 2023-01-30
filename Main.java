/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.


*******************************************************************************/
import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int count = 0;
		for(int i = 0; i<t; i++){
		    int n = sc.nextInt();
		    for(int x = 2; x<n; x++){
		        for(int y = 1; y<n; y++){
		            if(((int)Math.pow(x, y))*y+ ((int)Math.pow(y,x)*x) == n){
		                System.out.println(x + " " +y);
		                count = count + 1; 
		            }
		            
		           
		        }
		        if(count>=1)
		                break;
		        
		    }
		     if(count ==0){
		                System.out.println("-1");
		            }
		}
		
	}
}
