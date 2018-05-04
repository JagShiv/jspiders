
public class Armstrong {
boolean isArmstrong(int no)
{
	int c=numberOfDigit(no);
	int sum=0,t=no;
	do{
		int r=no%10;
		sum=sum+Pow(r,c);
		no=no/10;
	}while(no!=0);
		return t==sum;
	}
}

