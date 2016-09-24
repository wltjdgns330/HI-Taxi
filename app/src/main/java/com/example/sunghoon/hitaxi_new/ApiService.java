package com.example.sunghoon.hitaxi_new;

import okhttp3.ResponseBody;
import retrofit.http.Query;
import retrofit2.Call;
import retrofit2.http.POST;

/**
 * Created by sunghoon on 2016-09-24.
 */
public interface ApiService {

    public static final String API_URL = "http://52.78.176.3:3000";

    @POST("comments")
   Call<ResponseBody> getPostComment(@Query("postId") int postid);
}
