Online Shopping Cart System
Welcome to the Online Shopping Cart System, a robust and scalable e-commerce solution leveraging cutting-edge technologies for a seamless shopping experience.

Features:
Microservices Architecture: Built on the principles of microservices to ensure modularity, scalability, and maintainability of the system. Each microservice handles a specific business domain, making the system flexible and easy to extend.

Spring Boot: Utilizing the power of Spring Boot to develop microservices, providing a lightweight, efficient, and easy-to-configure solution.

Apache Kafka: A distributed streaming platform for building real-time data pipelines and streaming applications. Kafka ensures reliable communication and event-driven architecture for seamless integration between microservices.

gRPC (Google Remote Procedure Call): A high-performance, open-source framework for building remote procedure call (RPC) APIs. gRPC facilitates communication between microservices in a language-agnostic manner, ensuring efficiency and ease of development.

Akka Actor: Implementing the actor model for concurrent and distributed systems using Akka. Akka actors provide a powerful and scalable way to manage state and handle asynchronous messages between components.

Websockets: Real-time communication is achieved through Websockets, enabling instant updates to the user interface and providing a dynamic shopping experience.

Java: The system is developed using Java, a versatile and widely adopted programming language, ensuring compatibility and ease of development.

Project Structure:
microservices/: Contains individual microservices such as User-service, Websocket-service, Session-service, Email-service, Cache-Service etc.

kafka/: Use of kafka in project is communicating with other services and stream messages,Used for login, logout, email verification and storing user Data in hazelcast

grpc/: Used grpc protobuff as a replacement for the rest api architecture

akka/: create Light Weight Thread using akka actors for multiple users multiple threads will be created

web-socket/: Websocket is full duplex communication protocol use of websocket on project is that communicating with backend and frontend constantly

Getting Started:
Clone the repository: git clone https://github.com/madan-holamb/shopping-cart.git
Feel free to contribute, report issues, or suggest improvements. Happy shopping!
