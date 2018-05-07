package org.jsoncloud.hotel.lock.interfaces;

import retrofit2.Call;
import retrofit2.http.*;

import java.util.Map;

/**
 * Created by zhaolingyun on 2018/2/26.
 */
public interface TestLoginService {
    //1.2接口定义

    /**
     * 测试登录接口
     * @param userPhone
     * @param token
     * @param method
     * @return
     */

    @POST("passenger/userAction_login")
    Call<Map<String, Object>> login(@Query("userPhone") String userPhone,
                                    @Query("token") String token,
                                    @Query("ip") String ip,
                                    @Query("method") String method);

    @Headers({
            "auth-token:4b3c37ae-a140-405a-a972-bdc8b4a4446d"
    })
    @GET("passenger/userAction_getMyInfo")
    Call<Map<String,Object>> query();

}
