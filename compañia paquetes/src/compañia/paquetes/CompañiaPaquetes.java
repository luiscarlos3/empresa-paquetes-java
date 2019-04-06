/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compañia.paquetes;
import java.util.Scanner;

/**
 *
 * @author sala.corozal
 */
public class CompañiaPaquetes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Console = new Scanner(System.in);
        int n=0;
        System.out.print("Ingrese el numero de paquetes : ");
        n=Console.nextInt();
       double [] America_norte = new double[n];
       double [] America_sur = new  double[n];
       double [] europa = new double[n];
       double [] America_central = new double[n];
       double [] Asia = new double[n];
       double [] defectuoso = new double[n];
       
       boolean quit=false;
       int opcion=0;
         double paquete;
         double pagar;
       do{
           
           System.out.println("---Menu Principal--");
           System.out.println("1-- America Norte");
           System.out.println("2-- America central");
           System.out.println("3-- America Sur");
           System.out.println("4-- Asia");
           System.out.println("5-- Europa");
           System.out.println("0 -- salir");
           System.out.print("Seleccione una opcion : ");
           opcion=Console.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("---Control de America Norte---");
                int contar=0;
                   for (int i = 0; i < America_norte.length; i++) {
                       System.out.print("Ingrese el peso del paquete : ");
                       paquete=Console.nextDouble();
                       if(paquete>5){
                          defectuoso[i]=paquete;
                          contar++;
                       }else{
                           pagar=paquete*11.00;
                           America_norte[i]=pagar;
                           
                       }                       
                   }
                   System.out.println("\n");
                   for (int i = 0; i < America_norte.length; i++) {
                       System.out.println("pago por paquetes : " + i+ " : "+ America_norte[i] );
                       
                   }
                   
                   for (int i = 0; i < defectuoso.length; i++) {
                       System.out.println("defectuso " + "[" + i + "]" + " : " + defectuoso[i]);
                       
                   }
                   System.out.println("Numero de pauestes  mayores de 5 KG : " + contar);
                   break;
               case 2:
                   System.out.println("---Control de America Sur---");
                int contar1=0;
                   for (int i = 0; i < America_sur.length; i++) {
                       System.out.print("Ingrese el peso del paquete : ");
                       paquete=Console.nextDouble();
                       if(paquete>5){
                          defectuoso[i]=paquete;
                          contar1++;
                       }else{
                           pagar=paquete*11.00;
                           America_sur[i]=pagar;
                           
                       }                       
                   }
                   System.out.println("\n");
                   for (int i = 0; i < America_sur.length; i++) {
                       System.out.println("pago por paquetes : " + i+ " : "+ America_sur[i] );
                       
                   }
                   
                   for (int i = 0; i < defectuoso.length; i++) {
                       System.out.println("defectuso " + "[" + i + "]" + " : " + defectuoso[i]);
                       
                   }
                   System.out.println("Numero de pauestes  mayores de 5 KG : " + contar1);
                   break;
               case 3:
                   System.out.println("---Control de America Central---");
                   int contar2=0;
                   for (int i = 0; i < America_central.length; i++) {
                      System.out.print("Ingrese el peso del paquete : ");
                       paquete=Console.nextDouble();
                       if(paquete>5){
                          defectuoso[i]=paquete;
                          contar2++;
                       }else{
                           pagar=paquete*11.00;
                           America_central[i]=pagar;                           
                       }                      
                       
                   }
                   
                   System.out.println("\n");
                   for (int i = 0; i < America_central.length; i++) {
                       System.out.println("pago por paquetes : " + i+ " : "+ America_central[i] );
                       
                   }
                    for (int i = 0; i < defectuoso.length; i++) {
                       System.out.println("defectuso " + "[" + i + "]" + " : " + defectuoso[i]);
                       
                   }
                    System.out.println("Numero de pauestes  mayores de 5 KG : " + contar2);
                   break;
               case 4:
                   System.out.println("---Control de Asia---");
                   int contar3=0;
                   for (int i = 0; i < Asia.length; i++) {
                      System.out.print("Ingrese el peso del paquete : ");
                       paquete=Console.nextDouble();
                       
                       if(paquete>5){
                          defectuoso[i]=paquete;
                          contar3++;
                       }else{
                           pagar=paquete*11.00;
                           Asia[i]=pagar;                           
                       }                      
                       
                   }
                   
                   System.out.println("\n");
                   for (int i = 0; i < Asia.length; i++) {
                       System.out.println("pago por paquetes : " + i+ " : "+ Asia[i] );
                       
                   }
                    for (int i = 0; i < defectuoso.length; i++) {
                       System.out.println("defectuso " + "[" + i + "]" + " : " + defectuoso[i]);
                       
                   }
                    System.out.println("Numero de pauestes  mayores de 5 KG : " + contar3);
                   break;
                  //////////////////
               case 5:
                   System.out.println("---Control de Europa---");
                   int contar4=0;
                   for (int i = 0; i < europa.length; i++) {
                      System.out.print("Ingrese el peso del paquete : ");
                       paquete=Console.nextDouble();
                       if(paquete>5){
                          defectuoso[i]=paquete;
                          contar4++;
                       }else{
                           pagar=paquete*11.00;
                        europa[i]=pagar;                           
                       }                      
                       
                   }
                   
                   System.out.println("\n");
                   for (int i = 0; i < europa.length; i++) {
                       System.out.println("pago por paquetes : " + i+ " : "+ europa[i] );
                       
                   }
                    for (int i = 0; i < defectuoso.length; i++) {
                       System.out.println("defectuso " + "[" + i + "]" + " : " + europa[i]);
                       
                   }
                    System.out.println("Numero de pauestes  mayores de 5 KG : " + contar4);
                   break;
                   
                  
               case 0:
                   quit=true;
                   System.exit(0);
                   break;
               default:
                   System.out.println("\nSeleccion invalida\n");
                   break;
           }
       }while(quit==false);
       
    }
    
}
