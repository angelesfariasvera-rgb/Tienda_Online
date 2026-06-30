Tienda Online API 🛒

Este es el proyecto de backend para una tienda online, desarrollado como ejercicio práctico para aprender la arquitectura de una aplicación con Spring Boot.
📂 Estructura del Proyecto

El proyecto sigue una arquitectura organizada en capas para mantener el código limpio y profesional:


src/main/java/com/example/tienda_online/
├── controller/     # Exposición de los endpoints (API)
├── dto/            # Objetos de transferencia de datos (Request/Response)
├── mapper/         # Conversión entre Entidades y DTOs
├── model/          # Definición de las entidades (Base de datos)
├── repository/     # Interfaces de persistencia (JPA)
└── service/        # Lógica de negocio

🚀 Tecnologías utilizadas

    Java 17+

    Spring Boot 3

    Spring Data JPA

    Lombok

    PostgreSQL

🛠️ Endpoints Principales
Clientes

    POST /clientes: Registrar un nuevo cliente.

    GET /clientes: Listar todos los clientes.

    GET /clientes/{id}: Buscar un cliente por ID.

Productos

    POST /productos: Crear un nuevo producto.

    GET /productos: Listar todos los productos.

    GET /productos/{id}: Buscar un producto por ID.

    DELETE /productos/{id}: Eliminar un producto.

⚙️ Cómo ejecutar el proyecto

    Asegúrate de tener instalado JDK 17 o superior.

    Configura tu base de datos PostgreSQL en application.properties.

    Ejecuta el proyecto desde tu IDE o mediante terminal:

    ./mvnw spring-boot:run
