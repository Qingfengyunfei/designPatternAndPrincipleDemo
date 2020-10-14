package com.designPatternAndPrinciple.designPattern.creationalPatterns.prototype;

/**
 * @author Administrator
 * @description 深克隆测试
 * @create 2020/10/14 10:51
 * @since 1.0.0
 */
public class DeepCloneTest {
    public static void main(String[] args) {

        // 深克隆
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        try {
            QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
            // 深克隆：false
            System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // 浅克隆
        QiTianDaSheng q = new QiTianDaSheng();
        QiTianDaSheng n = q.shallowClone(q);
        // 浅克隆：true
        System.out.println("浅克隆：" + (q.jinGuBang == n.jinGuBang));
    }
}
