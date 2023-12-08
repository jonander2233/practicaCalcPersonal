import lib.LibMenu;
import calculadora.Calculadora;

public class CALC {
        public static boolean calculadora (){
                LibMenu menu = new LibMenu();
                String operacion;
                boolean salir=false;
                
   
                operacion = menu.mostrarMenu();

                        
                switch (operacion) {
                      
                        case "decimalABinario":
                                
                                break;
                     
                        case "decimalAHexadecimal":
                                String numDecimalHexa = lib.LibValidaciones.solicitarString("Ingresa un número en decimal para convertirlo a hexadecimal:", MIN, MAX);
                                String resultadoHexadecimal = Calculadora.decimalAHexadecimal(numDecimalHexa);
                                System.out.println("El resultado en hexadecimal es: " + resultadoHexadecimal);
                                break;
                       
                        case "binarioADecimal":
                                
                                break;
                       
                        case "binarioAHexadecimal":
                               
                                break;
                       
                        case "hexadecimalABinario":
                               
                                break;
                        
                        case "hexadecimalADecimal":
                           
                                break;
                        
                        case "suma":
                                
                                break;

                        case "resta":
                               
                                break;
                        case "multiplicacion":
                                
                                
                                break;
                        case "division":
                                
                                break;
                        case "resto":
                                
                                break;
                        case "salir":
                                return  salir = true;
                                break;
                        default:
                                break;
                        }
                return salir;
        }
}
