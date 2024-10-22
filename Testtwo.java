public class Testtwo {
    public static void m1() {
        System.out.println(10/5);
        //System.out.println(10/0);
        try{
            //throw new ArithmeticException("Lunch Time");
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
            System.out.println(ae.getMessage());

        }
        System.out.println(10/2);

    }
    public static void main(String[]args){
        m1();
    }
    
}
