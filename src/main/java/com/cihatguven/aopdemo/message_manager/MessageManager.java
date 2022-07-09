package com.cihatguven.aopdemo.message_manager;

import com.cihatguven.aopdemo.message_service.MessageService;
import org.springframework.stereotype.Service;

@Service
public class MessageManager implements MessageService {

    @Override
    public String giveMessage(String param) {

            System.out.println(param);
            return param;
    }
}
