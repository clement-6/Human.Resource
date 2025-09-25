package management.human.resource.exception;

public class ResourceNotFoundException extends ManagementRuntimeException{


    public ResourceNotFoundException(ExceptionMessage message) {
        super(message);
    }

    public ResourceNotFoundException(ExceptionMessage message, String... replacements) {
        super(message, replacements);
    }

    public ResourceNotFoundException(ExceptionMessage message, Throwable throwable) {
        super(message, throwable);
    }
}
