package com.alibaba.dubbo.common.extensionloader;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.alibaba.dubbo.common.extensionloader.ext10.Ext10;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by yangxiaoyu on 2021/1/25<br>
 * All Rights Reserved(C) 2017 - 2021 SCIATTA<br><p/>
 * ExtensionLoader_Extend_Test
 */
public class ExtensionLoader_Extend_Test {
    @Test
    public void testSameExtension() {
        Ext10 impl1 = ExtensionLoader.getExtensionLoader(Ext10.class).getExtension("impl1");
        assertNotNull(impl1);
        
        Ext10 impl2 = ExtensionLoader.getExtensionLoader(Ext10.class).getExtension("impl2");
        assertNotNull(impl2);
        
        // 配置相同class扩展实现，但不同的name，只有一个实例（单例），但名称不同
        assertSame(impl1, impl2);
    }
}
