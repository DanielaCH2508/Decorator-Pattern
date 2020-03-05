
package exampledecoratorpattern;

public abstract class AutomovilDecorator implements VentaAuto {
// La clase AutomovilDecorator implementa la Clase VentaAuto
   
    private VentaAuto ventaAuto;

    
    public AutomovilDecorator(VentaAuto ventaAuto) {
        setVentaAuto(ventaAuto);
    }

   
    public VentaAuto getVentaAuto() {
        return ventaAuto;
    }

    public void setVentaAuto(VentaAuto ventaAuto) {
        this.ventaAuto = ventaAuto;
    }
}
