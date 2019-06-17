package com.aibank.pattern.bridge;

/**
 * @Author: sulei
 * @Description:
 * @Date: Created in 15:36 2019/6/14
 */
public class BridgeTest {

    public static void main(String[] args) {
        Bridge bridge = new MyBridge();
        //就是进一步的面向抽象，直接到最外层调用才走到具体来，否则一直是抽象

        //算法的存放其实是在任何地方都可以的，放在结构里面也可以的，算法就是行为，设计模式更像框架结构，算法在设计模式中操作数据结构，
        Sourceable source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        Sourceable source2 = new SourceSub2();
        bridge.setSource(source2);
        bridge.method();
    }
}
