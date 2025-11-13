<h1 align="center">💱 Conversor de Monedas - Java</h1>

<p align="center">
  <em>Aplicación de consola que convierte monedas en tiempo real usando la API de ExchangeRate.</em>
</p>

---

## 🧠 Sobre el Proyecto

**Conversor de Monedas** es una herramienta desarrollada en **Java** que permite realizar conversiones entre distintas divisas con tasas actualizadas desde la API pública de **ExchangeRate**.  
Su propósito es practicar conceptos esenciales de desarrollo backend en Java y la integración con servicios externos.

---

## 🎯 Objetivos del Proyecto

Este proyecto busca aplicar los siguientes conocimientos:

- 🔗 Consumo de **APIs REST** usando `HttpClient`.
- 🧾 Procesamiento de **JSON** con la librería `Gson`.
- 🖥️ Creación de un **menú interactivo** en consola.
- 🧹 Implementación de **buenas prácticas** de código limpio y modular.

---

## 🚀 Funcionalidades Principales

✨ Conversión en tiempo real entre diferentes monedas.  
🛡️ Validación de datos para evitar errores de entrada.  
🏗️ Estructura modular organizada en varias clases.  
📊 Presentación clara de los resultados.  

---

## ⚙️ Tecnologías y Herramientas

| Tecnología / Librería | Descripción |
|------------------------|-------------|
| **Java 21** | Lenguaje principal del proyecto |
| **Maven** | Gestión y compilación de dependencias |
| **HttpClient** | Peticiones HTTP para consumo de APIs |
| **Gson (Google)** | Análisis y parseo de respuestas JSON |

---

## 🔧 Preparación del Entorno

Antes de ejecutar el programa, verifica que cuentas con:

1. **Java 21** instalado en tu sistema.  
2. **Maven** configurado correctamente.  
3. La siguiente dependencia agregada en tu archivo `pom.xml`:

```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

```
🔑 Configuración de la API Key

Para obtener los datos de conversión, el programa requiere una API Key válida de ExchangeRate.

Regístrate gratuitamente en 👉 ExchangeRate API

Copia tu API Key personal.

Sustituye la clave en el código dentro de la clase ServicioCambio:

private static final String CLAVE_API = "TU_API_KEY_AQUI";


## 🧭 Cómo Ejecutar el Proyecto

| Paso | Descripción | Comando |
|------|--------------|---------|
|  **1.Compilar** | Compila el proyecto con Maven | `mvn clean install` |
|  **2.Ejecutar** | Ejecuta el archivo JAR generado | `java -jar target/ConversorMonedas-1.0-SNAPSHOT.jar` |
|  **3.Usar** | Interactúa con el menú en consola y realiza tus conversiones | *Ejecuta en tu terminal* |

---

## 💻 Ejemplo de Ejecución

| Acción | Ejemplo de Salida |
|--------|-------------------|
| **Menú mostrado** | ```<br>=== Conversor de Monedas ===<br>1) USD → PEN<br>2) PEN → USD<br>3) USD → ARS<br>4) ARS → USD<br>5) USD → CLP<br>6) Salir<br>``` |
| **Entrada del usuario** | `Ingrese una opción: 1`<br>`Monto a convertir: 100` |
| **Resultado** | `Resultado: 100.00 USD → 380.50 PEN` |

---

## 📊 Estado Actual

| Estado | Descripción |
|---------|--------------|
| 🟢 **Proyecto completo y operativo** | Actualmente funcional y listo para nuevas extensiones. |

---

## 🌟 Próximas Mejoras

| Mejora | Descripción |
|---------|--------------|
| 🖼️ Interfaz gráfica | Implementar versión visual con **Swing** o **JavaFX** |
| 💾 Historial | Guardar las conversiones realizadas |
| 🌍 Más monedas | Añadir compatibilidad con más pares de cambio |
| 🧠 Multilenguaje | Soporte para **Español / Inglés** |

---
