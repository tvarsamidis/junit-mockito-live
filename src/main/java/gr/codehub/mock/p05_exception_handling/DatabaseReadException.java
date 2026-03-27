package gr.codehub.mock.p05_exception_handling;

public class DatabaseReadException extends RuntimeException {
    public DatabaseReadException(String message) {
        super(message);
    }
}
