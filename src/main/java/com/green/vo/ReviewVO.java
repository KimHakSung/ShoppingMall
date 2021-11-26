package com.green.vo;

import java.util.Date;

public class ReviewVO {
    private int id;
    private String review_id;
    private String review_name;
    private String review_title;
    private String review_content;
    private Date review_date;
    private int review_stars;
    private int Member_id;
    private int product_id;

  public int getId() {
    return id;
  }

  public String getReview_id() {
    return review_id;
  }

  public String getReview_name() {
    return review_name;
  }

  public String getReview_title() {
    return review_title;
  }

  public String getReview_content() {
    return review_content;
  }

  public Date getReview_date() {
    return review_date;
  }

  public int getReview_stars() {
    return review_stars;
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

  public void setReview_id(String review_id) {
    this.review_id = review_id;
  }

  public void setReview_name(String review_name) {
    this.review_name = review_name;
  }

  public void setReview_title(String review_title) {
    this.review_title = review_title;
  }

  public void setReview_content(String review_content) {
    this.review_content = review_content;
  }

  public void setReview_date(Date review_date) {
    this.review_date = review_date;
  }

  public void setReview_stars(int review_stars) {
    this.review_stars = review_stars;
  }

  public void setMember_id(int member_id) {
    Member_id = member_id;
  }

  public void setProduct_id(int product_id) {
    this.product_id = product_id;
  }
}
