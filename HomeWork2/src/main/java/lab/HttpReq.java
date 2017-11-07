package lab;

public class HttpReq {
    public void getRequet(StatusInfo info){
        HttpStatus status = HttpStatus.findByHttpCode(info.getCode());
        StatusGenerator generator = status.getStatus();
        String response = generator.genearateResponse(info);
        send(response);
    }

    private void send(String response) {
        System.out.println("the system was updated. Result of the action is:" + response);
    }
}
