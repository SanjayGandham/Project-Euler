public class nine {
	public static void main(String[] args){
		int check=0;
		for(int c=999;c<1000;c--){
			int sum=1000-c;
			for(int b=sum-1;b<sum;b--){
				if(b<=0)
					break;
				int a=sum-b;
				if(a<=0)
					break;
				if(c*c==a*a+b*b){
					System.out.println(a*b*c);
					check=1;
					break;
				}
			} 
			if(check==1)
				break;
		}
	}
}
