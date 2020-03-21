package com.seroga.bootgradle;
import com.seroga.core.MyStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeApi {

    @GetMapping("/1")
    public String hello() {
        String message =  "Hello 12312412!";
//        String msg2 = message;
        String msg2 = MyStringUtils.addPrefix(message);
        return msg2;
    }
}
