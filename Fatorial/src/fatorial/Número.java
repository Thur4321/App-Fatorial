
package fatorial;

public class Número {
    
    private int número;
    
    public int getNúmero(){
        return número;
    }
    
    public void setNúmero(int fatorial){
        número=fatorial;
    }
    
    public long fatorial(){
        long resultado;
        if (número < 0){
            resultado = -1;
        }
        else if (número == 0 || número == 1){
            resultado = 1;
        }
        else {
            int cont = número;
            resultado = 1;
            while (cont>1){
            resultado = resultado*cont;
            cont = cont-1;
            }
        }
        return resultado;
    }
}
