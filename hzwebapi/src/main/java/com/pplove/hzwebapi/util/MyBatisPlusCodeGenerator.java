package com.pplove.hzwebapi.util;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

public class MyBatisPlusCodeGenerator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        //全局配置
        GlobalConfig gc = new GlobalConfig();
        //配置生成的路径
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("sdp1599181@163.com");
        //生成完不打开窗口
        gc.setOpen(false);
        //Swagger2
        gc.setSwagger2(true);
        //是否覆盖
        gc.setFileOverride(false);
        gc.setIdType(IdType.ID_WORKER);
        gc.setDateType(DateType.ONLY_DATE);
        //去Service的前缀
        gc.setServiceName("%sService");
        gc.setServiceImplName("%sServiceImpl");
        mpg.setGlobalConfig(gc);

        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/hanzhi?useSSL=false&useUnicode=true&characterEncoding=utf-8&autoReconnect=true&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        //包配置
        PackageConfig pc = new PackageConfig();
        //设置生成的模块名
//        pc.setModuleName("hzwebapi");
        pc.setParent("com.pplove.hzwebapi");
        pc.setEntity("entity");
        pc.setMapper("com/pplove/hzwebapi/mapper/xml");
        pc.setService("service");
        pc.setServiceImpl("service.serviceImpl");
        mpg.setPackageInfo(pc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        //下划线转驼峰
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //实体类使用lombok
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);

        //逻辑删除
        strategy.setLogicDeleteFieldName("deleted");
        //乐观锁
        strategy.setVersionFieldName("version");
        //自动填充设置
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT_UPDATE);
        TableFill updateTime = new TableFill("update_time", FieldFill.UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        tableFills.add(updateTime);
        strategy.setTableFillList(tableFills);

        mpg.setStrategy(strategy);

        mpg.execute();

    }
}