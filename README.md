项目简介与架构


组件及其版本
操作系统	     Ubuntu 24.04
Docker	     官方 apt 仓库安装	
MySQL	     5.7
Redis      	 5.0.7
JDK	         8 
Maven   	 3.9.12
Node        10.16.3


目录结构
/data
├── mysql
│   ├── data
│   ├── conf
│   └── logs
└── redis
    ├── data
    └── conf

Maven
common中部分依赖声明为了optional，避免公共模块过于臃肿。
注意：如果需要用到common模块中的工具类，需要手动在pom.xml显式引入对应依赖。


部署方式

初始化脚本(自动化)