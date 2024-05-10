import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro parâmetro:");
        int parametroUm = scanner.nextInt();

        System.out.println("Informe o segundo parâmetro");
        int parametrodois = scanner.nextInt();


       try {

          contar(parametroUm, parametrodois);
        
       } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
       }

    }


     static void contar(int parametroUm, int parametrodois) throws ParametrosInvalidosException{

        if (parametroUm > parametrodois) {
             throw new ParametrosInvalidosException();   
            
        }else{

            int contagem = parametrodois - parametroUm;

            for(int i = 0; i < contagem ; i++){
                 System.out.println("Número: " + i);
            }
        }

     }

}
