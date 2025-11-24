package com.example.waiter.model.api;

import com.example.waiter.model.db.bills.BillsList;
import com.example.waiter.model.db.login.Login;
import com.example.waiter.model.db.orders.Orders;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {

    String BASE_URL = "http://172.16.10.162:3000/api/";
    @GET("login/user")
    Call<Login> getUserData(@Query("password") String password);

    @GET("orders")
    Call<ArrayList<Orders>> getUserOrders(@Query("userid") String userId);

    @GET("check-table")
    Call<String> getTableCheck(@Query("tableid") String tableId);

    @GET("bills")
    Call<ArrayList<BillsList>> getBills(@Query("orderid") Integer orderId, @Query("tableid") Integer tableId);
}
