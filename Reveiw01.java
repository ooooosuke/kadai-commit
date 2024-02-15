public class Review01 {

    public static void main(String[] args) {
        //変数の宣言
        int price = 1500;
        int rate = 1/10;
        int tax = price*rate;
        int sum = price+tax;

        System.out.println(price"円の商品の税込み価格は"sum"円「消費税は"tax"円」です。");
