import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNum = input.nextInt();
        System.out.println("Введите второе число");
        int secondNum = input.nextInt();
        System.out.println("Результат: " + multiplication(firstNum, secondNum));
    }

    static int multiplication(int firstNum, int secondNum){
        if (firstNum == 0 | secondNum == 0){
            return 0;
        }
        boolean isNegative = firstNum < 0 && secondNum > 0 || firstNum > 0 && secondNum < 0;
        int result = 0;
        firstNum = module(firstNum);
        secondNum = module(secondNum);
        if (firstNum > secondNum) {
            int tempChange = firstNum;
            firstNum = secondNum;
            secondNum = tempChange;
        }
        for(int i = 0; i < firstNum; i++){
            result += secondNum;
        }
        return isNegative ? -result : result;
    }

    private static int module(int number){
        return number < 0 ? -number : number;
    }

}
