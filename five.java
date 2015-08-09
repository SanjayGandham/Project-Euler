import java.util.*;
import acm.program.*;

public class five {
	public static void main(String[] args){
		int i=2;
		while(true){
			if(divisible(i)){
				break;
			} 
			i++;
		}
		System.out.println(i);
	}
	public static boolean divisible(int i){
		for(int j=2;j<21;j++){
			if(i%j!=0)
				return false;
		}
		return true;
	}
}
