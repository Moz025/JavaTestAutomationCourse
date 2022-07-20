import java.util.Scanner;

public class MyApp{

    public static void Sorting_Bubble(int array[]){
        int i, aux;
        int n = array.length;

        for(i=0; i < (n-1); i++) {
            for(int j= 0; j <(n-i)-1; j++){
                if(array[j]>array[j+1]){
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }

    public static void Show_Array(int array[]){
        for(int k = 0; k < array.length; k++){
            System.out.println(array[k]);
        }
    }

    public static void main(String args[]){
        Scanner entry = new Scanner(System.in);
        Scanner entry2 = new Scanner(System.in);
        int array[], nElements = 6, option;
        array = new int[nElements];

        for(int i = 0; i < nElements; i++){
            System.out.println((i+1) + " Write a number: ");
            array[i] = entry.nextInt();
        }

        System.out.println("---Choose a sorting algorithm---");
        System.out.println("1. Bubble sort");
        System.out.println("2. Exit");
        option = entry.nextInt();

        switch(option){

            case 1: Sorting_Bubble(array);
                Show_Array(array);
                break;

            case 2: System.exit(0);

            default: System.out.println("Error, operation doesn't exist");
                break;
        }
    }
}
