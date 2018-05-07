package org.jsoncloud.hotel.lock.entity;

import java.util.List;

/**
 * Created by zhaolingyun on 2018/3/8.
 */
public class Msgdata {

    private Integer count;

    private Integer desc;

    private List<LockInfo> list;

    public Msgdata() {
        super();
    }

    public Msgdata(Integer count, Integer desc, List<LockInfo> list) {
        this.count = count;
        this.desc = desc;
        this.list = list;
    }


    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDesc() {
        return desc;
    }

    public void setDesc(Integer desc) {
        this.desc = desc;
    }


    public List<LockInfo> getList() {
        return list;
    }

    public void setList(List<LockInfo> list) {
        this.list = list;
    }
}
