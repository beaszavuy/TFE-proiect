package ro.ubb.remoting.server.validators;

public interface Validator <T> {
    void validate(T entity) throws  ValidatorExeption;
}
