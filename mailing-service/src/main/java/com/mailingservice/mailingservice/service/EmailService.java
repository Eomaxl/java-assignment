package com.mailingservice.mailingservice.service;

import com.mailingservice.mailingservice.entity.dto.UserDto;

public interface EmailService {

    void sendSimpleMessage(UserDto input);
}
