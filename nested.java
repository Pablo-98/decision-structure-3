import java.util.Scanner;

public class nested {
    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter temp");

        int temp = input.nextInt();

        

        //hot temps

        if(temp >= 80) {
            if(temp >= 110) {
                System.out.println("dont go out there bruh");
            }
            else {
                System.out.println("wear shorts big dawg");
            }


      
        }

        //cold temps
        else {
            if(temp <= 30) {
                System.out.println("dont do it bro");


            }
            else {
                System.out.println("wear pants and jacket");
            }
        }
       



    }
}