package PART3_2;
import java.util.Scanner;
import java.util.ArrayList;

public class secondplusthird {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while(true){
            int num = Integer.valueOf(scanner.nextLine());

            if(num==0){
                int second = list.get(1);
                int third = list.get(2);
                int sum = second + third;
                System.out.println(sum);
                break;
            }
            list.add(num);
        }
    }
}
