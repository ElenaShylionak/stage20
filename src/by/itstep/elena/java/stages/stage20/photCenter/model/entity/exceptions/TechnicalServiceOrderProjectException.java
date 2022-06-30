package by.itstep.elena.java.stages.stage20.photCenter.model.entity.exceptions;

//Технические Exception

public class TechnicalServiceOrderProjectException extends ServiceOrderProjectException{
    //делегируем 4 конструктора

    public TechnicalServiceOrderProjectException() {
        super();
    }

    public TechnicalServiceOrderProjectException(String message) {
        super(message);
    }

    public TechnicalServiceOrderProjectException(String message , Throwable cause) {

        super(message , cause);
    }

    public TechnicalServiceOrderProjectException(Throwable cause) {

        super(cause);
    }

}
