# exchange-rate-REST
Restful Spring boot application 

Webservice for exchanging/converting money from one currency to another, under the hood consumes the service provided by https://app.exchangerate-api.com/ that provides 1500 requests for one month for free.

## Technologies
- Springboot
- Java 11
- Others: spring-boot-starter-validation, 

## Endpoint
- exchangerate/pair/
## Parameters: 
Origin currency, Target Currency, and amount. 

## Example
http://localhost:8080/exchangerate/pair/USD/COP/1000
Response:
{"currency":"COP","amount":3806.9636}
