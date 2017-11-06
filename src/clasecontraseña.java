
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/****************************************************************************************
 *Nombre: Any San Francisco
 * @author LAB08
 * Fecha: Noviembre 06 de 2017
 * Programa: clasecontraseña
 * Responsabilidad:Clase principal
 * 
 */
public class clasecontraseña 
{
    public static void main(String[] args)
    {
   int contraseña = 1234 ;
   int index = 3;
   int maximo=3;
    while(index !=3 )
        {
        //stop = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        System.out.println(index);
        index=3;//Incrementamos la variable en 1
                
      }
    
   contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña"));
        if (contraseña!=3)
        {
            JOptionPane.showMessageDialog(null, "Intentelo de nuevo");  
        }
        else
        {
            
        }
        contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese contraseña nuevamente"));
        if (contraseña!=3)
        {
          JOptionPane.showMessageDialog(null, "Intentelo de nuevo");   
        }
        
        else
        {
        }
         contraseña = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ultimo intento"));
        if (contraseña!=3) 
        {
         JOptionPane.showMessageDialog(null, "cuenta bloqueada, comuniquese con soporte tecnico");   
        }
        
                
      }
    
    }

