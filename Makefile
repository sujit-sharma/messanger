build:
	mvn clean install && docker-composr build --no-cache
run:
	docker-compose up -d && watch "docker ps -a"

clean_run:
	docker-compose rm -f -s -v && docker-compose up -d && watch "docker ps -a"

clean:
	docker-compose rm -f -s -v
