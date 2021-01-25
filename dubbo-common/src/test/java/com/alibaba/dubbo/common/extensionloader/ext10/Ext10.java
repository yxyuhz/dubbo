package com.alibaba.dubbo.common.extensionloader.ext10;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * Created by yangxiaoyu on 2021/1/25<br>
 * All Rights Reserved(C) 2017 - 2021 SCIATTA<br><p/>
 * Ext10
 */
@SPI
public interface Ext10 {
    String echo(String sth);
}
