# **Sistema ASO**  

## **Descripción General**  

Este proyecto incluye el desarrollo y la evaluación de un servicio en Java, con empaquetado en archivos JAR y pruebas funcionales ejecutadas mediante Postman.  

## **Despliegue de Archivos JAR**  

La siguiente imagen muestra la implementación de los archivos JAR utilizados en la solución:  

![Despliegue de JARs](https://github.com/user-attachments/assets/26f2d610-ed87-41ba-9644-923f4647d5ea)

## **Pruebas Realizadas con Postman**  

## **URL utilizada**

```
http://localhost:7500/TechArchitecture/helloWorld/v0/simulations/1234567890
```

## **Formato del JSON de Prueba**  

El siguiente JSON fue empleado para evaluar el servicio:  

```json
{
  "details": {
    "offerType": "CARD_HOLDER",
    "limitAmount": {
      "amount": 20000,
      "currency": "EUR"
    },
    "product": {
      "id": "TDC",
      "subproduct": {
        "id": "AV"
      }
    }
  }
}


````

Se presenta un caso de prueba exitoso ejecutado en Postman:  

![Consumo con Postman](https://github.com/user-attachments/assets/a63ae74e-7f7f-4454-90cd-446e746454b5)  

Se presenta un caso de prueba fallida por offerType en minusculas ejecutado en Postman:  

![Consumo con Postman](https://github.com/user-attachments/assets/18cd202a-ecb5-4e55-85b3-43cbb48832f5)  

## **Nuip Utilizado en la Prueba como @PathParam**
El valor asignado a {nuip} durante la prueba fue 1234567890

## **Tecnologías y Herramientas Empleadas**  

1. Java 1.8  
2. Docker  
3. IntelliJ IDEA  
4. Postman  
5. Maven 3.5.3  
6. ASO  
