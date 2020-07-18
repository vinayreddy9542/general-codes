static int combination(int n , int r){
		if( r== 0 || n == r)
			return 1;
		else
			return combination(n-1,r)+combination(n-1,r-1);
	}
