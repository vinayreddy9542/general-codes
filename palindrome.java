public static boolean palindrome(String str){
	    int length = str.length();
	String rev="";
        for(int i=length-1;i>=0;i--)
            rev = rev + str.charAt(i);
        if(str.equals(rev))
        return true;
        else
        return false;
	}

/*
this can be done by using two variables at 0 and other at strlen-1
public static boolean palindrome(String str){
	    int i=0,j=str.length()-1;
	    while(i<j){
	        if(str.charAt(i)==str.charAt(j)){
	            i++;
	            j--;
	        }
	        else{
	            return false;
	        }
	    }
	    return true;
	}
*/
