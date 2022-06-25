# crud-auth-demo
this is an example of authentication using firebase token in spring boot backend.

It is a simple crud that show the message "funciona con no auth" when we made a Get petition  in the "/no-auth" end point.
![image](https://user-images.githubusercontent.com/78055368/175756035-68428a95-5561-4b1c-bcfa-f5fd9c8ed078.png)

It also show the message "funciona con auth" when we made a Get petition  in the "/auth" end point and introduce the token given by firebase in the header
of the petition. if the token is no introduced or is not correct show that it is unauthorized. 
![image](https://user-images.githubusercontent.com/78055368/175756121-4c5ca861-d913-4889-ba71-559505ba1c24.png)

The security configuration of the end point were made in the file WebSecurityConfiguration, where we allow all get petition to the end point "/no-auth"
and request authentication in the  petitions to all the others end points.

the firebase credental are introduced in the file serviceaccount.json.

the project was deploy in heroku: https://crud-auth-demo.herokuapp.com and was tested using postman.

