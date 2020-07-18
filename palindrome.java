public static boolean palindrome(String str){
	    int length = str.length();
        for(int i=length-1;i>=0;i--)
            rev = rev + str.charAt(i);
        if(str.equals(rev))
        return true;
        else
        return false;
	}
