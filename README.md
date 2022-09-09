# FromZerotoExpert

Spring Boot Web 服务

## 笔记
### 修改端口号
Spring Boot 默认的端口号是 8080，因此打开的 URL 是 `http://localhost:8080/` 而不是 `http://localhost/`

解决办法： 在 `src/main/resources/application.properties` 中设置 `server.port=80`

