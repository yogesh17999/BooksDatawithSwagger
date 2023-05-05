package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
public class Apimessage {

    private HttpStatus status;
    private String message;
    private Object data;

    public Apimessage() {
    }

    public Apimessage(HttpStatus status, String message) {
        this.status = status;
        this.message = message;
    }

    public Apimessage(HttpStatus status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public Apimessage(HttpStatus status, Object data) {
        this.status = status;
        this.data = data;
    }

}
