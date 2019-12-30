package io.pachon.jorge.empresaleonisa;

public class OrderException extends Exception{

    public OrderException(int cantidadInvalida){
        super("La cantidad no es permitida para realizar una orden " + cantidadInvalida  );
    }
}
