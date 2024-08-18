import java.util.*;

public class Cal {

    int ft;
    int sc;
    Scanner su = new Scanner(System.in);

    public static void main(String[] args) {
        Cal cx = new Cal(0, 0);
        cx.simple();
    }

    public Cal(int k, int p) {

        this.ft = k;
        this.sc = p;
    }

    public void simple() {
        System.out.println("Please enter the first number ");
        int p = su.nextInt();
        System.out.println("Please enter the second nummber");
        int s = su.nextInt();

        Oper op = new Oper();
        op.operion(p, s);
        su.close();

    }
}

class Oper {
    Scanner su = new Scanner(System.in);

    public void operion(int x, int y) {
        int option;
      //  int option2;
        
       // boolean exit =false ;
        do {
            System.out.println("Please choose a number follow the bottom  Menu");
            System.out.println("1: Add");
            System.out.println("2: Subtract");
            System.out.println("3: Division");
            System.out.println("4: Multiply");
            System.out.println("0: Exit");
            System.out.println("Please select an operation:");
            option = su.nextInt();
            //su.nextLine();

            switch (option) {

                case 1:
                    System.out.println(x + y);
                    break;
                case 2:
                    System.out.println(x - y);
                    break;
                case 3:
                    if (y != 0) {
                        System.out.println(x / y);
                    } else {
                        System.out.println("Undefned ");
                    }
                    break;
                case 4:
                    System.out.println(x * y);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please choose a valid option (1-4 or 0 to exit).");

            }
            
           if (option!=0) {
           System.out.print("Please  enetr the continuee");
                su.nextLine();
                su.nextLine();
                
            
           }

        }while (option!=0);
    	su.close();
    }
   
}
