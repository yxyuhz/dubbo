package com.alibaba.dubbo.common.extensionloader.ext10.impl;

import com.alibaba.dubbo.common.extensionloader.ext10.Ext10;

/**
 * Created by yangxiaoyu on 2021/1/25<br>
 * All Rights Reserved(C) 2017 - 2021 SCIATTA<br><p/>
 * Ext10Impl
 */
public class Ext10Impl implements Ext10 {
    @Override
    public String echo(String sth) {
        return sth;
    }
}
