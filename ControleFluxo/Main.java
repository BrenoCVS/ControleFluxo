import java.util.Scanner;

public class Main{

    public static void main(String[] args){

            Scanner scanner = new Scanner(System.in);
            ControleFluxo controleFluxo = new ControleFluxo();

            System.out.println("Insira o primeiro número: ");
            controleFluxo.setNumero1(scanner.nextInt());

            System.out.println("Insira o segundo número: ");
            controleFluxo.setNumero2(scanner.nextInt());

        try{
            contar(controleFluxo.getNumero1(), controleFluxo.getNumero2());
        }
        catch (ParametrosInvalidosException exception){
            System.out.println("O segundo número deve ser maior que o primeiro!");
        }
    }
    static void contar(int num1, int num2) throws ParametrosInvalidosException{
        if (num1 > num2){
            throw new ParametrosInvalidosException(); 
        }

        int cont = num2 - num1;

        for(int x = 1; x <= cont; x++){
            System.out.println("Imprimindo o número "+x);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(){
        super("O segundo número deve ser maior que o primeiro!");
    }
}