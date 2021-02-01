package com.wwp.web;

import com.wwp.web.proxy.JiaShi;
import com.wwp.web.proxy.WangPo;

public class ProxyDemo {
    public static void main(String[] args) {
        WangPo wangPo = new WangPo();
        wangPo.pomeiyan();
        wangPo.palyWithMan();

        JiaShi jiaShi = new JiaShi();
        WangPo wangPo1 = new WangPo(jiaShi);
        wangPo1.pomeiyan();
        wangPo1.palyWithMan();
    }
}
