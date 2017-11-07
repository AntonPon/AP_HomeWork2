package lab;

public class ClientStatusGenerator implements StatusGenerator {
    @Override
    public String genearateResponse(StatusInfo statusInfo) {
        return String.format("This is a client error %d and problem "+statusInfo.getCause(), statusInfo.getCode());
    }
}
