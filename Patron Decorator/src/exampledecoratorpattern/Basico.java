/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exampledecoratorpattern;

/**
 *
 * @author ASUS PC
 */
public class Basico extends Radio {

    public Basico(VentaAuto ventaAuto) {
        
        super(ventaAuto);
    }
    //Metodos que retornan del componente y del decorador concreto

    @Override
    public String getDescription() {
        return getVentaAuto().getDescription() + "\n- Basico";
    }
    //Metodos que retornan del componente y del decorador concreto

    @Override
    public int getPrice() {
        return getVentaAuto().getPrice() + 200000;
    }

}
