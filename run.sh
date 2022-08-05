#!/usr/bin/env bash
set -e

#COMPOSE="docker-compose.yaml"
#
#echo "Docker compose file : $COMPOSE"
#docker-compose -f $COMPOSE up -d

echo "Stopping existing compose________________________"
docker-compose stop
echo "Stopped Successfully_____________________________"

docker-compose rm -f
echo "Starting All composed Services -------------------"
echo "###################################################"
docker-compose up
echo "Stopped All Services_______________________________"

