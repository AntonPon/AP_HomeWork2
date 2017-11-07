package lab;

public class ServerStatusGenerator implements StatusGenerator {
    @Override
    public String genearateResponse(StatusInfo statusInfo) {
        return String.format("server error %d, and the problem is"+statusInfo.getCause(), statusInfo.getCode());
    }
}
