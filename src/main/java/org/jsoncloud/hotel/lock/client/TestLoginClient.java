package org.jsoncloud.hotel.lock.client;

import org.jsoncloud.hotel.lock.converter.JacksonConverterFactory;
import org.jsoncloud.hotel.lock.interfaces.TestLoginService;
import retrofit2.Retrofit;

/**
 * Created by zhaolingyun on 2018/2/26.
 */
public class TestLoginClient {

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public static TestLoginClient testLoginClient;

    public TestLoginClient() {

    }

    public static TestLoginClient getInstance() {
        if (testLoginClient == null) {
            testLoginClient = new TestLoginClient();
        }

        return testLoginClient;
    }

    /**
     * 创建Retrofit实例
     *
     * @return
     */
    public TestLoginService getTestLoginClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(this.baseUrl)
                .addConverterFactory(JacksonConverterFactory.create())
                .build();
        return retrofit.create(TestLoginService.class);
    }
}
