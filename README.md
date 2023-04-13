# tieto-java-test

I want to start this off by saying that this project was done in a very bad time crunch so I have developed only the most basic functionality. 

Technologies: 

Spring boot - I used spring boot as I am quite familiar with it and have experience in building web apps with it. Most of this experience, however, is in the forms of back-end developement and building REST APIs. 

Thymeleaf - I used thymeleaf as a front-end technology because that, in my opinion, is the most widely used technology for spring boot web projects. 

Lombok - I used this to reduce boilerplate code in my project. (annotations like @Data above a model class)

PostgreSQL - I used postgreSQL as I already had everything installed and ready to go and I am quite familiar with the pgadmin tool. 

Spring security - I used this to add user authentication as it provides the most often used functionality out of the box. 


************************************START UP PROCEDURE*********************************************************

1. Install postgreSQL and create a database
2. in applicatin.properties file of the project, put the name of the database in the source url. 
3. Run the project. It should automatically create Users and Books table
4. To create a user, you should do it directly in the database. In roles you should put either "ROLE_ADMIN" or "ROLE_USER"
5. You can log in by going to "localhost:8080/login"
6. Only admins can add a new book by pressing "add new" button on the index page. 


*******************************DRAW BACKS**********************************************************************

1. Not enough time to nicely implement everything
2. No front end validation for adding a book
3. Next page button is able to be pressed also after there aren't anymore records to show
4. No "previous page" button.
5. No front-end design

