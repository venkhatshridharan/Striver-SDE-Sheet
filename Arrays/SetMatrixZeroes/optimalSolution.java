class Solution {
    public void setZeroes(int[][] matrix) {
        //int n->row of a matrix
        //int m->column of a matrix
        int n=matrix.length;
        int m=matrix[0].length;
        int i=0;
        int j=0;
        int col0 = 1;
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0]=0;
                    if(j!=0){
                        matrix[0][j]=0;
                    }else{
                        col0=0;
                    }
                }
            }
        }
        for(i=1;i<n;i++){
            for(j=1;j<m;j++){
                if(matrix[i][j]!=0){
                    if(matrix[i][0]==0||matrix[0][j]==0){
                        matrix[i][j]=0;
                    }
                }
            }
        }
        if(matrix[0][0]==0){
            for(j=0;j<m;j++){
                matrix[0][j]=0;
            }
        }
        if(col0==0){
            for(i=0;i<n;i++){
                matrix[i][0]=0;
            }
        }
    }
}
//Time Complexity : O(n*m)
//Space Complexity : O(1)
