package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class listsize {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String name = scanner.nextLine();
            list.add(name);

            if(name.equals("")){
                System.out.println("In total: " + list.size());
                break;
            }
        }
    }
    
}
