class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int k[]=new  int[r*c];
        int ans[][]=new int[r][c];
        int x=0;
        if(mat.length*mat[0].length!=r*c)
        {
            return mat;
        }
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                k[x]=mat[i][j];
                x++;
            }
        }
        x=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                ans[i][j]=k[x];
                x++;
            }
        }
        return ans;
    }
}
