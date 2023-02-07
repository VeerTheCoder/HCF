import java.util.Scanner;
class HCF{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] h=new int[3];
		int i,j,f,hcf=1;
		System.out.print("Enter three Numbers:");
		for(i=0;i<3;i++)
			h[i]=sc.nextInt();
		for(i=1;i<=h[0];i++){
			f=0;
			for(j=0;j<3;j++){
				if(h[j]%i==0){
					f=1;
				}
				else{
					f=0;
					break;
				}
			}
			if(f==1)
				hcf=i;
		}
		System.out.print("HCF="+hcf);
	}
}