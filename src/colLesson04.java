import java.util.ArrayList;
import java.util.Scanner;

public class colLesson04 {
    public static void main(String[] args) {
        ArrayList<Word> words = new ArrayList<>();

        System.out.println("わからなかった単語とその意味をスペースを区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();

        int count = 0;

        while(!input.equals("e")){

            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0],tmp[1]);
            words.add(wd);
            count++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します");
            input = sc.nextLine();
        }

        for (int i = 0; i < count; i++){
            System.out.println("単語：" + words.get(i).word + "意味：" +words.get(i).meaning);
        }
        System.out.println(count + "件、登録しました");
    }
}
