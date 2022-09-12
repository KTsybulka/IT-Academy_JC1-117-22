public class Lesson03Task01 {
    public static void main(String ...args){
        byte dayOfWeek = 5;
        switch (dayOfWeek){
            case 1:
                System.out.println("It's Monday.");
                break;
            case 2:
                System.out.println("It's Tuesday.");
                break;
            case 3:
                System.out.println("It's Wensday.");
                break;
            case 4:
                System.out.println("It's Thursday.");
                break;
            case 5:
                System.out.println("It's Friday.");
                break;
            case 6:
                System.out.println("It's Saterday.");
                break;
            default:
                System.out.println("It's Sunday.");
        }
    }
}
