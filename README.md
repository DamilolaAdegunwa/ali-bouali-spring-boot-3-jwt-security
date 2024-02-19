# Spring Boot 3.0 Security with JWT Implementation
This project demonstrates the implementation of security using Spring Boot 3.0 and JSON Web Tokens (JWT). It includes the following features:

## Features
* User registration and login with JWT authentication
* Password encryption using BCrypt
* Role-based authorization with Spring Security
* Customized access denied handling
* Logout mechanism
* Refresh token

## Technologies
* Spring Boot 3.0
* Spring Security
* JSON Web Tokens (JWT)
* BCrypt
* Maven
 
## Getting Started
To get started with this project, you will need to have the following installed on your local machine:

* JDK 17+
* Maven 3+


To build and run the project, follow these steps:

* Clone the repository: `git clone https://github.com/ali-bouali/spring-boot-3-jwt-security.git`
* Navigate to the project directory: cd spring-boot-security-jwt
* Add database "jwt_security" to postgres 
* Build the project: mvn clean install
* Run the project: mvn spring-boot:run 

-> The application will be available at http://localhost:8080.

## The tutorial link
https://www.youtube.com/watch?v=KxqlJblhzfI&ab_channel=Amigoscode

## summary of what the end product would look like

The Grand Story: Building an All-Encompassing Online Bookstore
Welcome to "Bibliophile Haven," the online bookstore destined to become your learning playground for advanced Java and Spring Boot! Get ready to explore a world of books, users, transactions, and cutting-edge technologies.

People and Privileges:

Customers: Browse, search, filter, wishlist, buy books, write reviews, join book clubs, participate in events.
Staff: Manage inventory, process orders, handle payments, create marketing campaigns, update website content.
Admins: Oversee all operations, manage users, configure roles and permissions, analyze data, make strategic decisions.
Entities (Tables):

Books: Title, author, ISBN, publisher, description, categories, price, stock, status (available, in cart, ordered), reviews, ratings.
Branches: Location, address, contact information, inventory levels, opening hours.
Categories: Genres, subgenres, tags for deeper organization.
Users: Customer/Staff/Admin details, email, password, roles, profile picture, address (optional for customers).
Roles: Permissions and access levels for different user types.
Orders: Items, quantities, shipping address, payment details, order status (placed, processing, shipped, delivered).
Payments: Payment method (credit card, wallet, voucher), transaction ID, amount, timestamp.
Wallet/Subscription: Balance, recharge history, subscription levels (premium features, discounts).
Vouchers/Coupons: Code, discount percentage, expiration date, usage limits.
Events: Book signings, author talks, workshops, dates, locations, registration fee.
Book Clubs: Discussion groups, moderated forums, reading challenges, membership requirements.
Book Projects: Staff-managed collaborations, curated lists, marketing campaigns.
Modules:

Payment: Secure transactions, integrate various payment gateways, handle refunds.
Admin: User management, inventory control, order fulfillment, analytics dashboard.
Wallet/Subscription: Implement various payment methods, subscriptions, voucher management.
Activities: Events, book clubs, forums, gamification elements for user engagement.
Servers:

Fileserver: Store book covers, PDFs, downloadable content.
Cache Server: Improve performance by caching frequently accessed data.
Microservices: Consider breaking down functionalities into independent, scalable services (e.g., search, recommendation engine, payment processing).
Microservices and Frameworks:

Spring Cloud: Enables microservice architecture with configuration management, service discovery, and API gateway.
Docker: Containerize microservices for deployment and scaling.
Kafka/RabbitMQ: Implement message queues for asynchronous communication between services.
Elasticsearch/Solr: Build a powerful search engine for books and content.
Netflix OSS (Hystrix, Zuul): Enhance resilience and fault tolerance in a microservices architecture.
Remember: This is just a foundational sketch. As you delve deeper, explore advanced topics like:

Security: Implement robust authentication, authorization, and data encryption.
Scalability: Choose technologies and architectures that can handle high traffic and data volume.
Performance: Optimize queries, caching, and server infrastructure.
AI/ML: Integrate recommendations, chatbots, and personalized experiences.

Learning Journey:
This project is your gateway to mastering advanced Java and Spring Boot. Embrace the challenges, learn from every step, and build a bookstore that not only fulfills user needs but also showcases your technical prowess.

Bonus: You can further expand the story by considering additional features like social media integration, author interviews, loyalty programs, and more!

Have fun building your "Bibliophile Haven"!

-------------
authorization
-------------
bearer eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBtYWlsLmNvbSIsImlhdCI6MTcwODI5NDMyNywiZXhwIjoxNzA4MzgwNzI3fQ.GOpKdkIFccZx_hK1RpT3xACcKMTpe8apIjy4253l3dA