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

Get Access API
```shell script
curl --location --request GET 'http://localhost:8080/auth/user/principal?access_token=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1ODg0NjA2OTgsInVzZXJfbmFtZSI6Im5hcnV0byIsImp0aSI6IjU1MmFhNWIzLWFjYjItNDIwYy1iODVmLTY0YWFjYTg2ZDI3MSIsImNsaWVudF9pZCI6Im5hcnV0by1jbGllbnQiLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXX0.rB2DvW7NnNa1ff2FBtPyarNjLskJxCN0ASn_sWbQIRI'
```

### Screen shot

Add Header Authorization

![Add Header Authorization](img/auth.png "Add Header Authorization")

Add Body Params

![Add Body Params](img/body.png "Add Body Params")

Get Access API

![Get Access API](img/access.png "Get Access API")