package com.designPrinciples.CRP;

/**
 * @author Administrator
 * @description
 * @create 2020/9/14 17:19
 * @since 1.0.0
 */
public class ProductDao {
    private DBConnectionDemo dbConnection;

    public void setDbConnection(DBConnectionDemo dbConnection) {
        this.dbConnection = dbConnection;
    }

    public void addProduct() {
        String conn = dbConnection.getConnection();
        System.out.println("使用" + conn + "增加产品");
    }

    public static void main(String[] args) {
        // DBconnectionDemo 目前只支持MySQL数据库连接
        // 当业务需求变更使用Oracle数据库时 虽然可以在DBConnectionDemo增加Oracle数据库支持
        // 但是违背了开闭原则,可以将DBConnectionDemo改为抽象类
        ProductDao productDao = new ProductDao();
        productDao.setDbConnection(new DBConnectionDemo());
        productDao.addProduct();
    }

}
