package com.designPrinciples.DIP;

/**
 * @author Administrator
 * @description 如果Tom类 增加一个studyAICourse方法 高层调用的时候就需要对应增加调用
 * @create 2020/9/14 11:09
 * @since 1.0.0
 */
public class Tom {
    //---------------------------原始版本--------------------------------------------------
//    public void studyJavaCourse(){
//        System.out.println("Tom is learning Java Course");
//    }
//
//    public void studyPythonCourse(){
//        System.out.println("Tom is learning Python Course");
//    }
//
//    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.studyJavaCourse();
//        tom.studyPythonCourse();
//    }

    //================================第一版修改 通过传参的方式告诉Tom类=============================================
//    public void study(ICourse course){
//        course.study();
//    }
//
//    public static void main(String[] args) {
//        Tom tom = new Tom();
//        tom.study(new JavaCourse());
//        tom.study(new PythonCourse());
//    }

    //*****************************第二版修改 通过构造器方式告诉Tom类***********************************************
//    private ICourse course;
//
//    public Tom(ICourse course){
//        this.course = course;
//    }
//
//    public void study(){
//        course.study();
//    }
//
//    public static void main(String[] args) {
//        Tom tom = new Tom(new JavaCourse());
//        tom.study();
//    }

    //#############################第三版修改 如果是全局单例Tom类 则只能通过Setter 方式注入
    private ICourse course;

    public void setCourse(ICourse course){
        this.course = course;
    }

    public void study(){
        course.study();
    }

    public static void main(String[] args) {
        Tom tom = new Tom();
        tom.setCourse(new JavaCourse());
        tom.study();
        tom.setCourse(new PythonCourse());
        tom.study();
    }
}
