import java.util.Random;
import java.util.Scanner;

public class JavaKadai1 {
    public static void main(String[] args){

        int score = 0; // total score
        String[] question = { "私はドイツが好きです", "私はよく食べます", "私は旅行が好きです", "私はよく寝ます", "私はNetflixをよく見ます"}; // question
        String answer = "1:あてはまらない, 2:あまりあてはまらない, 3:まあまあ当てはまる, 4:当てはまる" ; //answer
        Scanner scanner = new Scanner(System.in); // for scan

        for(int i = 0; i < 5; i++) {
            Random random = new Random();

            System.out.println(question[]);
            System.out.println(answer);
            int eachScore = scanner.nextInt();
            score += eachScore;
        }

        if(score <= 20 && score >= 16) {
            System.out.println("Marry me please");
        }else if(score <= 15 && score >= 11){
            System.out.println("yon are in friend zone");
        }else if(score <= 10 && score >= 5){
            System.out.println("....");
        }else {
            System.out.println("your input was somehow wrong");
        }

    }
}