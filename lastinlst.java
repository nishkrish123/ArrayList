package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class lastinlst {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String name = scanner.nextLine();
            list.add(name);

            if(name.equals("")){
                int size = list.size();
                int i = size - 2;
                System.out.println(list.get(i));
                break;
                
            }
        }
    }
    
}
