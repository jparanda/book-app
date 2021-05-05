# **Book App**

This is a little project to show how we can start working with Docker stuff, Dockerfile, Docker compose.

**Book app architecture**

This application has a simple architecture, you can see it in the following diagram:

_Book System Abstract view_
![abstract view](https://github.com/jparanda/code-examples/blob/main/images/BookSystem_abstractView-2.png?raw=true)

In the following diagram you can see the deployment view architecture

![deployment view](https://github.com/jparanda/code-examples/blob/main/images/book_system_deploy_view.png?raw=true)

You can follow these instructions in order to use this project :
* The docker compose file named **_book-app.yml_** in order to build the **book-app** image and also download the 
both images postgres and pgadmin from Docker hub and then, run all the containers needed.

* The file book.sql has sql sentences to create the **book** table, **sequence** and inserts to create data into postgres.
* The file **docker_run_commands.md** has the Docker run commands to create the containers singly. For this approach 
  you need to create a Docker network, the command is **docker network create network_name**. Also this file has other
  useful commands.

Feel free to fork this project to play with it !!
