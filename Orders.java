package com.example.waiter.model.db.orders;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;

public class Orders implements Serializable {

  @SerializedName("ALLORDERID")
  private Integer ALLORDERID;

  @SerializedName("ORDERID")
  private Integer ORDERID;

  @SerializedName("CLOSED")
  private String CLOSED;

  @SerializedName("STOL")
  private Integer STOL;

  @SerializedName("RESERV")
  private Integer RESERV;

  @SerializedName("OPENED")
  private String OPENED;

  public Orders(Integer ALLORDERID, Integer ORDERID, String CLOSED, Integer STOL, Integer RESERV, String OPENED) {
    this.ALLORDERID = ALLORDERID;
    this.ORDERID = ORDERID;
    this.CLOSED = CLOSED;
    this.STOL = STOL;
    this.RESERV = RESERV;
    this.OPENED = OPENED;
  }

  public Integer getALLORDERID() {
    return this.ALLORDERID;
  }

  public void setALLORDERID(Integer ALLORDERID) {
    this.ALLORDERID = ALLORDERID;
  }

  public Integer getORDERID() {
    return this.ORDERID;
  }

  public void setORDERID(Integer ORDERID) {
    this.ORDERID = ORDERID;
  }

  public String getCLOSED() {
    return this.CLOSED;
  }

  public void setCLOSED(String CLOSED) {
    this.CLOSED = CLOSED;
  }

  public Integer getSTOL() {
    return this.STOL;
  }

  public void setSTOL(Integer STOL) {
    this.STOL = STOL;
  }

  public Integer getRESERV() {
    return this.RESERV;
  }

  public void setRESERV(Integer RESERV) {
    this.RESERV = RESERV;
  }

  public String getOPENED() {
    return this.OPENED;
  }

  public void setOPENED(String OPENED) {
    this.OPENED = OPENED;
  }
}
