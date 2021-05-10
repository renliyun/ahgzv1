package com.ahgz;



import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan()
public class Ahgzv1Application {

    public static void main(String[] args) {

        SpringApplication.run(Ahgzv1Application.class, args);

// 代码生成器
//        GlobalConfig config =new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        config.setActiveRecord(true)//是否支持AR模式
//                .setAuthor("renlirong")//作者
//                .setOutputDir(projectPath +"/src/main/java")//生成路径
//                .setFileOverride(true)//文件覆盖
//                .setIdType(IdType.AUTO)//设置主键生成策略
//                .setServiceImplName("%sService")//设置生成的service接口的首字母是否为I
//                .setBaseResultMap(true)
//                .setBaseColumnList(true)
//                .setSwagger2(true);
//
//
//        DataSourceConfig dsc =new DataSourceConfig();
//        dsc.setDbType(DbType.MYSQL);
//        dsc.setUrl("jdbc:mysql://localhost:3306/ahgz");
//        dsc.setSchemaName("public");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("821827aa");
//
//
//        String[] demo =new String[9];
//        demo[0] ="category";
//        demo[1] ="borrow";
//        demo[2] ="address";
//        demo[3] ="delivery";
//        demo[4] ="in";
//        demo[5] ="non_conforming";
//        demo[6] ="out";
//        demo[7] ="storage";
//        demo[8] ="user";
//
//
//        StrategyConfig strategyConfig =new StrategyConfig();
//                strategyConfig.setCapitalMode(true)//开启大小         //写命名
//                .setColumnNaming(NamingStrategy.underline_to_camel)
//                .setNaming(NamingStrategy.underline_to_camel)//数据库表映射到实体的命名策略
//                .setTablePrefix("tb_")
//                .setInclude(demo);
//
//
//        PackageConfig pc =new PackageConfig();
//        pc.setParent("com.ahgz")
//                .setService("service")
//                .setController("controller")
//                .setEntity("entity")
//                .setXml("mapper")  //不设定会默认分级目录填写
//                .setMapper("mapper");
//
//
//        AutoGenerator ag =new AutoGenerator();
//        ag.setGlobalConfig(config);
//        ag.setDataSource(dsc)
//                .setStrategy(strategyConfig)
//                .setPackageInfo(pc); //执行
//        ag.execute();}

    }
}

