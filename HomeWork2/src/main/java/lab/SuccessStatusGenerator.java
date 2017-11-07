package lab;

public class SuccessStatusGenerator implements StatusGenerator{
    @Override
    public String genearateResponse(StatusInfo statusInfo) {
        return String.format("success %d, the reason "+statusInfo.getCause(), statusInfo.getCode());
    }
}
