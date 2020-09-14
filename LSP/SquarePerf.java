package com.designPrinciples.LSP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:02
 * @since 1.0.0
 */
public class SquarePerf implements Quadrangle {
    /**
     * 正方形边长
     */
    private long length;
    @Override
    public long getWidth() {
        return length;
    }

    @Override
    public long getHeight() {
        return length;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }
}
