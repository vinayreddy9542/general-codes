public static boolean prime(int a){
        if(a <=1)
            return false;
        if(a==2)
            return true;
        if(a>2 && a%2==0)
            return false;
        for(int i=3;i<Math.sqrt(a)+1;i+=2){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
