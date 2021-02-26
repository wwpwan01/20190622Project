package com.wwp.web.common;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class WangPo {

    @Async
    public void pomeiyan() {
        System.out.println(Thread.currentThread().getName() + "王婆给别人了");
    }
    @Async
    public void palyWithMan() {
        System.out.println(Thread.currentThread().getName() + "王婆给别人介绍了men");
    }
}