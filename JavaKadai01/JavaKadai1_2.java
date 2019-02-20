import java.util.Scanner;

public class JavaKadai1_2 {
    public static void main(String[] args){

        int score = 0; // total score
        int eachScore;
        int count = 0;
        String[] question = { "私はドイツが好きです", "私はよく食べます", "私は旅行が好きです", "私はよく寝ます", "私はNetflixをよく見ます"}; // question
        String answer = "1:あてはまらない, 2:あまりあてはまらない, 3:まあまあ当てはまる, 4:当てはまる" ; //answer
        Scanner scanner = new Scanner(System.in); // for scan

	        /*for(int i = 0; i < 5; i++) {

	        	System.out.println(question[i]);
	        	System.out.println(answer);
	        	int eachScore = scanner.nextInt();
	        	score += eachScore;
	        }*/

        while(true) {

            if(count == 5)
                break;

            System.out.println(question[count]);
            System.out.println("Please enter your answer:(any number except 1~4 to quit)");
            eachScore = scanner.nextInt();

            if(eachScore > 0 && eachScore < 5) {
                score += eachScore;
                count++;
            }else {
                System.exit(0);
            }
        }

        if(score <= 20 && score >= 16) {
            System.out.println("Marry me please");
        }else if(score <= 15 && score >= 11){
            System.out.println("yon are in friend zone");
        }else{
            System.out.println("do not talk to me");
        }
    }
}
