public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero =1; numero <=5; numero++){
            if (numero == 3)
                continue; //break sai do laço, continue continua o laço, mas não imprime o valor 3 
            
                System.out.println(numero);
        }
    }
}
