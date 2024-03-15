package lesson129;

public class HW {
    public static void main(String[] args) {
        //если у вас больше 500 р- пицца, от  300 до 500 шаурма, от 100 до 300 гамбургер, меньше 100 доширак
        int money = 200;
        if (money >= 500) {
            System.out.println("пицца");
        } else if (money >= 300 && money < 500) {
            System.out.println("шаурма");
        } else if (money >= 100 && money < 300) {
            System.out.println("гамбургер");
        } else {
            System.out.println("доширак");
        }
    }
}
