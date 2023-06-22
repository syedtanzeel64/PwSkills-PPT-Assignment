//[2,7,11,15]  Target=9
//Output --> [0,1]
public class sum_of_indices {
    public static void main(String[] args){
        int array[] = {2,7,11,15};
        int target = 9;
        for(int i=0; i<array.length; i++){
            for(int j=i;j<array.length;j++){
                int sum = array[i]+array[j];
                if (sum==target){
                    System.out.println(i+","+j);
                }
            }
        }
    }
}
