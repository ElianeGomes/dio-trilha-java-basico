//Cria-se a execssão cutomizada
public class ParametrosInvalidosException extends Exception{


    public ParametrosInvalidosException(String mensagem) {//imprime mensagem de erro
        super(mensagem);
    }
    public ParametrosInvalidosException(String mensagem, Throwable  causa){ //imprime mensagem de erro e causa
        super(mensagem,causa);

    }


}
