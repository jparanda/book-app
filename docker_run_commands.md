# Run postgres container command
docker run -d \
--name postgres \
-e POSTGRES_PASSWORD=12345 \
-e POSTGRES_USER=admin \
-e POSTGRES_DB=book-db \
-p 5432:5432 \
--network pgnetwork \
postgres:latest

# Run pgadmin container command
docker run -d \
--name pgadmin \
-e PGADMIN_DEFAULT_EMAIL=juan.aranda.galvis@gmail.com \
-e PGADMIN_DEFAULT_PASSWORD=12345 \
-e PGADMIN_LISTEN_PORT=92 \
-p 9292:92 \
--network pgnetwork \
dpage/pgadmin4:latest

# Run book app container
docker run -d \
--name book-app \
-p 8083:8083 \
--network pgnetwork \
book-app:latest

# Docker command to create images
docker build --no-cache -t book-app .

docker build -t book-app .

#Run container with ports

docke run -p6000:6379 -d redis:tag

#Run container with name

docker run -d -p6004:6379 --name redis_latest redis:latest

#Docker debuging

docker logs container_name

docker exec -ti container_name /bin/bash/

#Stop all containers

docker stop $(docker ps -a -q)

# Delete all containers
docker rm $(docker ps -a -q)

# Delete all images

docker rmi $(docker images -q)



