package com.designPrinciples.LSP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 16:40
 * @since 1.0.0
 */
public class Rectangle {
    /**
     * 高
     */
    private long height;

    /**
     * 宽
     */
    private long width;

    public long getHeight() {
        return height;
    }

    public long getWidth() {
        return width;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    public void setWidth(long width) {
        this.width = width;
    }
}
