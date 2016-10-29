package com.exam.sky.retrofit.apiservice;

import com.exam.sky.retrofit.bean.HotData;

import retrofit2.Call;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by bluesky on 16/10/18.
 */

public interface PostAndHeaderData {
    @Headers({"Content-Type:application/json; charset=UTF-8"})
    @POST(value = "v1/item/pop")
    Call<HotData> getHotListData(@Query("pageSize") int pageSize, @Query("page") int page);
}
