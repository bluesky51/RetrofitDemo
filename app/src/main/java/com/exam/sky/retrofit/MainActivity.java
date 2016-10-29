package com.exam.sky.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.exam.sky.retrofit.apiservice.GetData;
import com.exam.sky.retrofit.apiservice.GetInfoData;
import com.exam.sky.retrofit.apiservice.PostAndHeaderData;
import com.exam.sky.retrofit.apiservice.ReplacementPath;
import com.exam.sky.retrofit.bean.HotData;
import com.exam.sky.retrofit.bean.Info;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.btn_getRequest)
    Button btn_getRequest;
    @BindView(R.id.btn_getAndHeaderRequest)
    Button btn_getAndHeaderRequest;
    @BindView(R.id.btn_postRequest)
    Button btn_postRequest;
    @BindView(R.id.btn_postAndHeaderRequest)
    Button btn_postAndHeaderRequest;
    @BindView(R.id.textView)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //解析注解，得到注解的含义，
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_getRequest)
    public void getRequest(View view) {
        //  完整的请求地址：http://mrobot.pcauto.com.cn/v2/cms/channels/1?
        //               pageNo=1&pageSize=20&serialIds=2143,3404&v=4.0.0
        String baseUrl = "http://mrobot.pcauto.com.cn/";
        // 创建Retrofit.Builder对象
        Retrofit.Builder builder = new Retrofit.Builder();
        //配置请求
        builder.baseUrl(baseUrl);
        //创建Retrofit
        Retrofit retrofit = builder.build();
        //创建请求：baseUrl+接口的注解内容
        GetData getData = retrofit.create(GetData.class);
        //使用接口中方法把请求转化成任务Call
        Call<ResponseBody> responseBodyCall = getData.getListData();
        //异步执行任务Call
        responseBodyCall.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                //相比okhttp可以执行更新UI;
                //备注：需要把得到的结果先使用变量存储；
                try {
                    String result = response.body().string();
                    Log.e("======", "====onResponse===" + result);
                    textView.setText(result);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });


    }

    @OnClick(R.id.btn_getAndHeaderRequest)
    public void getAndHeaderRequest(View view) {
        //测试的完整地址：
        /**
         * GET http://interfaces.ziroom.com/index.php?_p=api&_a=carousel HTTP/1.1
         Host: interfaces.ziroom.com
         Connection: Keep-Alive
         User-Agent: Apache-HttpClient/UNAVAILABLE (java 1.4)
         Content-Type:xxxxx
         Cookie:xxx
         */
        String baseUril = "http://interfaces.ziroom.com/";
        //创建retrofit
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUril)
                //表示把得到的结果直接进行解析得到实体类
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //创建请求(注解)
        GetInfoData data = retrofit.create(GetInfoData.class);
        //用接口以及注解把请求转换成任务
        Call<Info> call = data.getInfoListData();
        //执行任务
        call.enqueue(new Callback<Info>() {
            @Override
            public void onResponse(Call<Info> call, Response<Info> response) {
                    Info info = response.body();
                    Log.e("=======","========"+info.getData().size());
                    textView.setText(info.toString());
            }

            @Override
            public void onFailure(Call<Info> call, Throwable t) {

            }
        });


    }

    @OnClick(R.id.btn_postRequest)
    public void postRequest(View view) {
    //测试地址：http://api.u148.net/json/0/1:最后一位数字为页数
        String baseUrl="http://api.u148.net/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .build();
        //创建请求，拼接请求
        ReplacementPath replacementPath = retrofit.create(ReplacementPath.class);
       //把request转化成Call
        Call<ResponseBody> call = replacementPath.getData(2);
        //执行Call
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.e("=====","===enqueue==="+response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }

    @OnClick(R.id.btn_postAndHeaderRequest)
    public void postAndHeaderRequest(View view) {
        /**
         * 测试地址：
         热门：http://api.menghuoapp.com/v1/item/pop
         请求方式：POST
         请求体：page_size=20，page=0
         请求头：名称：Content-Type，值：application/json; charset=UTF-8
         *
         */
        String baseUrl="http://api.menghuoapp.com/";
        Retrofit retrofit =new Retrofit.Builder()
                .baseUrl(baseUrl)
                //添加json数据解析工程
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //创建请求，请求接口和注解以及baseUrl
        PostAndHeaderData postAndHeaderData =retrofit.create(PostAndHeaderData.class);
        //把请求转化成任务Call
        Call<HotData> hotDataCall = postAndHeaderData.getHotListData(20,0);
        //执行任务Call
        hotDataCall.enqueue(new Callback<HotData>() {
            @Override
            public void onResponse(Call<HotData> call, Response<HotData> response) {
                Log.e("=====","====onResponse=="+response.body().getData().size());
            }

            @Override
            public void onFailure(Call<HotData> call, Throwable t) {

            }
        });


    }
}
