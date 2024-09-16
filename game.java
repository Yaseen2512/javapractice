import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the team_1 score :");
        int score_team1=scan.nextInt();
        

        System.out.println("the team_1 score :"+score_team1);
       

        if (score_team1<50 )
        {
            System.out.println("you need to improve");
        }
        else if (score_team1>50 && score_team1<70)
        {
            System.out.println("Good job");
        }
        else if (score_team1>70)
        {
            System.out.println("Excellent performance");
        }
        else 
        {
            System.out.println("enetr the correct score");
        }
    }
    
}
