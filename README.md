# 💱 Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en **Java** que permite a los usuarios convertir entre diferentes divisas, incluyendo Dólar estadounidense (USD), Peso Argentino (ARS), Real Brasileño (BRL) y Peso Colombiano (COP).

## ✨ Características

- Conversión bidireccional entre las siguientes monedas:
  - Dólar ↔ Peso Argentino
  - Dólar ↔ Real Brasileño
  - Dólar ↔ Peso Colombiano
- Interfaz de línea de comandos fácil de usar
- Utiliza la API de [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tasas de cambio en tiempo real
- Manejo de errores para entradas inválidas

## ✅ Requisitos

- Java JDK 11 o superior
- Conexión a Internet (para obtener tasas de cambio en tiempo real)

### 📦 Dependencias

- [Gson](https://github.com/google/gson): Para el parseo de JSON

## ▶️ Cómo usar

1. Clona o descarga este repositorio.
2. Abre el proyecto en tu IDE de preferencia o compílalo desde la línea de comandos con `javac`.
3. Ejecuta la clase principal `Main`.
4. Sigue las instrucciones en pantalla:
   - Selecciona el tipo de conversión que deseas realizar.
   - Ingresa el monto a convertir cuando se te solicite.
5. El programa mostrará el resultado de la conversión.
6. Puedes realizar múltiples conversiones o elegir salir del programa.

## 📁 Estructura del proyecto

- `Main.java`: Contiene el menú principal y la lógica de interacción con el usuario.  
- `ConversorMoneda.java`: Maneja la lógica de conversión y las llamadas a la API.  
- `CambioMoneda.java`: Clase `record` para almacenar los datos de la conversión.

## ⚠️ Notas

- Este proyecto utiliza la versión gratuita de la API de ExchangeRate-API. Revisa sus términos de uso y limitaciones.
- Por simplicidad, la clave de la API está incluida directamente en el código. En un entorno profesional, se recomienda almacenarla de forma segura (por ejemplo, en variables de entorno o archivos de configuración).

## 🧑‍💻 Autor

Desarrollado como parte de un desafío de aprendizaje en Java.

---

