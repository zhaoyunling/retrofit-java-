package org.jsoncloud.hotel.lock.interfaces;

import org.jsoncloud.hotel.lock.entity.LockInfo;
import org.jsoncloud.hotel.lock.entity.UserInfo;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.Map;

/**
 * Created by zhaolingyun on 2018/2/27.
 */
public interface LockService {

    /**
     * 锁注册
     *
     * @param userInfo
     * @return
     */
    @POST("lockAction_registerLock")
    Call<Map<String, Object>> registerLock(@Body UserInfo userInfo);

    /**
     * 开锁接口
     *
     * @param userInfo
     * @return
     */
    @POST("lockAction_unlock")
    Call<Map<String, Object>> unlock(@Body UserInfo userInfo);

    /**
     * 获取锁状态
     *
     * @param userInfo
     * @return
     */

    @GET("lockAction_getStatus")
    Call<Map<String, Object>> getStatus(@Body UserInfo userInfo);

    /**
     * 授权客户开锁
     *
     * @return
     */

    @POST("lockAction_unlockAuthority")
    Call<Map<String, Object>> unlockAuthority(@Body UserInfo userInfo);

    /**
     * 取消授权开锁
     *
     * @param userInfo
     * @return
     */
    @POST("lockAction_CancelUnlockAuthority")
    Call<Map<String, Object>> CancelUnlockAuthority(@Body UserInfo userInfo);

    /**
     * 获取开锁记录
     *
     * @param lockInfo
     * @return
     */
    @GET("lockAction_getLockLog")
    Call<Map<String, Object>> getLockLog(@Body LockInfo lockInfo);

    /**
     * 获取离线智能锁列表
     *
     * @param lockInfo
     * @return
     */
    @GET("lockAction_getOfflineLock")
    Call<Map<String, Object>> getOfflineLock(@Body LockInfo lockInfo);

    /**
     * 获取低电量智能锁列表
     *
     * @param lockInfo
     * @return
     */

    @GET("lockAction_mon_getLowPowerLock")
    Call<Map<String, Object>> getLowPowerLock(@Body LockInfo lockInfo);

}
