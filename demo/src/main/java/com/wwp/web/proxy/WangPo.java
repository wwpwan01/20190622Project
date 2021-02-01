package com.wwp.web.proxy;

public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    public WangPo() {
        this.kindWomen = new JinLian();
    }

    @Override
    public void pomeiyan() {
        System.out.println("王婆给别人了");
        kindWomen.pomeiyan();
    }

    @Override
    public void palyWithMan() {
        System.out.println("王婆给别人介绍了men");
        kindWomen.palyWithMan();
    }
}
