package org.jsoncloud.hotel.lock.entity;

/**
 * Created by zhaolingyun on 2018/3/5.
 */
public class UserInfo {

    private String userPhone;

    private String userId;

    private LockInfo lockInfo;

    public UserInfo() {
        super();
    }

    public UserInfo(String userPhone, String userId, LockInfo lockInfo) {
        this.userPhone = userPhone;
        this.userId = userId;
        this.lockInfo = lockInfo;
    }

    public LockInfo getLockInfo() {
        return lockInfo;
    }

    public void setLockInfo(LockInfo lockInfo) {
        this.lockInfo = lockInfo;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getuserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
