import java.util.Scanner;

public class ManStrings{

  public static void main (String args[]){
  
  String cadena = "", cadenaDiv = "";
  int len = 0, inicio = 0, fin = 0;
  Scanner entrada = new Scanner(System.in);
  
  System.out.print("Teclea tu palabra: ");
  cadena = entrada.nextLine();
  
  len = cadena.length();
  System.out.println("La cadena " + cadena + " tiene " + len + " car�cteres");
  
  System.out.print("�De d�nde quieres cortar la cadena?: ");
  inicio = entrada.nextInt();
  System.out.print("�Hasta d�nde quieres cortar la cadena?: ");
  fin = entrada.nextInt();
  
  cadenaDiv = cadena.substring(inicio, fin);

  System.out.print("La nueva cadena es: " + cadenaDiv);
   
 }
}