/**
 * Copyright (C) 2015 fuzhong
 *
 *
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.OrderBean
 * @description:TODO
 * 
 * @version:v1.0.0 
 * @author:TangKai
 * 
 * Modification History:
 * Date         Author      Version     Description
 * -----------------------------------------------------------------
 * 2015-12-8     TangKai       v1.0.0        create
 *
 *
 */
package com.fzjt.xiaoliu.read.interfaces.business.check.bean;

import java.util.List;

/**
 * @className:com.fzjt.xiaoliu.read.interfaces.business.check.bean.OrderBean
 * @description:TODO
 * @version:v1.0.0
 * @date:2015-12-8 下午3:16:07
 * @author:TangKai
 */
public class OrderBean
{
    private List<OrderInfo> info = null;

    public List<OrderInfo> getInfo()
    {
        return info;
    }

    public void setInfo(List<OrderInfo> info)
    {
        this.info = info;
    }

}
