package com.edu.ls.web;

import com.edu.ls.pojo.Mo;

import com.edu.ls.service.MoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    MoService moService;

    @GetMapping("tiemo")//点击搜索框下面商品快捷保护贴膜链接，跳转值商品展示界面
    //展示保护贴膜所有商品16张，点击更多可以查看剩余的商品图片
    //Mo表示膜实体类
    public String tiemo(HttpSession session, Mo mo){
        //携带保护贴膜的集合，通过域传送到product_list页面，进行展示
        //全部的保护贴膜是从数据库获取
        //需要在service层创建获取保护贴膜对象集合的方法，在web层直接调用
        //返回保护贴膜展示界面
        ArrayList<Mo> list = moService.getAllMo();
        //将包含所有膜的list集合放入session域
        session.setAttribute("list",list);
        //跳转到产品系列页面并展示
        return "product_list";
    }
}
