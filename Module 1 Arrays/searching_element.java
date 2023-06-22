public class searching_element {
    public static void main(String[] args){

        int num[] ={1,3,5,6};
        int target =5;
        int n = num.length/2;
        if(num[n]<5){
            for(int i=n;i<num.length;i++){
                if(num[i]==target){
                    System.out.println(i);
                }
            }
        }
        else{
            for(int i=0;i<=n;i++){
                if(num[i]==target){
                    System.out.println(i);
                }
            }
        }
    }
}
