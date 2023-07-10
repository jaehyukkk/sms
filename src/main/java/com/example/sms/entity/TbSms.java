package com.example.sms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Entity
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TbSms {

    @Id
    @GeneratedValue
    private Long id;

    private String body;
    private String sender;

    @Builder
    public TbSms(Long id, String body, String sender) {
        this.id = id;
        this.body = body;
        this.sender = sender;
    }
}
