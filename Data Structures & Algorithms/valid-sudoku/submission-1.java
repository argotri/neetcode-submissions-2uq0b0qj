class Solution {
    public boolean isValidSudoku(char[][] board) {
        // validate row
        
        for(int i = 0 ; i < 9 ; i ++){
            List<String> cs = new ArrayList();
            for(int j = 0 ; j < 9 ; j ++){
                String c = board[i][j]+"";
                if(!c.equalsIgnoreCase(".")){
                    if(cs.contains(c)){
                        return false;
                    }else{
                        cs.add(c);
                    }
                }
            }
        }

        // validate column
          for(int i = 0 ; i < 9 ; i ++){
            List<String> cs = new ArrayList();
            for(int j = 0 ; j < 9 ; j ++){
                String c = board[j][i]+"";
                if(!c.equalsIgnoreCase(".")){
                    if(cs.contains(c)){
                        return false;
                    }else{
                        cs.add(c);
                    }
                }
            }
        }

        // validate boxes
        int[][] startIndex ={ 
            {0,0} , {0,3} , {0,6},
            {3,0} , {3,3} , {3,6},
            {6,0} , {6,3} , {6,6}
        };
        for(int[] start : startIndex){
            int row = start[0];
            int column = start[1];
            List<String> cs = new ArrayList();
            for(int i=row ; i < row+3 ; i++){
                for(int j = column; j < column+3 ; j++){
                    String c = board[i][j]+"";
                    if(!c.equalsIgnoreCase(".")){
                        if(cs.contains(c)){
                            return false;
                        }else{
                            cs.add(c);
                        }
                    }
                }
            }
        }



        return true;
    }
}
