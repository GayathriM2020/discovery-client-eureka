# discovery-client-eureka

# Read Me First
start discover-server-eureka first before booting discover-client-eureka.
discover-client-eureka service is registered in discover-server-eureka.
http://localhost:8081/hello hit this api and verify it.
To verify if this service is registered in eureka server . check this end point
http://localhost:8761

Actuator is enabled for this project
http://localhost:8081/actuator

enabled micrometer tracing and zipkin for data visualization.
http://localhost:9411

Swagger is enabled in this project:
http://localhost:8081/swagger-ui.html


Enabled RabbitMq to receive message from test-queue
http://localhost:15672/
rabbitmq-service is sending messages to queue test-queue

The following was discovered as part of building this project:

* The original package name 'com.example.discovery-client-eureka' is invalid and this project uses 'com.example.discovery_client_eureka' instead.
