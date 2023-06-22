import java.util.*;
public class remove_occurence {
    public static void main(String[] args) {
        int num[] = {3, 2, 2, 3};
        int val = 3;

        int k = 0;
        for (int i = 0; i < num.length; i++) {

            if (num[i] != val) {
                num[k++] = num[i];
            }
        }
        System.out.println(k);

    }
}