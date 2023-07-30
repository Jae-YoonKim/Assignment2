package Code;

public class main{

    //In java functions are called methods (Not quite sure what public and static are currently)
    public static int countEvenNum (int arr[],int size){

        //initializing variables and arrays
        int counter = 0;
        for(int i = 0; i < size; i++){

            if(arr[i] % 2 == 0){

                counter++;

            }
        }

        return counter;
    }




    public static void main(String[] args){

        int x = 5;
        int apples[] = {0,1,2,3,4};
        int y = 100;

        //when initializing arrays must allocate memory with new int[]; different from C unless you initialize array like apples
        int oranges[] = new int[100];

        for(int n = 0; n < y; n++){

            oranges[n] = n;
        }

        //when printing unlike C there is no %i to call variables. Need to stick it in to put in sentence
        System.out.println("The total number of even numbers in apples are: " + countEvenNum(apples,x) + "\n");

        System.out.println("The total number of even numbers in oranges are: " + countEvenNum(oranges,y) + "\n");

    }

}

