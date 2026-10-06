public class Prueba{
    public int contarDigitos(int n){
        int contador = 1;
        if(n >= 10){
            contador = 1 + contarDigitos(n/10);
        }
        return contador;
    }
}