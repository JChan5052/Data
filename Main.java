public class Main{
    public static void main(String[] args){
     Data thing=new Data(3,3);
     System.out.println(thing);
     System.out.println(Data.MAX);
     thing.repopulate();
     System.out.println(thing);
     System.out.println(thing.countIncreasingCols());
    }
}