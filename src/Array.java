import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] array = {12, 0, -22, 0, 43, 545, -4, -55, 12, 43, 0, -999, -87};
        Arrays.sort(array);
        System.out.println("They are sorted:");
        System.out.println(java.util.Arrays.toString(array));
        int array1[]= new int[5];
        array1[0]=-999; array1[1]=-87; array1[2]=-55; array1[3]=-22; array1[4]=-4;
        System.out.println(Arrays.toString(array1));
        int array2[]= new int[5];
        array2[0]=12; array2[1]=12; array2[2]=43; array2[3]=43; array2[4]=545;
        System.out.println(Arrays.toString(array2));
            }


    public static void sort(int[] array1) {
    }
}



