package lib;
import java.util.Scanner;

public class LibMenu {
    public Scanner lector = new Scanner(System.in);
    /**
     * El menú aparece en consola cuando lo invocas y dependiendo lo que elija el usuario devuelve una string con el nombre de la operación, por ejemplo "suma" o "resta"
     * @return
     */
    public String mostrarMenu(){
        int seleccionado;
            
        System.out.println("*****************\n** CALCULADORA **\n*****************\n1. Operaciones aritmeticas\n2. Conversiones de base\n--------------------------\n0. Salir del programa");
        seleccionado = Integer.parseInt(lector.nextLine());
        String operacion="";
        switch (seleccionado){
            case 1:
                System.out.println("\n\n\n\n");
                operacion = menuAritmeticas();
                break;
                case 2:
                System.out.println("\n\n\n\n");
                operacion = menuConversiones();
                break;
                case 0:
                operacion ="salir";
                break;
                
                default:
                break;
        }
        return operacion;
       
    }

    public String menuAritmeticas() {
        int seleccionado;
        System.out.println("*****************************\n** OPERACIONES ARITMETICAS **\n*****************************\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Resto de la division\n--------------------------\n0. Volver al menu principal");
        seleccionado = Integer.parseInt(lector.nextLine());
        String subOperacion="";
        switch (seleccionado) {
            case 1:
            subOperacion="suma";
            break;
            case 2:
            subOperacion="resta";
            break;
            case 3:
            subOperacion ="multiplicacion";
            break;
            case 4:
            subOperacion ="division";
            break;
            case 5:
            subOperacion="resto";
            break;
            case 0:
            System.out.println("\n\n\n\n");
            mostrarMenu();
            break;
            
            default:
            break;
        }
        return subOperacion;
    }
    
    public String menuConversiones() {
        int seleccionado;
        System.out.println("**************************\n** CONVERSIONES DE BASE **\n**************************\n1. De decimal a binario\n2. De decimal a hexadecimal\n3. De binario a decimal\n4. De binario a hexadecimal\n5. De hexadecimal a binario\n6. De hexadecimal a decimal\n--------------------------\n0. Volver al menu principal");
        seleccionado = Integer.parseInt(lector.nextLine());
        String subOperacion="";
        switch (seleccionado) {
            case 1:
                subOperacion="decimalABinario";
            break;
            case 2:
                subOperacion="decimalAHexadecimal";
            break;
            case 3:
                subOperacion ="binarioADecimal";
            break;
            case 4:
                subOperacion ="binarioAHexadecimal";
            break;
            case 5:
                subOperacion="hexadecimalABinario";
            break;
            case 6:
                subOperacion="hexadecimalADecimal";
            break;
            case 0:
                System.out.println("\n\n\n\n");
                mostrarMenu();
            break;
                
                default:
                break;
        }
        return subOperacion;
    }
}
