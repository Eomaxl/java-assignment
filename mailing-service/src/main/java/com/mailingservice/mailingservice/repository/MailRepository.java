package com.mailingservice.mailingservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.mailingservice.mailingservice.entity.Mail;

public interface MailRepository extends CrudRepository<Mail, Long> {

}