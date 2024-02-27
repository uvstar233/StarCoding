# 猩编程系统

基于SpringCloud微服务+MQ+Docker搭建的在线判题系统后端，系统能够根据管理员预设的题目用例对提交的代码进行执行和评测；系统中自主实现的代码沙箱可以作为独立服务供给其他开发者使用。

## 服务划分

- 用户模块 user-service
  - 注册
  - 登录
- 题目模块 question-service
  - 创建题目
  - 删除题目
  - 修改题目
  - 搜索题目（用户）
  - 在线做题（题目详情页）
- 判题模块 judge-service
  - 提交判题（结构是否正确
  - 错误处理（内存溢出、安全性、超时
  - 代码沙箱（**自主实现**安全的代码沙箱，隔离代码执行环境
  - 开放接口（开放判题API，可以对外提供服务
- 公共模块 common
  - 全局异常处理、请求响应封装类，公用工具等
- 公共网关 gateway
  - 请求统一路由、聚合文档等
- 公共模型 model
  - 存放公共的实体类和请求、响应实体
- 对外端口 service-client
  - 统一暴露服务接口

