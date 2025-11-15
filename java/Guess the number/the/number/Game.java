package guess.the.number;
import java.util.Random;
import java.util.Scanner;
public class Game {
    public int number;
    public int inputNumber;
    public int count=0;
    public Game(){
        Random rand = new Random();
        this.number=rand.nextInt(100);
    }
    public int count(){
        return count;
    }
    void takeuserInput(){
        System.out.println("-------------------------------------------");
        System.out.println("Guess a number");
        Scanner sn =new Scanner(System.in);
        inputNumber =sn.nextInt();
    }
    boolean isCorrectNumber(){
        count++;
        if(inputNumber==number){
            System.out.println("Your score :" + count);
            return true;
            
        }else if(inputNumber>number){ 
            System.out.println("The number is too high....");
        }else if(inputNumber<number){
            System.out.println("The number is too low....");
        }
        return false;
    }
}
