package hu.kincstar.veJavaTraining.ExceptionClass;

public class InvalidBankOperationException extends RuntimeException{
    private ErrorCode errorCode;
    public InvalidBankOperationException(ErrorCode errorCode){
        this.errorCode=errorCode;}
    public InvalidBankOperationException(String message,ErrorCode errorCode){
        super(message);
        this.errorCode=errorCode;
    }
}
