package com.exam.sky.retrofit.apiservice;

import com.exam.sky.retrofit.bean.Info;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by bluesky on 16/10/18.
 */


public interface GetInfoData {
    @Headers({"User-Agent: Apache-HttpClient/UNAVAILABLE (java 1.4)"})
    @GET(value ="index.php?_p=api&_a=carousel")
    Call<Info> getInfoListData();



}
