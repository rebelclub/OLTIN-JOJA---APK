package com.example.waiter.model.db.login;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class Login implements Serializable {

  @SerializedName("user")
  private List<User> user;

  public List<User> getUser() {
    return this.user;
  }

  public void setUser(List<User> user) {
    this.user = user;
  }

  public static class User implements Serializable {
    @SerializedName("ROLE")
    private Integer ROLE;

    @SerializedName("PASSW")
    private String PASSW;

    @SerializedName("USERID")
    private Integer USERID;

    @SerializedName("WORKERID")
    private Integer WORKERID;

    @SerializedName("FOIZ")
    private Integer FOIZ;

    @SerializedName("USERNAIM")
    private String USERNAIM;

    @SerializedName("ISACTIVE")
    private Integer ISACTIVE;

    public Integer getROLE() {
      return this.ROLE;
    }

    public void setROLE(Integer ROLE) {
      this.ROLE = ROLE;
    }

    public String getPASSW() {
      return this.PASSW;
    }

    public void setPASSW(String PASSW) {
      this.PASSW = PASSW;
    }

    public Integer getUSERID() {
      return this.USERID;
    }

    public void setUSERID(Integer USERID) {
      this.USERID = USERID;
    }

    public Integer getWORKERID() {
      return this.WORKERID;
    }

    public void setWORKERID(Integer WORKERID) {
      this.WORKERID = WORKERID;
    }

    public Integer getFOIZ() {
      return this.FOIZ;
    }

    public void setFOIZ(Integer FOIZ) {
      this.FOIZ = FOIZ;
    }

    public String getUSERNAIM() {
      return this.USERNAIM;
    }

    public void setUSERNAIM(String USERNAIM) {
      this.USERNAIM = USERNAIM;
    }

    public Integer getISACTIVE() {
      return this.ISACTIVE;
    }

    public void setISACTIVE(Integer ISACTIVE) {
      this.ISACTIVE = ISACTIVE;
    }
  }
}
