package com.example.sms.controller;

import com.example.sms.service.SmsService;
import com.example.sms.vo.SmsRequestVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class MainController {

    private final SmsService smsService;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("aa", "bb");
        return "/home";
    }

    @ResponseBody
    @RequestMapping(value = "/api/sms", method = RequestMethod.POST)
    public ResponseEntity<?> createSms(@RequestBody SmsRequestVO smsRequestVO) {
        smsService.smsCreate(smsRequestVO);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
