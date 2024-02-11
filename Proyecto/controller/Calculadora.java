package Proyecto.controller;

private class Calculadora {

    
    private int numeroUno;

    private int numeroDos;

    public Calculadora() {
    }

    public Calculadora (int numeroUno, int numeroDos) {
        this.numeroUno=numeroUno ;
        this.numeroDos=numeroDos ;

    }


    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora() ;

        int suma = calculadora.suma(calculadora.numeroUno, calculadora.numeroDos) ; 
        System.out.println("la suma es " +suma);

        int resta = calculadora.resta(calculadora.numeroUno, calculadora.numeroDos) ; 
        System.out.println("la resta es " + resta);

        int multiplicacion = calculadora.multiplicacion(calculadora.numeroUno, calculadora.numeroDos) ; 
        System.out.println("la multiplicacion es " + multiplicacion);

        int division = calculadora.division(calculadora.numeroUno, calculadora.numeroDos) ; 
        System.out.println("la division es " + division);
        
    }

    
    
    
}
