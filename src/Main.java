import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String [] presidents = new String[10];
        String president;
        Scanner scan = new Scanner(System.in);
        int i=0;
        while(true){
            System.out.print("Enter a president's name: ");             //prompt
            president = scan.nextLine();                                // enter
            if(president.equals("history")){
                break;
            }
            try {
                presidents[i] = president;                            // president
                i++;                                                   //increment index
            }catch(Exception NullPointerException){                 // Catches null pointer exception. Ends loop.
                System.out.println("Too many entries! Ending loop.");
                break;
            }
        }
        for(int j=0; j<10; j++) {
            System.out.println(presidents[j]);
        }
    }
}
