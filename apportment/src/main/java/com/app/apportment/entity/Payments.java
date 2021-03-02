package com.app.apportment.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payments")
@Data
public class Payments {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column
    private Long waterBillAmount;
    @Column
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="America/Chicago")
    private Date waterBillPayedDate;
    @Column
    private Long powerBillAmount;
    @Column
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="America/Chicago")
    private Date powerBillPayedDate;
    @Column
    private Long maintainenceBillAmount;
    @Column
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="America/Chicago")
    private Date maintainenceBillPayedDate;
    @Column
    private Long otherBillAmount;
    @Column
    private Long otherReason;
    @Column
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone="America/Chicago")
    private Date otherBillPayedDate;
}
