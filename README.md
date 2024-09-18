# spring-boot-rabbitMQ
This project demonstrates how to integrate RabbitMQ with a Spring Boot application. It showcases basic message publishing and consuming functionalities using RabbitMQ.

## Features

- Message Producer: Sends messages to a RabbitMQ queue.
- Message Consumer: Listens to messages from the queue.
- Spring Boot Integration: Simplifies configuration and setup.

## Prerequisites

- Java 11 or higher
- RabbitMQ (local or cloud-based)
- Maven (for dependency management)


### Configure RabbitMQ

1. **Install RabbitMQ**: Follow the [official RabbitMQ documentation](https://www.rabbitmq.com/download.html) to set up a local RabbitMQ instance.
2. **Start RabbitMQ Server**: Run the RabbitMQ server using the appropriate command for your operating system.

### Add Dependencies

In your `pom.xml`, include the following dependencies:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-amqp</artifactId>
</dependency>
