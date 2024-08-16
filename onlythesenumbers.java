package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class onlythesenumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            list.add(num);
            if(num ==-1){
                System.out.println("From where? ");
                int first = Integer.valueOf(scanner.nextLine());
                System.out.println("To where? ");
                int second = Integer.valueOf(scanner.nextLine());
                
                for(int i = first; i <= second; i++){
                    System.out.println(list.get(i));
                }
                break;
            }
        }
    }
}
