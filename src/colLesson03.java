import java.util.Scanner;

public class colLesson03 {
    public static void main(String[] args) {
        Word[] words = new Word[5];

        System.out.println("わからなかった単語とその意味をスペースを区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();

        int count = 0;

        while(!input.equals("e")){

            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0],tmp[1]);
            words[count] = wd;
            count++;
            System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します");
            input = sc.nextLine();

            try{
                words[count] = wd;
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
                break;
            }
        }

        for (int i = 0; i < count; i++){
            System.out.println("単語：" + words[i].word + "意味：" +words[i].meaning);
        }
        System.out.println(count + "件、登録しました");
    }
}
