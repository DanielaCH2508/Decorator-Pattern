package exampledecoratorpattern;

public class ExampleDecoratorPattern {

    public static void main(String[] args) {

        VentaAuto automovil = new ChevroletSprint();
        automovil = new AireAcondicionado(automovil);
        automovil = new Blindaje(automovil);
        automovil = new Polarizado(automovil);
        automovil = new DVD(automovil);
        automovil = new Mp4Player(automovil);
        automovil = new Radio(automovil);
        automovil = new Basico(automovil);
        automovil = new GPS(automovil);

        System.out.println("La descripcion es: " + automovil.getDescription());
        System.out.println("\nEl precio es: " + automovil.getPrice());
    }
}
