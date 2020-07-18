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
if(both match){
	i++;
	j--;
}
else{
	return false;
}
*/
