package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class indexofthesmallest {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            list.add(num);
            
            if(num == 9999){
                int first = list.get(0);
                for(int i = 0; i < list.size(); i++){
                    int number = list.get(i);
                    if(first > number){
                        first = number;
                    }
                }
                for (int x = 0; x < list.size() ; x++){
                    if(first == list.get(x)){
                        System.out.println("Smallest number: " + first);
                        System.out.println("Found at index: " + x);
                        continue;
                    }
                }
                break;
            }
        }
    }
}
