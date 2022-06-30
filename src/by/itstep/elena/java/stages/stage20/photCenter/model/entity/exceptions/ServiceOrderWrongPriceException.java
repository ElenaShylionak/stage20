package by.itstep.elena.java.stages.stage20.photCenter.model.entity.exceptions;

//Это логический Exception, поэтому наследуюется от LogicalServiceOrderProjectException
//исключельная ситуация - Неправильная цена пользователя

public class ServiceOrderWrongPriceException extends LogicalServiceOrderProjectException{

    public  ServiceOrderWrongPriceException() {
        super();
    }

    public  ServiceOrderWrongPriceException(String message) {
        super(message);
    }

}
