// This Program prints the Random number taken by system at the start for making it easy to show my code
//we can just comment the system print out line while paying the game
import java.util.*;
import java.util.Random;
public class Number_Game{
    public static int game(int n){
        int count=0;
        while(count<5){
            int score= 6-count;
            Scanner sc= new Scanner(System.in);
            int num= sc.nextInt();
            if(n==num){
                System.out.println("Congratulations you Won!!");
                System.out.print("Your Score in this round is ");
                System.out.println(score);
                return score;
            }
            else if (num-n>10) {
                System.out.println("Number Guessed Is Too Big");
                System.out.println("Try Again !!");
            }
            else if(num-n<10&&num-n>0){
                System.out.println("Number Guessed is a little Bigger");
                System.out.println("Try Again !!");
            }
            else if (num-n>-10&&num-n<0) {
                System.out.println("Number Guessed is a little Smaller");
                System.out.println("Try Again !!");
            }
            else{
                System.out.println("Number Guessed Is Too Small");
                System.out.println("Try Again !!");
            }

            count++;
        }
        System.out.println("You Lose !!");
        System.out.println("Your total score is 0");
        return 0;
    }
    public static int Number(){
        Random sc= new Random();
        int n=sc.nextInt(50);
        return n;
    }
    public static void main(String args[]){
        int iteration=1;
        int finalscore=0;
        // Random sc= new Random();
        // int n= sc.nextInt(50);
        int comp_num=Number();
        System.out.println(comp_num);
        System.out.println("Round 1 !!");
        int total= game(comp_num);
        while(iteration<3){
            if (total>0) {
                iteration++;
                comp_num=Number();
                System.out.println(comp_num);
                System.out.println("Welcome to round "+iteration);
                int newtotal=game(comp_num);
                    if (newtotal>0) {
                        total=total+newtotal;
                        finalscore=total;
                    }
                    else{
                        total=0;
                        System.out.println("You Lose !!");
                    }
            }
            else{
                break;
            }
        }
        
        System.out.println("Your total score is "+ finalscore);
    }
}

