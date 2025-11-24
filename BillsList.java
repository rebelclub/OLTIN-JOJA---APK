package com.example.waiter.model.db.bills;

import com.example.waiter.model.db.login.Login;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BillsList {

    @SerializedName("bills")
    private List<Bills> bills;

    @SerializedName("SUMM")
    private String SUMM;

    public BillsList(List<Bills> bills, String SUMM) {
        this.bills = bills;
        this.SUMM = SUMM;
    }

    public List<Bills> getBillsList() {
        return this.bills;
    }

    public void setBillsList(List<Bills> bills) {
        this.bills = bills;
    }

    public String getSUMM() {
        return SUMM;
    }

    public void setSUMM(String SUMM) {
        this.SUMM = SUMM;
    }

}
