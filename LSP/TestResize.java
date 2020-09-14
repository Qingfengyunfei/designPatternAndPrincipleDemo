package com.designPrinciples.LSP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 16:44
 * @since 1.0.0
 */
public class TestResize {
    public static void main(String[] args) {
        //使用矩形作为入参执行后 width:20 ,height:21 符合条件
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(20);
        rectangle.setHeight(10);
        resize(rectangle);
        //使用正方形作为入参执行后 死循环 违背了里氏替换原则
//        Square square = new Square();
//        square.setLength(10);
//        resize(square);
        //使用优化后矩形作为入参执行后 width:20 ,height:21 符合条件
        RectanglePerf rectanglePerf = new RectanglePerf();
        rectanglePerf.setWidth(20);
        rectanglePerf.setHeight(10);
        resize(rectanglePerf);
        // 使用优化后正方形作为入参执行后 编译报错
        // 因为resize方法中使用的 setHeight方法 SquarePerf类中没有 无法设置resize入参为SquarePerf
        // 解决了约束泛滥防止Square调用resize方法后死循环 后续在设计模式中会继续优化该问题
//        SquarePerf squarePerf = new SquarePerf();
//        squarePerf.setLength(10);
//        resize(squarePerf);
    }

    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
        }
        System.out.println("resize 方法结束" + "nwidth:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
    }

    public static void resize(RectanglePerf rectangle) {
        while (rectangle.getWidth() >= rectangle.getHeight()) {
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
        }
        System.out.println("resize 方法结束" + "nwidth:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
    }

}
