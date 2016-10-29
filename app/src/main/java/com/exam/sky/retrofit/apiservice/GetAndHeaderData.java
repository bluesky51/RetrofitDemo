package com.exam.sky.retrofit.apiservice;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by bluesky on 16/10/18.
 */

//HEAD表示的是请求方式和@GET,POST一样
// @Header表示请求头，但是只有一个
//@Headers表示请求头，但是可以有多个，放在一个数组中
public interface GetAndHeaderData {

    @Headers({"User-Agent: Apache-HttpClient/UNAVAILABLE (java 1.4)"})
    @GET(value ="index.php?_p=api&_a=carousel")
    Call<ResponseBody> getListDatas();


}
