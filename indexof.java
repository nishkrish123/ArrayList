package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class indexof {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            list.add(num);

            if(num == -1){
                System.out.println("Search for? ");
                int n = Integer.valueOf(scanner.nextLine());
                for(int i = 0; i < list.size(); i++){
                    if(n == list.get(i)){
                        System.out.println(n + " is at index " + i);
                        continue;
                    }
                }
                break;
            }
        }
    }
}
