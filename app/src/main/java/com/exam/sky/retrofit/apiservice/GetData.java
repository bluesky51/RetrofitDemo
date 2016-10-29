package com.exam.sky.retrofit.apiservice;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by bluesky on 16/10/18.
 */


public interface GetData {

    @GET(value = "v2/cms/channels/1?pageNo=1&pageSize=20&serialIds=2143,3404&v=4.0.0")
    Call<ResponseBody> getListData();



}
