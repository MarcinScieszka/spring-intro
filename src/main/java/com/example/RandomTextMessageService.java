package com.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component("randomMessageService")
public class RandomTextMessageService implements MessageService {

    String[] msg = {"msg 1", "msg 2", "msg 3", "msg 4", "msg 5", "msg 6", "msg 7", "msg 8", "msg 9", "msg 10"};

    @Override
    public String getMessage() {
        Random rd = new Random();
        int randomNr = rd.nextInt(11);
        return msg[randomNr];
    }
}
