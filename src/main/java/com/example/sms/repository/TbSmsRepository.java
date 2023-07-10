package com.example.sms.repository;

import com.example.sms.entity.TbSms;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbSmsRepository extends JpaRepository<TbSms, Long> {
}
