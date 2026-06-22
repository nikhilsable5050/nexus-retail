# Nexus Retail

Enterprise-style E-Commerce Platform built with Spring Boot, Spring Security, JWT Authentication, PostgreSQL, and React.

Nexus Retail simulates a real-world online shopping system where users can browse products, manage carts, place orders, and securely interact with protected resources through a role-based authentication system.

---

## Highlights

* Secure JWT Authentication & Authorization
* Role-Based Access Control (Admin, Seller, User)
* Product & Category Management
* Shopping Cart Workflow
* Address Management
* Order Processing & Payment Handling
* RESTful API Architecture
* PostgreSQL Persistence Layer
* DTO-Based API Design
* Global Exception Handling
* Layered Architecture (Controller → Service → Repository)

---

## System Architecture


```text
Client Applications
        │
        ▼
Spring Security + JWT
        │
        ▼
REST Controllers
        │
        ▼
Business Services
        │
        ▼
JPA / Hibernate
        │
        ▼
PostgreSQL Database
```


---

## Core Modules

### Authentication & Security

* User Registration & Login
* JWT Token Generation & Validation
* Protected API Endpoints
* Role-Based Authorization

### Product Management

* Create, Update, Delete Products
* Product Image Handling
* Product Search & Filtering
* Category-Based Product Retrieval

### Shopping Cart

* Add Products to Cart
* Update Product Quantity
* Remove Products from Cart
* Retrieve User Cart

### Order Management

* Create Orders
* Payment Processing Integration
* Order Tracking Workflow

### Address Management

* Create & Manage User Addresses
* Address Retrieval & Updates

---

## Technology Stack

| Layer       | Technology           |
| ----------- | -------------------- |
| Backend     | Java, Spring Boot    |
| Security    | Spring Security, JWT |
| Database    | PostgreSQL           |
| ORM         | JPA, Hibernate       |
| Build Tool  | Maven                |
| API Testing | Postman              |
| Frontend    | React, Axios         |

---

## API Testing

All endpoints have been tested using Postman.

The repository includes:

* Postman Collection
* Authentication API Screenshots
* Product Management Screenshots
* Cart Workflow Screenshots
* Order Processing Screenshots

---

## Project Structure

```text
nexus-retail
│
├── nexus-api
│   └── src/main/java/com/nexus/retail
│       ├── config
│       ├── controller
│       ├── exceptions
│       ├── model
│       ├── payload
│       ├── repositories
│       ├── security
│       │   ├── jwt
│       │   ├── request
│       │   ├── response
│       │   └── services
│       ├── service
│       ├── util
│       ├── WebSecurityConfig
│       └── NexusApiApplication
│
├── nexus-web
│
├── docs
│   ├── postman
│   │   └── Nexus.postman_collection.json
│   │
│   └── screenshots
│       ├── 01-login-jwt.png
│       ├── 02-create-category.png
│       ├── 03-add-product.png
│       ├── 04-get-products.png
│       ├── 05-add-to-cart.png
│       ├── 06-user-cart.png
│       ├── 07-add-address.png
│       └── 08-place-order.png
│
└── README.md
```


---

## Key Achievements

* Designed and implemented a complete e-commerce backend from scratch.
* Built secure REST APIs using JWT authentication.
* Implemented modular layered architecture for maintainability and scalability.
* Integrated PostgreSQL with Spring Data JPA for persistent data management.
* Developed and tested 25+ API endpoints covering authentication, products, categories, carts, addresses, and orders.

---

### Author

**Nikhil Sable**
