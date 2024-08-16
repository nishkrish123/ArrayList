package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class thirdelement {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String name = scanner.nextLine();
            if(name.equals("")){
                System.out.println(list.get(2));
                break;
            }
            list.add(name);
        }

    }
}
