package Algorithmhuochai;
import java.util.*;
public class Huochai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int li=in.nextInt();
		int a=0;
		while(li!=0){
			li--;
			int dui=in.nextInt();
			for(int i=0;i<dui;i++){
				int shu=in.nextInt();
				a=a^shu;
			}
			if(a==0)
				System.out.println("NO");
			else
				System.out.println("YES");
			
		}
	}

}
