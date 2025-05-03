public class Data{
    public static final int MAX=(int) (Math.random()*Integer.MAX_VALUE)/1000000;
    private int[][] grid;

    public Data(int rows, int cols){
        grid=new int[rows][cols];
    }
    public void repopulate(){
   for (int rows=0;rows<grid.length;rows++){
    for (int col=0;col<grid[rows].length;col++){
    int set=0;
       while (!((set%10==0)&&(set%100!=0)&&(set!=0)))
       {
        set=(int)(Math.random()*MAX+1);
       }
       grid[rows][col]=set;
    }
   }
    }

    public int countIncreasingCols(){
        int inc=0;
        for (int col=0;col<grid[0].length;col++){
            int cont=0;
            for (int row=1;row<grid.length;row++){
            if (grid[row-1][col]<=grid[row][col]) cont++;
            if (cont==grid[row].length-1) inc++;
            }
          }
        return inc;
    }

    public String toString(){
        String ret="";
        for (int rows=0;rows<grid.length;rows++){
            for (int col=0;col<grid[rows].length;col++){
            ret+=grid[rows][col]+" ";
            }
            ret+="\n";
          }
          return ret;
    }
}