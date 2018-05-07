package org.jsoncloud.hotel.lock;

import org.jsoncloud.hotel.lock.client.LockClient;
import org.jsoncloud.hotel.lock.entity.LockInfo;
import org.jsoncloud.hotel.lock.entity.UserInfo;
import org.jsoncloud.hotel.lock.interfaces.LockService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

/**
 * Created by zhaolingyun on 2018/2/26.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //String baseUrl = "http://localhost:8081/hotel/";

//        String baseUrl = "http://47.96.163.134:8080/hotel/";
//        TestLoginClient testLoginClient = new TestLoginClient();
//        testLoginClient.setBaseUrl(baseUrl);
//
//        TestLoginService testLoginService = testLoginClient.getTestLoginClient();
//        Call<Map<String,Object>> call = testLoginService.query();
//        Response<Map<String, Object>> execute = call.execute();
//        Map<String, Object> body = execute.body();
//        Set<String> keys = body.keySet();
//        for (String key:keys){
//            System.out.println(key+"--->" + body.get(key));
//        }
        String baseUrl = "http://47.96.163.134:8080/hotel/";
        LockClient lockClient = new LockClient();
        lockClient.setBaseUrl(baseUrl);

        LockService lockService = lockClient.getLockClient();

        UserInfo userInfo = new UserInfo();
//        userInfo.setUserName("user00000000014");
        userInfo.setUserPhone("15726688067");
        LockInfo lockInfo = new LockInfo("hotel10000001", "room1202", "building01");
        userInfo.setLockInfo(lockInfo);
        Call<Map<String,Object>> call = lockService.unlock(userInfo);
        Response<Map<String, Object>> execute = call.execute();
        Map<String, Object> body = execute.body();

        Set<String> keys = body.keySet();
        for (String key:keys){
            System.out.println(key+"--->" + body.get(key));
        }


//        LockClient lockClient = new LockClient();
//        lockClient.setBaseUrl(baseUrl);
//
//        LockService lockService = lockClient.getLockClient();
//        Call<Map<String,O>>

    }
}
