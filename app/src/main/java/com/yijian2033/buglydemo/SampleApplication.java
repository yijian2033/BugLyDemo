package com.yijian2033.buglydemo;

import com.tencent.bugly.Bugly;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Create by yijian2033 on 2018/9/6
 */
public class SampleApplication extends TinkerApplication {

    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.yijian2033.buglydemo.SampleApplicationLike"
                , "com.tencent.tinker.loader.TinkerLoader", false);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Bugly.setIsDevelopmentDevice(getApplicationContext(), true);
    }
}
