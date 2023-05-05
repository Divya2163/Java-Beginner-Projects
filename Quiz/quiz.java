import java.util.*;

public class quiz{
    public static void main(String[] args){
        System.out.println("Welcome to my computer quiz!");
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("Do you want to play? ");
        
        String playing = sc.nextLine();

        if(!playing.equals("yes")){
            System.exit(0);
        }
        else{
        System.out.println("Okayy! Let's Playy :)");

        System.out.println("What does CPU stand for?");
        String answer1 = sc.nextLine();
        if(answer1.toLowerCase().trim().equals("central processing unit")){
            System.out.println("Correct!");
            score++;
        }
        else{
            System.out.println("Incorrect!");
        }

        System.out.println("What does GPU stand for?");
        String answer2 = sc.nextLine();
        if(answer2.toLowerCase().trim().equals("graphics processing unit")){
            System.out.println("Correct!");
            score++;
        }
        else{
            System.out.println("Incorrect!");
        }

        System.out.println("What does RAM stand for? ");
        String answer3 = sc.nextLine();
        if(answer3.toLowerCase().trim().equals("random access memory")){
            System.out.println("Correct!");
            score++;
        }
        else{
            System.out.println("Incorrect!");
        }

        System.out.println("What does PSU stand for?");
        String answer4 = sc.nextLine();
        if(answer4.toLowerCase().trim().equals("power supply unit")){
            System.out.println("Correct!");
            score++;
        }
        else{
            System.out.println("Incorrect!");
        }

        System.out.println("Your Score is "+score);
    }
    }
}
