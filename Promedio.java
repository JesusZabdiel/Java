public class Promedio{
  public static void main (String args[]){
   
   int matematicas = 5;
   int biologia = 10;
   int quimica = 7;
   int espa�ol = 10;
   int promedio = 0; 


   promedio = (matematicas + biologia + quimica+ espa�ol) / 4;

   if (promedio >= 7){

    System.out.println("El alumno aprobo" + "\n" + "El promedio es:" + promedio);  
  }

   else {
    System.out.println("El alumno reprobo" + "\n" + "El promedio es:" + promedio);
  }
 }

}