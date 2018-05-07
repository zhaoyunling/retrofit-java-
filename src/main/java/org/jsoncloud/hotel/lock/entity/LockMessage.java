package org.jsoncloud.hotel.lock.entity;

/**
 * Created by zhaolingyun on 2018/3/8.
 */
public class LockMessage {
    private String msgType;

    private String msgTitle;

    private String msgContent;

    private Msgdata msgdata;

    public String getMsgType() {
        return msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
    }

    public String getMsgTitle() {
        return msgTitle;
    }

    public void setMsgTitle(String msgTitle) {
        this.msgTitle = msgTitle;
    }

    public String getMsgContent() {
        return msgContent;
    }

    public void setMsgContent(String msgContent) {
        this.msgContent = msgContent;
    }

    public Msgdata getMsgdata() {
        return msgdata;
    }

    public void setMsgdata(Msgdata msgdata) {
        this.msgdata = msgdata;
    }
}

