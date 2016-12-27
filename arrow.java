import java.util.*;
class arrow
{
	static Scanner sc=new Scanner(System.in);
	static char a[][]={
						{' ','v',' ',' ','<'},
						{'v','<','>',' ','^'},
						{' ',' ',' ','>','v'},
						{'>',' ',' ','^',' '},
						{' ','<',' ',' ','<'},
					};
	static int c=0,ii=0,jj=0;
	public static void main(String arghh[])
	{
		c=count(a);
		for(int i=0;i<5;i++)
		for(int j=0;j<5;j++)
		if(a[i][j]!=' ')
		{
			c--;
			ii=i;
			jj=j;
			generate(i,j);
			c++;
		}
	}
	static void generate(int i,int j)
	{
		if(c==0)
		System.out.println(ii+","+jj);
		if(a[i][j]=='v')
		for(int x=i+1;x<5;x++)
		{
			if(a[x][j]!=' ')
			{
				c--;
				generate(x,j);
				c++;
				return;
			}
		}
		if(a[i][j]=='^')
		for(int x=i-1;x>=0;x--)
		{
			if(a[x][j]!=' ')
			{
				c--;
				generate(x,j);
				c++;
				return;
			}
		}
		if(a[i][j]=='<')
		for(int x=j-1;x>=0;x--)
		{
			if(a[i][x]!=' ')
			{
				c--;
				generate(i,x);
				c++;
				return;
			}
		}
		if(a[i][j]=='>')
		for(int x=j+1;x<5;x++)
		{
			if(a[i][x]!=' ')
			{
				c--;
				generate(i,x);
				c++;
				return;
			}
		}
	}
	static int count(char a[][])
	{
		int cc=0;
		for(int i=0;i<5;i++)
		for(int j=0;j<5;j++)
		if(a[i][j]!=' ')
		cc++;
		return cc;
	}
}