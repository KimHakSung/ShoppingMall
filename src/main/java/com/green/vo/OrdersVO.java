package com.green.vo;

import java.util.Date;

public class OrdersVO {
    private int id;
    private String orders_name;
    private String orders_id;
    private String orders_address;
    private String orders_phonenumber;
    private String orders_payment;
    private Date orders_date;
    private int Member_id;
    private int product_id;

  public int getId() {
    return id;
  }

  public String getOrders_name() {
    return orders_name;
  }

  public String getOrders_id() {
    return orders_id;
  }

  public String getOrders_address() {
    return orders_address;
  }

  public String getOrders_phonenumber() {
    return orders_phonenumber;
  }

  public String getOrders_payment() {
    return orders_payment;
  }

  public Date getOrders_date() {
    return orders_date;
  }

  public int getMember_id() {
    return Member_id;
  }

  public int getProduct_id() {
    return product_id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setOrders_name(String orders_name) {
    this.orders_name = orders_name;
  }

  public void setOrders_id(String orders_id) {
    this.orders_id = orders_id;
  }

  public void setOrders_address(String orders_address) {
    this.orders_address = orders_address;
  }

  public void setOrders_phonenumber(String orders_phonenumber) {
    this.orders_phonenumber = orders_phonenumber;
  }

  public void setOrders_payment(String orders_payment) {
    this.orders_payment = orders_payment;
  }

  public void setOrders_date(Date orders_date) {
    this.orders_date = orders_date;
  }

  public void setMember_id(int member_id) {
    Member_id = member_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }
}
