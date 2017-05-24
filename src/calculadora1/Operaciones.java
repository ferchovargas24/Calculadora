/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora1;

/**
 *
 * @author Fernando Vargas
 */
public class Operaciones {
    
    public float suma(Usuario u){
        float suma = u.num1 + u.num2;
        return suma;
    }
    
    public float resta(Usuario u){
        float resta = u.num1 - u.num2;
        return resta;
    }
    
    public float producto(Usuario u){
        float producto = u.num1 * u.num2;
        return producto;
    }
    
    public float division(Usuario u){
        float division = u.num1 / u.num2;
        return division;
    }
}
