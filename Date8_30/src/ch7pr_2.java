public class ch7pr_2 {
    public static void main(String[] args) {
        SutdaDeck1 deck = new SutdaDeck1();
        System.out.println(deck.pick(20));
        System.out.println(deck.pick());
        deck.shuffle();

        for (int i = 0; i < deck.cards.length; i++) {
            System.out.print(deck.cards[i] + ", ");
        }

        System.out.println();
        System.out.println(deck.pick(0));
    }
}

class SutdaCard1 {
    int num;
    boolean isKwang;

    SutdaCard1(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    SutdaCard1() {
        this(1, true);
    }

    public String toString() {
        return num + (isKwang ? "K" : "");
    }
}

class SutdaDeck1 {
    final int FINAL_NUM = 20;
    SutdaCard1[] cards = new SutdaCard1[FINAL_NUM];

    SutdaDeck1() {
        for (int i = 0; i < cards.length; i++) {
            int num = i % 10 + 1;
            boolean isKwang = (i < 10) && (num ==1 ||num ==3 ||num ==8);
            cards[i] = new SutdaCard1(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < cards.length; i++) {
            int ran = (int) (Math.random() * cards.length);
            SutdaCard1 tmp = cards[ran];
            cards[ran] = cards[i];
            cards[i] = tmp;
        }
    }
    SutdaCard1 pick(int index){
        if(index >= cards.length || index < 0){
            return null;
        }else {
            return cards[index];
        }
    }
    SutdaCard1 pick(){
        int pickNum = (int)(Math.random()* cards.length);
        return cards[pickNum];
    }
}