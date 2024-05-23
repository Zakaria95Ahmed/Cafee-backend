package com.inn.cafe.Model.Pojo;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
@NamedQuery(name = "Bill.getAllBills", query = "select b from Bill b order by b.id desc")
@NamedQuery(name = "Bill.getBillByUserName", query = "select b from Bill b where b.createdBy=:username order by b.id desc ")

@Data
@Entity
@Table(name = "_bill")
@DynamicInsert
@DynamicUpdate
public class Bill implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "uuid")
    private String uuid;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(name = "payment_method")
    private String paymentMethod;

    @Column(name = "total")
    private Integer total;

    @Column(name = "product_details",columnDefinition = "json")
    private String productDetail;

    @Column(name = "created_by")
    private String createdBy;

}
