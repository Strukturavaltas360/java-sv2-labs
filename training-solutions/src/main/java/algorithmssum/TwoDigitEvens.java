package algorithmssum;

public class TwoDigitEvens {

    public int getSum(){
        int sum = 0;

        for (int i = 11;i<=99;i+=2){
            if (i%5 !=0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(new TwoDigitEvens().getSum());
    }
}
