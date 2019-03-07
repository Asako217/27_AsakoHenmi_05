package com.company;

public class CoinCase {
    int fivehundred = 0;
    int onehundred = 0;
    int fifty = 0;
    int ten = 0;
    int five = 0;
    int one = 0;

    public void AddCoins(int coin, int number) {
        if (coin == 500)
            fivehundred += number;
        if (coin == 100)
            onehundred += number;
        if (coin == 50)
            fifty += number;
        if (coin == 10)
            ten += number;
        if (coin == 5)
            five += number;
        if (coin == 1)
            one += number;
    }

    public int GetCount (int coin) {
        int coinNumber = 0;

        if (coin == 500)
            coinNumber = fivehundred;
        else if (coin == 100)
            coinNumber = onehundred;
        else if (coin == 50)
            coinNumber = fifty;
        else if (coin == 10)
            coinNumber = ten;
        else if (coin == 5)
            coinNumber = five;
        else if (coin == 1)
            coinNumber = one;

        return coinNumber;
    }

    public int GetAmount(){
        int sum = (fivehundred  + onehundred + fifty + ten + five + one);
        return sum;
    }
}
