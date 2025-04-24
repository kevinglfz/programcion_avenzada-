package kevin ; 

import  java.util.Scanner;

public class variables {
    
    public static  void  mani (String [] args ) {

    Scanner sc = new Scanner (System.in);
    System.out.println("ingrese el radio del círculo ");
    double radio = sc.nextdouble();
    double area = 3.1416 * (radio * radio );
    System.out.println("el área del circulo es:" + area );


}
}