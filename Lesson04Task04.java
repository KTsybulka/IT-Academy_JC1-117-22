public class Lesson04Task04 {
    public static void main (String ...args){
        int firstMultiplier = 1;
        int secondMultiplier;
        int result;
        while (firstMultiplier <= 10){
            secondMultiplier = 1;
            while (secondMultiplier <= 10){
                System.out.println(firstMultiplier  + " * " + secondMultiplier + " = " + (firstMultiplier  * secondMultiplier));
                secondMultiplier++;
            }
            System.out.println();
            firstMultiplier++;
        }
    }
}
