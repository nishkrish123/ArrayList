package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class greatestinlist {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            list.add(num);


            if(num == -1){
                int largest = list.get(0);
                for(int i = 0; i < list.size(); i++){
                    int number = list.get(i);
                    if(largest < number){
                        largest = number;
                    }
                }
                System.out.println("The greatest number: " + largest);
                break;
            }
        }
    }
}
