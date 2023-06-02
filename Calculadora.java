package calculadorass.java;

public class Calculadora {   
    
    public double resultado; 

    protected String tipoCalculadora;
    protected String color;
    protected int dimensionPantalla;
    protected String numeroDeSerie;
    protected String nombrePropietario;
    
   
    public Calculadora(){
    }
    
    public Calculadora(int indice){
    }
    
    
    public Calculadora(String propietario){
        this.tipoCalculadora="Calculadora Básica";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="verde";
        this.nombrePropietario=propietario;
        
    }
    
   
    public Calculadora(String tipoCalculadora, String color, int dimensionPantalla, String numeroDeSerie, String nombrePropietario) {
        this.tipoCalculadora = tipoCalculadora;
        this.color = color;
        this.dimensionPantalla = dimensionPantalla;
        this.numeroDeSerie = numeroDeSerie;
        this.nombrePropietario = nombrePropietario;
    }
    
  
    public String getTipoCalculadora() {
        return tipoCalculadora;
    }

    public void setTipoCalculadora(String tipoCalculadora) {
        this.tipoCalculadora = tipoCalculadora;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDimensionPantalla() {
        return dimensionPantalla;
    }

    public void setDimensionPantalla(int dimensionPantalla) {
        this.dimensionPantalla = dimensionPantalla;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    } 
    
    
    
    
    public double sumar(double num1, double num2){
        return num1 + num2;
    }
    
    public double restar(double primerNumero, double segundoNumero){
        return primerNumero - segundoNumero;
    }
    
    public double multiplicar(double primerNumero, double segundoNumero){
        return primerNumero * segundoNumero;
    }
    
    public double dividir(double primerNumero, double segundoNumero){
        return primerNumero / segundoNumero;
    }
    
    public double raizCuadrada(double numero){
        return Math.sqrt(numero);
    }
    
    public boolean esPrimo(int numeroBuscado){
        boolean primo = false;
        int contador = 0;
        for(int i = numeroBuscado; i > 0; i--){
            if(numeroBuscado % i == 0 ){
                contador++;
            }
        }
        return contador == 2;
    }   
} 

