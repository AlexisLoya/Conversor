/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones;

/**
 *
 * @author alexl
 */
public class operaciones {
    
    class Base 
{
String equivalente;  
int posicion;  
int numero;  
int base;  
int[] digitos;
int[] auxiliar;
  public Base(int n, int b) 
        {
                posicion = 0;
                equivalente = "";
                base = b;
                numero = n;
                digitos = new int [1];
        }
                           
        public void transformar() 
        {
                if(numero<base)
                {
                        digitos[posicion]=numero;
                        tamaño(); 
                }
                else
                {
                        digitos[posicion]=numero%base;
                        tamaño();
                        posicion++;
                        numero = numero/base;
                        transformar(); 
                 }
        }
                  	
        public String getResultado()
        {
                for (int j = digitos.length-2; j >= 0; j--) 
                {
                        equivalente+=Character.toUpperCase(Character.forDigit(digitos[j], 16));
                }
                return equivalente;
        }
                                
        private void tamaño() 
        {
                 auxiliar = digitos;
                 digitos = new int [auxiliar.length+1];
                 System.arraycopy(auxiliar, 0, digitos, 0, auxiliar.length);
        }
    }
}
