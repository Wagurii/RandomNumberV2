package randomnumber;

import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int randomNum = (int) (Math.random() * 10);
        boolean correct = false;
        int score = 3;
      do{
   
        System.out.println("The correct number: " + randomNum);
        System.out.println("Guess the number(0-10): ");
        int number = scan.nextInt();
       
        if(number == randomNum){
            System.out.println("\n\n======================");
            System.out.println("\nYou win!");
            correct = true;
        }else {
            score --;
             if(score > 0){
            correct = false;
            System.out.println("\n\n======================");
            System.out.println("\nTry Again!");
             }
             else{
                 System.out.println("\n\n======================");
                  System.out.println("\nYou lose!");
             }
        }
          
       }while(!correct && score > 0);
      
    }

}
