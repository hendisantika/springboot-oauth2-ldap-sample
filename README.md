# springboot-oauth2-ldap-sample
### Things to do list:
1. Clone this repository: `git clone https://github.com/hendisantika/springboot-oauth2-ldap-sample.git`
2. Go inside folder: `cd springboot-oauth2-ldap-sample`
3. Run the application: `mvn clean spring-boot:run`
4. Open POSTMAN App or Terminal

### cURL
```shell script
curl --location --request POST 'http://localhost:8080/auth/oauth/token' \
--header 'Authorization: Basic bmFydXRvLWNsaWVudDpuYXJ1dG8tc2VjcmV0' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--data-urlencode 'username=naruto' \
--data-urlencode 'password=123' \
--data-urlencode 'grant_type=password'
```