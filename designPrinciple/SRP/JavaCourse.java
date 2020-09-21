package com.designPrinciples.SRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 14:20
 * @since 1.0.0
 */
public class JavaCourse implements ICourseInfo, ICourseManager {
    /**
     * 用户名称
     */
    private String userName;

    /**
     * 用户住址
     */
    private String address;

    @Override
    public String getCourseName() {
        return "JavaCourse";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {
        System.out.println("study JavaCourse");
    }

    @Override
    public void refundCourse() {
        System.out.println("refund JavaCourse");
    }

    /**
     * 修改用户信息  该方法不符合单一职责规范  因为既能修改userName 又能修改address
     *
     * @param userName
     * @param address
     */
    private void modifyUserInfo(String userName, String address) {
        userName = "Tom";
        address = "shanghai";
    }

    /**
     * 修改用户姓名
     *
     * @param userName
     */
    private void modifyUserName(String userName) {
        userName = "Tom";
    }

    /**
     * 修改用户住址
     *
     * @param address
     */
    private void modifyAddress(String address) {
        address = "shanghai";
    }

}
