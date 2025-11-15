package guess.the.number;
public class GuessTheNumber {
    public static void main(String[] args) {
       Game g = new Game();
       boolean b = false;
       while(!b){
           g.takeuserInput();
           b=g.isCorrectNumber();
       }
       System.out.println(b);
    }
    
}
