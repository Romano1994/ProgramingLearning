import java.util.Arrays;

public class ch7pr_1_2 {
    public static void main(String[] args) {
        SutdaDeck1 deck1 = new SutdaDeck1();
        for(int i=0; i<deck1.sutdaCards.length; i++){
            System.out.print(deck1.sutdaCards[i] + ", ");
        }
    }
}

class SutdaCard1{
    int num;
    boolean isKwang;

    SutdaCard1(int num, boolean isKwang){
        this.num = num;
        this.isKwang = isKwang;
    }
    SutdaCard1(){
        this(1,true);
    }
    public String toString(){
        return num + (isKwang ? "K" : "");
    }
}

class SutdaDeck1{
    final int FINAL_NUM = 20;
    SutdaCard1[] sutdaCards = new SutdaCard1[FINAL_NUM];

    SutdaDeck1(){
        for(int i=0; i < sutdaCards.length; i++){
            int num = i%10+1;
            boolean isKwang = (i < 10)&&(num==1|| num==3||num==8);

            sutdaCards[i] = new SutdaCard1(num , isKwang);
        }
    }

}
