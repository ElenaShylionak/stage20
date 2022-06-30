package by.itstep.elena.java.stages.stage20.photCenter.model.entity.exceptions;

//логические Exception

class LogicalServiceOrderProjectException extends ServiceOrderProjectException {
    //делегируем 2 конструктора из класса.
    public LogicalServiceOrderProjectException () {
         super();
    }

    public LogicalServiceOrderProjectException(String message) {
        super(message);
    }
}
