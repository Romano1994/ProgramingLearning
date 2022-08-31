public class ch7pr_1 {
    public static void main(String[] args) {
        SutdaDeck1 deck = new SutdaDeck1();
        for(int i=0; i < deck.cards.length; i++){
            System.out.print(deck.cards[i] + ", ");
        }
    }
}
class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    SutdaCard(){
        this(1, true);
    }
    public String toString(){
        return num+(isKwang ? "K" : "");
    }
}
class SutdaDeck{
    final int FINAL_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[FINAL_NUM];

    SutdaDeck(){
        for(int i=0; i < cards.length; i++){
            int num = i%10+1;
            boolean isKwang = (i < 10)&&(i+1 == 1 || i+1 == 3 || i+1 == 8);
            cards[i] = new SutdaCard1(num,isKwang);
        }
    }
}