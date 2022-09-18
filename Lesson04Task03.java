public class Lesson04Task03 {
    public static void main (String ...args){
        int firstFibonachyNumber = 0;
        int secondFibonachyNumber = 1;
        int n = 1;
        int nextFibonachyNumber;
        System.out.println(firstFibonachyNumber);
        System.out.println(secondFibonachyNumber);
        while (n <= 8){
            nextFibonachyNumber = firstFibonachyNumber  + secondFibonachyNumber;
            System.out.println(nextFibonachyNumber);
            firstFibonachyNumber = secondFibonachyNumber;
            secondFibonachyNumber = nextFibonachyNumber;
            n++;
        }
    }
}
