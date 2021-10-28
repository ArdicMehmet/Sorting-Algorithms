public class SortingAlgorithm {
    public static int[] sirala(int []Array){
         int takas=0;
         
         //Sirala
             for(int i=0;i<Array.length;i++){
                 for(int j=i+1;j<Array.length;j++){
                     if(Array[i]>Array[j]){
                         takas= Array[i];
                         Array[i]=Array[j];
                         Array[j]=takas;
                        }//if son
                   }//ic for son
               } // for son
            return Array;
     } 
    public static void main(String args[]) {
        int []Array ={-1,4,-3,12,-4};
        Array=sirala(Array);
        for(int i=0;i<Array.length;i++){
            System.out.println(i+".eleman : "+Array[i]);
        }

      
    }
}