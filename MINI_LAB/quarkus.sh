#!/bin/sh


cd ./Dockerfiles/quarkus
docker build -t docker.io/eat . > outputQuarkus.txt

sudo docker stop $(sudo docker ps -a -q)
sudo docker rm $(sudo docker ps -a -q)
sudo docker image rm docker.io/eat -f


