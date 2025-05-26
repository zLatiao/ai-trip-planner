# ai-trip-planner

使用Spring AI 实现的旅游行程规划。AI平台对接的是阿里云百炼，有免费TOKEN。

## 运行

1. 先去阿里云百炼注册账号，弄个API KEY。https://bailian.console.aliyun.com/
2. application.yaml中的DASHSCOPE_API_KEY替换成阿里云百炼平台的API KEY。或者在环境变量中设置DASHSCOPE_API_KEY。
3. 运行项目
4. 前往url: http://localhost:9900/trip-planner.html


## TODO

1. 接入高德地图MCP，根据事实天气和路线来规划行程。
2. 使用SSE一个地点一个地点生成给前端。