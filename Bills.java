package com.example.waiter.model.db.bills;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class Bills implements Serializable {

  @SerializedName("SDATE")
  private String SDATE;

  @SerializedName("BLUDID")
  private Integer BLUDID;

  @SerializedName("NAIM")
  private String NAIM;

  @SerializedName("PRICE")
  private Integer PRICE;

  @SerializedName("SUM")
  private Integer SUM;

  @SerializedName("COMENT")
  private String COMENT;

  @SerializedName("TYPE")
  private Integer TYPE;

  public Bills(String SDATE, Integer BLUDID, String NAIM, Integer PRICE, Integer SUM, String COMENT, Integer TYPE) {
    this.SDATE = SDATE;
    this.BLUDID = BLUDID;
    this.NAIM = NAIM;
    this.PRICE = PRICE;
    this.SUM = SUM;
    this.COMENT = COMENT;
    this.TYPE = TYPE;
  }

  public String getSDATE() {
    return this.SDATE;
  }

  public void setSDATE(String SDATE) {
    this.SDATE = SDATE;
  }

  public Integer getBLUDID() {
    return this.BLUDID;
  }

  public void setBLUDID(Integer BLUDID) {
    this.BLUDID = BLUDID;
  }

  public String getNAIM() {
    return this.NAIM;
  }

  public void setNAIM(String NAIM) {
    this.NAIM = NAIM;
  }

  public Integer getPRICE() {
    return this.PRICE;
  }

  public void setPRICE(Integer PRICE) {
    this.PRICE = PRICE;
  }

  public Integer getSUM() {
    return this.SUM;
  }

  public void setSUM(Integer SUM) {
    this.SUM = SUM;
  }

  public String getCOMENT() {
    return this.COMENT;
  }

  public void setCOMENT(String COMENT) {
    this.COMENT = COMENT;
  }

  public Integer getTYPE() {
    return this.TYPE;
  }

  public void setTYPE(Integer TYPE) {
    this.TYPE = TYPE;
  }
}
