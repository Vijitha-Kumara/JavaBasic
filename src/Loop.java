
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i<10 ; i++){
            System.out.println(i);
        }

        int i = 0;
        while(i >0){
            System.out.println(i);
            i--;  
        }

        Scanner scanner = new Scanner(System.in);
        String  input = "";
        while(!input.equals("input")){
            System.out.println();
        }

        do {
        System.out.print("input");
        input =scanner.next().toLowerCase();
        System.out.println(input);


        }
        while(!input.equals("quit"));
    }
}
