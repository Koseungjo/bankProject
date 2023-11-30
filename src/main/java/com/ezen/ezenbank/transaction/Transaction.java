package com.ezen.ezenbank.transaction;

import com.ezen.ezenbank.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long balance;
    private String type;
    private long balanceAfterTransaction;
    private String accountNumber;
}
