package lab;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class Main {

    @SneakyThrows
    public static void main(String ... args){
        HttpReq request = new HttpReq();
        Random random = new Random();
        while(true){
            StatusInfo info = null;
            info = new StatusInfo(random.nextInt(400)+100, " ");
            try {
                request.getRequet(info);
            } catch (Exception e) {

                log.error(e.getMessage());
                log.info("this is not so importannt message");
                log.debug("totally not important only for the developers");
            }
            Thread.sleep(1000);
        }
    }
}
