public class mathFunctions {
    public static boolean esPrimo(int number) {

        if (number == 0 || number == 1 || number == 4) {
            return false;
        }
        for (int x = 2; x < number / 2; x++) {
            if (number % x == 0)
                return false;
        }
        return true;
    }

    public static boolean esMultiplo(int number1,int number2){
        if (number1%number2==0)
            return true;
        else
            return false;
    }

    public boolean estaPresente(int number1,int number2){
        while(number1>0){
            if(number1%10 == number2)
                return true;
            else
                number1=number1/10;
        }
        return false;
    }
}
