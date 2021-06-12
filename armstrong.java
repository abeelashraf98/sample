class Armstrong{
	public static void main(String ab[]){
	int sum=0,rem,i=1,j;
	while(i<10000){
	j=i;
	while(j!=0){
	rem=j%10;
	sum=sum+(rem*rem*rem);
	j=j/10;
	}
if(sum==i)
	{
	System.out.println(i);
	i++;
	}
else{
	i++;
		}
sum=0;
}
}
}