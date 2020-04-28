
package clase20calculadora;


public class Operaciones {
    
    public double suma(double a,double b){
      return a+b;
    }
    
    public double resta (double a,double b){
      return a-b;
    }
    
    public double multiplicacion(double a,double b){
      return a*b;
    }
    
    public double division(double a,double b){
      return a/b;
    }
    
    public double radicacion(double a){
      return Math.sqrt(a);
    }
    
    public double potencia(double a,double b){
      return Math.pow(a, b);
    }
    
    public String esInt(double n){
        
        if(n%1==0){
            return Integer.toString((int)n);
        }else{
            return Double.toString(n);
        }
    }
   
  
}
