package com.company;

import java.util.Scanner;

public class ObjectPractice06 {
    public static void main(String[] args){
        CoinCase coincase = new CoinCase();
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 6; i++){
            int coin;
            int number;
            System.out.printf("%d回目\n", i+1);
            System.out.println("硬貨の種類を入力してください");
            coin = scanner.nextInt();
            System.out.println("硬貨の枚数を入力してください");
            number = scanner.nextInt();

            coincase.AddCoins(coin, number);
        }

        System.out.printf("500円は%d枚, 100円は%d枚,　50円は%d枚, 10円は%d枚, 5円は%d枚, 1円は%d枚",
                coincase.GetCount(500),
                coincase.GetCount(100),
                coincase.GetCount(50),
                coincase.GetCount(10),
                coincase.GetCount(5),
                coincase.GetCount(1));

        System.out.printf("\n総額は%d円です", coincase.GetAmount());

    }
}

