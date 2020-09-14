**Maven install**

mvn clean install

**Running in local**

mvn clean install -Dspring.profiles.active=local


**Running without skipping test cases**

mvn clean install -Dspring.profiles.active=local -Dmaven.test.skip=true


**Maven exports**

MAVEN_OPTS="-Dmaven.wagon.http.ssl.insecure=true -Dmaven.wagon.http.ssl.allowall=true -Dmaven.wagon.http.ssl.ignore.validity.dates=true"


**VM options**

-Djavax.net.ssl.trustStore=SG-Sub-CA.ks -Djavax.net.ssl.trustStorePassword=123456 -Dmaven.wagon.http.ssl.insecure=true
