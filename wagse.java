package p1;

public class wagse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salary=0;
		
		for(int i=1 ;i<26 ; i++)
		{
			for(int j=i ;j<8; j++)
			{
				salary=salary+(j*20);
			}
		}
		System.out.println(salary);
	}

}
