package lab;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum HttpStatus {
    SUCCESS(200, 299, new SuccessStatusGenerator()), INFO(100, 199, new InfoStatusGenerator()), SERVER_ERROR(500, 599, new ServerStatusGenerator()),
    REDIRECT(300, 399, new RedirectStatusGenerator()), CLIENT_ERROR(400, 499, new ClientStatusGenerator());

    private int min;
    private int max;
    private StatusGenerator status;


    public static HttpStatus findByHttpCode(int code) {
        HttpStatus[] statusA = values();
        for(HttpStatus status: statusA){
            if (code >= status.getMin() && code <= status.getMax()){
                return status;
            }
        }
        throw new IllegalStateException(code + " is out of bound 100-500");
    }
}
