package by.itstep.elena.java.stages.stage20.photCenter.model.entity.exceptions;
// основной класс Exception. Наследуется от Exception

public class ServiceOrderProjectException extends  Exception{

    //для логических достаточно 2 конструктора (это дефолтный и который принмает сообщение, чтобы уточнить
    //в сообщении, что может пройти за исключительная ситуация

    // для технических нужно все 4 конструктора, которые уже есть в класса
    //Exception от которого мы просто расширяемся extends Exception

    public ServiceOrderProjectException() {
        super();
    }

    public ServiceOrderProjectException(String message) {
        super(message);
    }

    public ServiceOrderProjectException(String message , Throwable cause) {

        super(message , cause);
    }

    public ServiceOrderProjectException(Throwable cause) {

        super(cause);
    }
}
