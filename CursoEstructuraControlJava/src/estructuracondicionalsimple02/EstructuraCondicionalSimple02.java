
package estructuracondicionalsimple02;

import java.util.Scanner;


public class EstructuraCondicionalSimple02 {
    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Nota: ");
        
        int nota=scanner.nextInt();
        
    
        //Forma Abreviada
            //if(nota >= 7)System.out.println("Estas Aprobado!!");
               if(nota >= 7){
            System.out.println("Estas Aprobado!!");
        }
                   if(nota < 7){
            System.out.println("No estas Aprobado!!");
        }
        
        System.out.println("Gracias por ingresar tu nota!!!");
        
        
        
        
      
        
        
    }

}
