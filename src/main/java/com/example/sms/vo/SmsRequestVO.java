package com.example.sms.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SmsRequestVO {

    private List<String> senderList;
    private List<String> bodyList;

}
