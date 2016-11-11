import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args )  {
        Scanner datos=new Scanner(System.in);
        String bitacora[]= new String [9];
        double numero1, numero2, resultado;
        int valor, opcion, decicion;
       
       do {
        System.out.println("");
        System.out.println("+-----------------------------------+");
        System.out.println("|                            - [] X |");
        System.out.println("|                                   |");
        System.out.println("|          MENÜ PRINCIPAL           |");
        System.out.println("|                                   |");
        System.out.println("| » 1. Suma De 2 Números.           |");
        System.out.println("| » 2. Resta De 2 Números.          |");
        System.out.println("| » 3. Multiplicacion De 2 Núumeros.|");
        System.out.println("| » 4. Division De 2 Núumeros.      |");
        System.out.println("| » 5. Ver Bitacora.                |");
        System.out.println("| » 6. Borrar Bitacora.             |");
        System.out.println("| » 7. EXIT                         |");
        System.out.println("|                                   |");
        System.out.println("|                                   |");
        System.out.println("+-----------------------------------+");
        System.out.println("");
        System.out.println("NOTA: Ingrese La Opcion que Desea Operar.");
        opcion=datos.nextInt();
        switch(opcion){

            case 1:
               
               
                System.out.println("");
                System.out.println("");
                System.out.println("+-----------------------------------+");
                System.out.println("|                            - [] X |");
                System.out.println("| » Opcion 1.                       |");
                System.out.println("|                                   |");
                System.out.println("|       SUMA de 2 Números.          |");
                System.out.println("|                                   |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
                System.out.println("");
                System.out.println("");
                System.out.println("     Ingrese Primer Número. ");
                numero1=datos.nextDouble();
                System.out.println("     Ingrese Segundo Número. ");
                numero2=datos.nextDouble();
                resultado=numero1+numero2;
                System.out.println("");
                System.out.println("     La SUMA ES: " + resultado);
                System.out.println("");
                 if(bitacora[0]==null){
                    bitacora[0]=(numero1 + " + " + numero2 + " = " + resultado);
                }
                else{
                    if(bitacora[1]==null){
                    bitacora[1]=(numero1 + " + " + numero2 + " = " + resultado);
                }
                    else {
                        if(bitacora[2]==null){
                            bitacora[2]=(numero1 + " + " + numero2 + " = " + resultado);
                    }
                        else{
                          if(bitacora[3]==null){
                            bitacora[3]=(numero1 + " + " + numero2 + " = " + resultado);
                        }
                          else{
                          if(bitacora[4]==null){
                            bitacora[4]=(numero1 + " + " + numero2 + " = " + resultado);
                        }
                else{
                          if(bitacora[5]==null){
                            bitacora[5]=(numero1 + " + " + numero2 + " = " + resultado);
                        }
			}
                        }
                        }
                    }
                }
                break;


            case 2:
                
                System.out.println("");
                System.out.println("");
                System.out.println("+-----------------------------------+");
                System.out.println("|                            - [] X |");
                System.out.println("| » Opcion 2.                       |");
                System.out.println("|                                   |");
                System.out.println("|       RESTA de 2 Números.         |");
                System.out.println("|                                   |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
                System.out.println("");
                System.out.println("");
                System.out.println("     Ingrese Primer Número. ");
                numero1=datos.nextDouble();
                System.out.println("     Ingrese Segundo Número. ");
                numero2=datos.nextDouble();
                resultado=numero1-numero2;
                System.out.println("");
                System.out.println("     La RESTA ES: " +  resultado);
                System.out.println("");
                if(bitacora[0]==null){
                    bitacora[0]=(numero1 + " - " + numero2 + " = " + resultado);
                }
                else{
                    if(bitacora[1]==null){
                    bitacora[1]=(numero1 + " - " + numero2 + " = " + resultado);
                }
                    else {
                        if(bitacora[2]==null){
                            bitacora[2]=(numero1 + " - " + numero2 + " = " + resultado);
                    }
                        else{
                          if(bitacora[3]==null){
                            bitacora[3]=(numero1 + " - " + numero2 + " = " + resultado);
                        }
                          else{
                          if(bitacora[4]==null){
                            bitacora[4]=(numero1 + " - " + numero2 + " = " + resultado);
                        }
                        else{
                          if(bitacora[5]==null){
                            bitacora[5]=(numero1 + " + " + numero2 + " = " + resultado);
                        }
			}
                        }
                        }
                    }
                }

                break;
            case 3:

                System.out.println("");
                System.out.println("");
                System.out.println("+-----------------------------------+");
                System.out.println("|                            - [] X |");
                System.out.println("| » Opcion 3.                       |");
                System.out.println("|                                   |");
                System.out.println("|       MULTIPLICASION de 2 Números.|");
                System.out.println("|                                   |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
                System.out.println("");
                System.out.println("");
                System.out.println("     Ingrese Primer Número. ");
                numero1=datos.nextDouble();
                System.out.println("     Ingrese Segundo Número. ");
                numero2=datos.nextDouble();
                resultado=numero1*numero2;
                System.out.println("");
                System.out.println("     La MULTIPLICACION ES: " + resultado);
                System.out.println("");
                   if(bitacora[0]==null){
                    bitacora[0]=(numero1 + " x " + numero2 + " = " + resultado);
                }
                else{
                    if(bitacora[1]==null){
                    bitacora[1]=(numero1 + " x " + numero2 + " = " + resultado);
                }
                    else {
                        if(bitacora[2]==null){
                            bitacora[2]=(numero1 + " x " + numero2 + " = " + resultado);
                    }
                        else{
                          if(bitacora[3]==null){
                            bitacora[3]=(numero1 + " x " + numero2 + " = " + resultado);
                        }
                          else{
                          if(bitacora[4]==null){
                            bitacora[4]=(numero1 + " x " + numero2 + " = " + resultado);
                        }
			  else{
                          if(bitacora[5]==null){
                            bitacora[5]=(numero1 + " + " + numero2 + " = " + resultado);
                        }
			}
                        }
                        }
                    }
                }
                break;

            case 4:
                
                System.out.println("");
                System.out.println("");
                System.out.println("+-----------------------------------+");
                System.out.println("|                            - [] X |");
                System.out.println("| » Opcion 4.                       |");
                System.out.println("|                                   |");
                System.out.println("|      DIVICION de 2 Números.       |");
                System.out.println("|                                   |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
                System.out.println("");
                System.out.println("");
                System.out.println("     Ingrese Primer Número. ");
                numero1=datos.nextDouble();
                System.out.println("     Ingrese Segundo Número. ");
                numero2=datos.nextDouble();
                System.out.println("");
                if (numero2==0){
                    System.out.println("");
                    System.out.println("     ¡ERROR AL DIVIDIR entre CERO!");
                    System.out.println("");
                    if(bitacora[0]==null){
                    bitacora[0]=(numero1 + " / " + numero2 + " = " + "Error");
                }
                else{
                    if(bitacora[1]==null){
                    bitacora[1]=(numero1 + " / " + numero2 + " = " + "Error");
                }
                    else {
                        if(bitacora[2]==null){
                            bitacora[2]=(numero1 + " / " + numero2 + " = " + "Error");
                    }
                        else{
                          if(bitacora[3]==null){
                            bitacora[3]=(numero1 + " / " + numero2 + " = " + "Error");
                        }
                          else{
                          if(bitacora[4]==null){
                            bitacora[4]=(numero1 + " / " + numero2 + " = " + "Error");
                        }
				else{
                          if(bitacora[5]==null){
                            bitacora[5]=(numero1 + " + " + numero2 + " = " + "Error");
                        }
			}
                        }
                        }
                    }
                }
                }
                else {
                resultado=numero1/numero2;
                System.out.println("");
                System.out.println("     La DIVICION ES: " +  resultado);
                System.out.println("\n");    
                    if(bitacora[0]==null){
                    bitacora[0]=(numero1 + " / " + numero2 + " = " + resultado);
                }
                else{
                    if(bitacora[1]==null){
                    bitacora[1]=(numero1 + " / " + numero2 + " = " + resultado);
                }
                    else {
                        if(bitacora[2]==null){
                            bitacora[2]=(numero1 + " / " + numero2 + " = " + resultado);
                    }
                        else{
                          if(bitacora[3]==null){
                            bitacora[3]=(numero1 + " / " + numero2 + " = " + resultado);
                        }
                          else{
                          if(bitacora[4]==null){
                            bitacora[4]=(numero1 + " / " + numero2 + " = " + resultado);
                        }
			else{
                          if(bitacora[5]==null){
                            bitacora[5]=(numero1 + " / " + numero2 + " = " + resultado);
                        }
                        }
                        }
			}
                    }
                }
                }
                break;
            case 5:

                System.out.println("");
                System.out.println("");
                System.out.println("+-----------------------------------+");
                System.out.println("|                            - [] X |");
                System.out.println("| » Opcion 5.                       |");
                System.out.println("|                                   |");
                System.out.println("|      VER BITACORA                 |");
                System.out.println("|                                   |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
                System.out.println("");
                System.out.println("");
                for (valor=0;valor<=4;valor++){
                if(bitacora[valor]==null){
                System.out.println("");
                }
                else {
                System.out.println(bitacora[valor]);

                }
                } 
                System.out.println("\n");
                break;
            case 6:

                System.out.println("");
                System.out.println("");
                System.out.println("+-----------------------------------+");
                System.out.println("|                            - [] X |");
                System.out.println("| » Opcion 6.                       |");
                System.out.println("|                                   |");
                System.out.println("|      BORRAR BITACORA              |");
                System.out.println("|                                   |");
                System.out.println("|                                   |");
                System.out.println("+-----------------------------------+");
                System.out.println("");
                System.out.println("     ¿DESEA BORRAR SU BITACORA?");
                System.out.println("");
                System.out.println("     » 1.  [ SI ] ");
                System.out.println("     » 0.  [ NO ]");
                System.out.println("");
                System.out.println("     PUEDE COLOCAR 1 Ó 0");
                decicion=datos.nextInt();
                if (decicion==1){
                for (valor=0;valor<=5;valor++){
                bitacora[valor]=null;
                }
                System.out.println("");
                System.out.println("     +-------------------+");
                System.out.println("     |...................|");
                System.out.println("     |...................|");
                System.out.println("     |.B.I.T.A.C.O.R.A...|");
                System.out.println("     |...B.O.R.R.A.D.A...|");
                System.out.println("     |...................|");
                System.out.println("     +-------------------+");
                System.out.println("");
                System.out.println("      PROCESO FINALIZADO");
                System.out.println("");
                }
                else{
                System.out.println("     +-------------------+");
                System.out.println("     |...................|");
                System.out.println("     |...................|");
                System.out.println("     |.B.I.T.A.C.O.R.A...|");
                System.out.println("     |.....S.E.G.U.R.A...|");
                System.out.println("     |...................|");
                System.out.println("     +-------------------+");
                System.out.println("");
                System.out.println("      PROCESO FINALIZADO");
                System.out.println("");
                }
                break;
                default:
                if(opcion!=7){
                System.out.println("Seleccion incorrecta");
                }
                }
   
       }
    while(opcion!=7);

}
}



/**
*NOMBRE: CRISTIAN ESTUARDO LOPEZ
CODIGO: 0907-16-10566
*/