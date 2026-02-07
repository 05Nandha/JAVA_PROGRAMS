package array;

public class SubStrings {
//substrings
	
		public static void main(String[] args) {
	    
	    	String str="abcdef";
	    	String str2 = "cde"; 
	    	//System.out.println(str.contains("bca"));
	    	for(int i=0;i<str.length();i++)
	    	{
	    	    String temp="";
	    	        boolean isTrue = false;
	    	    for(int j=i;j<str.length();j++)
	    	    {
	    	        temp+=str.charAt(j);
	    	        if(temp.equals(str2))
	    	        {
	    	            isTrue=true;
	    	            System.out.println(temp);
	    	            break;
	    	        }
	    	    }
	    	    if(isTrue)
	    	    {
	    	        break;
	    	    }
	    	    
	    	    
	    	}
		}
	}

