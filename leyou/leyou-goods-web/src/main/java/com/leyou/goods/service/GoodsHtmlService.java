package com.leyou.goods.service;

import com.leyou.utils.ThreadUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @author LiSheng
 * @date 2019/11/10 20:46
 */
@Service
public class GoodsHtmlService {

    @Autowired
    private TemplateEngine engine;

    @Autowired
    private GoodsService goodsService;

    /**
     *  创建静态html页面
     * @param spuId
     */
    public void createHtml(Long spuId) {
        //初始化运行上下文
        Context context = new Context();
        //设置数据模型
        context.setVariables(this.goodsService.loadData(spuId));
        File file = new File("D:\\Java\\nginx-1.14.0\\html\\item\\" + spuId + ".html");
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter(file);
            this.engine.process("item", context, printWriter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
    /**
     *  删除静态html页面
     * @param id
     */
    public void deleteHtml(Long id){
        File file = new File("D:\\Java\\nginx-1.14.0\\html\\item\\" + id + ".html");
        file.deleteOnExit();
    }
    /**
     * 新建线程处理页面静态化
     * @param spuId
     */
    public void asyncExcute(Long spuId) {
        ThreadUtils.execute(()->createHtml(spuId));
        /*ThreadUtils.execute(new Runnable() {
            @Override
            public void run() {
                createHtml(spuId);
            }
        });*/
    }
}
