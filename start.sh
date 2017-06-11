cd eureka/
mvn clean install
java -jar target/eureka*.jar &
cd ../metadata_managment/
mvn clean install
java -jar target/metadata_managment*.jar &

