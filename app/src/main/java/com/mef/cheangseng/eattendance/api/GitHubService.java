package com.mef.cheangseng.eattendance.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by HP on 23-Feb-18.
 */

public interface GitHubService {
    @Headers({
            "Accept: application/vnd.github.v3.full+json",
            "User-Agent: Retrofit-Sample-App"
    })
    @GET("users/{username}")
    Call<List<Object>> getUser(@Path("username") String username);
}
