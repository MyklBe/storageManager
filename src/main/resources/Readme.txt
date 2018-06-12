StorageManager

The purpouse of this application is to monitor amount of products in the shop and cash.

There are two kinds of events: sales and deliveries.

There are two cashes, that can sell products simultaneously.

cash cannot sell products that are not in the storage database, generates alert.

cash cannot be less than zero, generates alert.

The main goal of this task is to practice asyncronous operations with NoSQL and CQRS design pattern

tech stack:
Java
SpringBoot
MongoDB
Git
Kafka
Lombok
jUnit
DDD
CQRS