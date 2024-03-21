HotelRatingSystem

🏨 Project Description:

The HotelRatingSystem is a microservices-based system consisting of three main microservices:

UserService: Manages user-related operations using MySQL.
HotelService: Provides hotel information and details using PostgreSQL.
RatingService: Handles rating-related functionalities for hotels using MongoDB.
Additionally, the system utilizes an API Gateway and a Config Server to streamline communication and manage common configurations across microservices.

Microservices Overview:
1. UserService:
Manages user registration, authentication, and profile operations.
Communicates with HotelService to retrieve hotel data.
Communicates with RatingService to obtain hotel ratings.
2. HotelService:
Handles hotel-related functionalities such as adding new hotels, updating details, and fetching hotel information.
Interacts with the database to store and retrieve hotel data.
3. RatingService:
Manages hotel ratings provided by users.
Stores and retrieves rating data from the database.

🌐 API Gateway:
The API Gateway acts as a single entry point for client applications to access the microservices within the HotelRatingSystem. It provides routing, load balancing, security, and other cross-cutting concerns.

⚙️ Config Server:
The Config Server centralizes configuration management for all microservices in the system. It allows dynamic configuration updates without requiring microservices to be restarted.

Technologies Used:
Spring Boot: For building microservices.
Spring Cloud Netflix (Eureka): For service discovery and registration.
Spring Cloud Gateway: For API gateway functionality.
Spring Cloud Config: For centralized configuration management.
MySQL/PostgreSQL: For data storage (can be any preferred relational database).
RESTful APIs: For communication between microservices.
Swagger/OpenAPI: For API documentation.
Setup Instructions:
Clone Repository:

bash
Copy code
git clone https://github.com/krupaliChotaliya/HotelRatingSystem
Setup Config Server:

Configure the Config Server to fetch configurations from your preferred source (e.g., Git repository).
Start Eureka Server:

Run the Eureka server to enable service registration and discovery.
Start Microservices:

Start UserService, HotelService, and RatingService microservices.
Start API Gateway:

Run the API Gateway to manage incoming requests and route them to the appropriate microservices.
Testing APIs:

Use tools like Postman or Swagger UI to test the exposed APIs documented in each microservice.
Additional Notes:
Ensure proper network configuration between microservices and the API Gateway.
Implement security mechanisms (e.g., JWT, OAuth) as per project requirements.
Configure logging, monitoring, and error handling for production readiness.
Contributors:
Add contributors' names and roles here.
License:
The project is licensed under MIT License.

Feel free to modify this README according to your specific project structure, technologies, and additional features implemented within the HotelRatingSystem.
