package com.string;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		occurecnce(s);

	}

	private static void occurecnce(String s) {
		// TODO Auto-generated method stub
		char[] ch=s.toCharArray();
		boolean[] checked=new boolean[ch.length];
		
		
		for(int i=0;i<ch.length;i++)
		{
			if(!checked[i]) {
				int count=1;
		
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j]) {
				count++;
				checked[j]=true;
				
			}
		}
		System.out.println(ch[i]+ " "+count);
	}

  }
}
}
