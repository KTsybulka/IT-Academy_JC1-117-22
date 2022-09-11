public class Task4 {
    public static void main (String ...args){
        int threeDdigitNumber = 345;
        System.out.println("The sum of the numbers is " +  (threeDdigitNumber % 10 +  (threeDdigitNumber / 10) % 10 + (threeDdigitNumber / 100) % 10)  +" .");

    }
}
