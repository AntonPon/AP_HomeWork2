package lab;

public class InfoStatusGenerator implements StatusGenerator {
    @Override
    public String genearateResponse(StatusInfo statusInfo) {
        return String.format("informational %d and problem " + statusInfo.getCause(), statusInfo.getCode());
    }
}
