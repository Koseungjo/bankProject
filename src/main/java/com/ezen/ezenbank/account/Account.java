package com.ezen.ezenbank.account;

import com.ezen.ezenbank.common.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Account extends BaseEntity {

    @Id
    private String number;
    private String type;
    private long balance;
    private String password;
    private int employeeId;
    private int branchId;
    private int customerId;
}
