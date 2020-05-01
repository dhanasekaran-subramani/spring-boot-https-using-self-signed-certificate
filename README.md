# spring-boot-https-using-self-signed-certificate
spring boot application - configure https for API's using self signed certificate

Command to create self signed SSL Certificate JKS
keytool -genkey -alias https-example -storetype JKS -keyalg RSA -keysize 2048 -validity 365 -keystore https-example.jks

Secured - APi end point 

https://localhost:8443/api/employee
