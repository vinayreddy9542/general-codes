public List<List<Integer>> pascal(int numRows) {
        List<List<Integer>> list= new ArrayList<>();
        int i,j=1;
        if(numRows==0)
            return list;
        for(i=1;i<=numRows;i++){
            List<Integer> row = new ArrayList<>();
            int c=1;
            for(j=1;j<=i;j++){
                row.add(c);
                c=c*(i-j)/j;
            }
            list.add(row);
        }
        return list;
    }
