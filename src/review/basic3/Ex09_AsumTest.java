package basic3;

public class Ex09_AsumTest {
    public static void main(String[] args) {
        int sum = sumFunc(5);
        System.out.println("합 : "+sum);
    }

    static int sumFunc(int i){

        if (i==1) return 1;
        return i + sumFunc(i-1);
    }
}
