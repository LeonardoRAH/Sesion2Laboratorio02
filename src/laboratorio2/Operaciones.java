/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio2;

public class Operaciones {
    
    private float elemento01;
    private float elemento02;
    
    //Genero el constructor
    public Operaciones(float elemento01, float elemento02) {
        this.elemento01 = elemento01;
        this.elemento02 = elemento02;
    }
    
    //Encapsulo los elementos
    public float getElemento01() {
        return elemento01;
    }
    public void setElemento01(float elemento01) {
        this.elemento01 = elemento01;
    }

    public float getElemento02() {
        return elemento02;
    }
    public void setElemento02(float elemento02) {
        this.elemento02 = elemento02;
    }
    
    //Proceso las operaciones en funciones
    public float Sumar(){
        return this.elemento01 + this.elemento02;
    }
    public float Restar(){
        return this.elemento01 - this.elemento02;
    }
    public float Multiplicar(){
        return this.elemento01 * this.elemento02;
    }
    public float Dividir(){
        return this.elemento01 / this.elemento02;
    }
}
