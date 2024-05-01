public class ParametrosInvalidosException extends Exception{

    private static String message = "O segundo parâmetro deve ser maior que o primeiro";

    public ParametrosInvalidosException(){
        super(message);
    }
}
