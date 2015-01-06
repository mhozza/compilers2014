/**
 * Created by tony on 12/28/14.
 */
public class Exception extends RuntimeException{

    private String message;

    public Exception(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toString() {
        return message + "\n";
    }
}
