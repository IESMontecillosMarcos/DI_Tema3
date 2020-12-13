/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t3_441v2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 *
 * @author CRAMi
 */
public class DI_T3_441v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        
        // Variables.
        String class_name;
        Ejemplo ejemplo;
        Field[] myfields;
        Constructor[] mycons;
        Method[] mymeth;
        
        Class classinfo;
        
        // Instancias.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println(">> Inserta el nombre de una clase valida: ");
        class_name = entrada.nextLine();
        
        if (class_name.equals("")){
            classinfo = Class.forName("java.lang.Thread");
        } else {
            classinfo = Class.forName(class_name);
        }
        
        // Imprimir Informacion sobre la clase.       
        
        System.out.println("Nombre: "+classinfo.getName());
        
        mycons = classinfo.getConstructors();
        
        System.out.println("Fields: ");
        for (int i=0;i<mycons.length;i++){
            System.out.println(mycons[i]);
        }
        
        myfields = classinfo.getFields();
        
        System.out.println("Fields: ");
        for (int i=0;i<myfields.length;i++){
            System.out.println(myfields[i]);
        }
        
        mymeth = classinfo.getMethods();
        
        System.out.println("Methods: ");
        for (int i=0;i<mymeth.length;i++){
            System.out.println(mymeth[i]);
        }
        
    }
    
}
