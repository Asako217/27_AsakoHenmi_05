import java.util.Scanner;

public class colLesson01 {

        public static void main(String[] args) {
            WordJava wordJava = new WordJava();
            Scanner scanner = new Scanner(System.in);
            int count = 0;

            System.out.println("わからなかった単語とその意味をスペースを区切って入力して下さい。");

            while(true){
                if(count== 10)
                break;
                count++;

                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します");

                String w = scanner.next();
                if(w.equals("e");
                    break;

                String m = scanner.next();

                wordJava.word[count] = w;
                wordJava.meaning[count] = m;
            }

            for (int i =0, i < 10 ,i++);
            System.out.println("件、登録しました");
        }
}
