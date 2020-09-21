package com.designPrinciples.LSP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:00
 * @since 1.0.0
 */
public class RectanglePerf implements Quadrangle {
    /**
     * 矩形高
     */
    private long height;

    /**
     * 矩形宽
     */
    private long width;


    @Override
    public long getWidth() {
        return width;
    }

    @Override
    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
