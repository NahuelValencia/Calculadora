
package Pruebas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Calculadora.*;

public class UnitTest {
    
    public UnitTest() {
    }
    //TEST REALIZADOS POR NAHUEL VALENCIA
    //Probando funcionamiento del metodo suma
    @Test
    public void testSuma(){
    int resultado = Calculo.Suma(3, 2);
    int esperado = 5; 
    assertEquals("Fallo Calculo.Suma",esperado, resultado);       
    }
    
    //Probando propiedad conmutativa de suma
    @Test
    public void testConmutacionSuma(){
        int resul1 = Calculo.Suma(10, 5);
        int resul2 = Calculo.Suma(5, 10);
        
        assertEquals("Fallo Calculo.Suma", resul1, resul2);
        
    }
    
    //Probando cuando el usuario se registra que la logitud de la contraseña sea mayor a 8
    @Test
    public void testLongContraseña(){
        String a="nahuel";
        String b="sasfasdsffh";
        boolean esperado;
        boolean resultado = Usuario.Registrar(a, b);
        
        if (b.length()<8){
             esperado = false; 
        }
        else{ 
             esperado = true;
        }
        
        assertEquals("Fallo Usuario.Registrar",resultado, esperado);
    }
//    //TEST REALIZADOS POR NICOLAS LAMBERTUCCI
//    
//    //Probando propiedad conmutativa de la multiplicación
//    @Test
//    public void multiplicar(){
//        int metodo1= Calculo.Multiplicación(3,15);
//        int metodo2= Calculo.Multiplicación(3, 15);
//        assertEquals("Fallo Calculo.Multiplicación",metodo1, metodo2);
//    }
//    
//    //Probando funcionamiento de la resta
//    @Test
//    public void resta() {
//   
//        int metodo= Calculo.Resta(25, 100);
//        int result= Calculo.Resta(25,100);
//        boolean resu;
//        boolean resu2;
//        if (result >0){
//            resu2 = true;
//        }else{
//            resu2 =false;
//        }
//        if (metodo < 0){
//        resu= true;
//        }else{
//        resu=false;
//        }
//        assertTrue("Fallo Calculo.Resta",resu && resu2);         
//    }
}
