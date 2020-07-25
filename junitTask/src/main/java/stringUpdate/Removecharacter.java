package stringUpdate;

public class Removecharacter {
	public String removeA(String str)
	{
		String res="";
		if(str.length()>=2)
		{
			if(str.charAt(0)!='A')
				res+=str.charAt(0);
			if(str.charAt(1)!='A')
				res+=str.charAt(1);
			if(str.length()>2)
				res+=str.substring(2);
		}
		else
		{
			if(str.length()==1)
			{
				if(str.charAt(0)!='A')
					return str;
			}
		}
		return res;
	}
}
