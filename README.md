项目简介与架构


组件及其版本
操作系统	     Ubuntu 24.04
Docker	     官方 apt 仓库安装	
MySQL	     5.7
Redis      	 5.0.7
JDK	         8 
Maven   	 3.9.12


目录结构
/data
├── mysql
│   ├── data
│   ├── conf
│   └── logs
└── redis
    ├── data
    └── conf

部署方式

初始化脚本(自动化)