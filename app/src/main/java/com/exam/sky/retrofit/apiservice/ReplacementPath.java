package com.exam.sky.retrofit.apiservice;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by bluesky on 16/10/18.
 */

public interface ReplacementPath {

    @GET(value = "json/0/{page}")
    Call<ResponseBody> getData(@Path("page") int page);
}
