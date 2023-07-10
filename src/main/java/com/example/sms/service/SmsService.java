package com.example.sms.service;

import com.example.sms.repository.TbSmsRepository;
import com.example.sms.vo.SmsRequestVO;
import com.example.sms.vo.SmsVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SmsService {

    private final TbSmsRepository tbSmsRepository;

    public void smsCreate(SmsRequestVO smsRequestVO) {

        for (int i = 0; i < smsRequestVO.getBodyList().size(); i++) {
            SmsVO smsVO = new SmsVO();

            smsVO.setBody(smsRequestVO.getBodyList().get(i));
            smsVO.setSender(smsRequestVO.getSenderList().get(i));

            tbSmsRepository.save(smsVO.toEntity());
        }
    }
}
