/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_t3_441v2;

/**
 *
 * @author Marcos GOnzalez Leon
 */
public class Ejemplo {
    
    // Atts.
    String titulo;
    int numero;
    
    // Const.
    public Ejemplo(){
        setTitulo("Ejemplo");
        setNumero(0);
    }
    public Ejemplo(String titulo,int numero){
        setTitulo(titulo);
        setNumero(numero);
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    
    public String getTitulo(){
        return titulo;
    }
    public int getNumero(){
        return numero;
    }
    // Methods.
    
}
