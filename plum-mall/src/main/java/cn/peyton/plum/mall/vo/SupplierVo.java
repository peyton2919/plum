package cn.peyton.plum.mall.vo;

import cn.peyton.plum.core.base.BaseUser;
import cn.peyton.plum.core.inf.IUser;
import cn.peyton.plum.mall.pojo.Supplier;

/**
 * <h3></h3>
 * <pre>
 * @email: <a href="mailto:fz2919@tom.com">fz2919@tom.com</a>
 * @project name: plum
 * @class name: cn.peyton.plum.mall.vo.SupplierVo.java
 * @create date: 2022-04-27 18:25
 * @author: <a href="http://www.peyton.cn">peyton</a>
 * @version: 1.0.0
 * </pre>
 */
public final class SupplierVo extends BaseUser<Long, Supplier> {

    private Supplier supplier=null;

    public SupplierVo() {
        if (null == supplier) supplier = new Supplier();
    }

    @Override
    protected String abstractUserType() {
        return "supplier";
    }

    @Override
    protected Integer abstractUserTypeValue() {
        return IUser.SUPPLIER_TYPE_NUM;
    }

    @Override
    protected String abstractUserName() {
        return supplier.getName();
    }

    @Override
    protected Long abstractPrimaryKey() {
        return supplier.getId();
    }

    @Override
    protected Supplier abstractObject() {
        return supplier;
    }
}
