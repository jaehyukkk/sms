package com.example.sms.vo;

import com.example.sms.entity.TbSms;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SmsVO {

    private String sender;
    private String body;

    public TbSms toEntity() {
        return TbSms.builder()
                .sender(sender)
                .body(body)
                .build();
    }

}
