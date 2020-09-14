package com.designPrinciples.CRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:19
 * @since 1.0.0
 */
public class ProductDaoPerf {
    private DBConnection dbConnection;

    public void setDbConnection(DBConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }

    public static void main(String[] args) {
        ProductDaoPerf productDao = new ProductDaoPerf();
        productDao.setDbConnection(new OracleConnection());
        productDao.addProduct();
    }

}
