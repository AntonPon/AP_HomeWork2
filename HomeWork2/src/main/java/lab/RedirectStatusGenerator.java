package lab;

public class RedirectStatusGenerator implements StatusGenerator {
    @Override
    public String genearateResponse(StatusInfo statusInfo) {
        return String.format("redirection %d and the problem is "+statusInfo.getCause(), statusInfo.getCode());
    }
}
