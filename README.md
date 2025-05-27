# 💱 Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en **Java** que permite a los usuarios convertir entre diferentes divisas, incluyendo **Dólar estadounidense (USD)**, **Peso Argentino (ARS)**, **Real Brasileño (BRL)** y **Peso Colombiano (COP)**.

## ✨ Características

- Conversión bidireccional entre las siguientes monedas:
  - Dólar <-> Peso Argentino
  - Dólar <-> Real Brasileño
  - Dólar <-> Peso Colombiano
- Interfaz de línea de comandos fácil de usar.
- Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real.
- Manejo de errores para entradas inválidas.

## ✅ Requisitos

- Java JDK 11 o superior.
- Conexión a Internet (para obtener tasas de cambio en tiempo real).

### 📦 Dependencias

- [`Gson`](https://github.com/google/gson) (para el parsing de JSON)

## ▶️ Cómo usar

1. Compilar el proyecto con tu IDE favorito o desde la terminal:

   ```bash
   javac *.java
Ejecutar el programa:

bash
Copiar
Editar
java Main
Seguí las instrucciones en pantalla para:

Seleccionar el tipo de conversión.

Ingresar el monto que deseás convertir.

Visualizar el resultado de la conversión.

El programa te preguntará si deseás continuar. Podés realizar múltiples conversiones o salir del programa.

🗂️ Estructura del proyecto
Main.java: Contiene el menú principal y la lógica de interacción con el usuario.

ConversorMoneda.java: Maneja la lógica de conversión y las llamadas a la API.

CambioMoneda.java: Clase record que modela los datos de la conversión (respuesta de la API).

Menu.java: Opciones del menú para el usuario.

📌 Notas
Este proyecto utiliza la API gratuita de ExchangeRate-API. Asegurate de revisar los términos de uso y las limitaciones de la API.

La clave API está incluida directamente en el código por simplicidad. En un entorno de producción se recomienda manejarla de forma segura, por ejemplo mediante variables de entorno.

Menu.java: Opciones del menú para el usuario.

📌 Notas
Este proyecto utiliza la API gratuita de ExchangeRate-API. Asegurate de revisar los términos de uso y las limitaciones de la API.

La clave API está incluida directamente en el código por simplicidad. En un entorno de producción se recomienda manejarla de forma segura, por ejemplo mediante variables de entorno.
