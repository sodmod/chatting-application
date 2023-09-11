package com.badmussodiq.chattingapplication.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Controller
public class Message {
    private String senderName;
    private String receiverName;
    private String message;
    private String data;
    private Status status;
}
