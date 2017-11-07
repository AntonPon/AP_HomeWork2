package lab;



public class StatusInfo {
    private int code;
    private String cause;

    public StatusInfo(int code, String cause){
        this.code = code;
        this.cause = cause;
    }

    public int getCode() {
        return code;
    }

    public String getCause() {
        return cause;
    }
}
