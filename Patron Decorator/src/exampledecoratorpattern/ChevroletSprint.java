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
public class ChevroletSprint extends Automovil {

    @Override
    public String getDescription() {
        return "Chevrolet Sprint, Modelo 2018, Color Negro\n";
    }

    @Override
    public int getPrice() {
        return 45000000;
    }
}
