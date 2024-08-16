package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class rememberthesenumbers {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
        int num = Integer.valueOf(scanner.nextLine());
        list.add(num);
        if(num == -1){
        for(int i = 0; i < list.size() - 1; i++){
            System.out.println(list.get(i));
            
            }
            break;
        }
        }
    }
}
