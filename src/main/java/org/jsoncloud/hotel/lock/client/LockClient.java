package org.jsoncloud.hotel.lock.client;

import org.jsoncloud.hotel.lock.converter.JacksonConverterFactory;
import org.jsoncloud.hotel.lock.interfaces.LockService;
import retrofit2.Retrofit;

/**
 * Created by zhaolingyun on 2018/2/27.
 */

public class LockClient {
    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public static LockClient lockClient;

    public LockClient() {

    }

    public static LockClient getInstance() {
        if (lockClient == null) {
            lockClient = new LockClient();
        }
        return lockClient;
    }

    /**
     * 创建Retrofit实例
     *
     * @return
     */
    public LockService getLockClient() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(LockService.class);
    }
}
