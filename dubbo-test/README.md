# dubbo-test
#http://localhost:8081/consumer/call?interfaceName=com.test.service.HelloService&method=sayHello
http调用dubbo接口
在没有service-api的情况下。


{

    "interfaceName":"com.test.service.HelloService",
     "method":"sayHelloStr",
    "param":["name"],
      "version":"1.0.0",
      "address":"zookeeper://127.0.0.1:2181"
}


{

    "interfaceName":"com.test.service.HelloService",
     "method":"sayHello",
      "version":"1.0.0",
      "address":"zookeeper://127.0.0.1:2181"
}