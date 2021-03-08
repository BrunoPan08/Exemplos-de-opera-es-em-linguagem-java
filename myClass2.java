package digital.innovation.Class;

public class myClass2 {
    public static void main(String args[]){
        int[][] meuArrayMulti = {{1,2,3,4},{53,63,73}};

        //percorrendo a arrays multidimencionais

        for (int i=0;i < meuArrayMulti.length; ++i){
            for (int j=0;j < meuArrayMulti[i].length; ++j){
                System.out.println(meuArrayMulti[i][j]);

            }
        }
    }
}
