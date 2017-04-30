# Java EE SOAP Web Service
Example building a SOAP Web Service with Java EE 7 using JAX-WS.

## Generate JAX-WS WSDL Artifacts
Generate WSDL from server into client use [wsimport](http://docs.oracle.com/javase/7/docs/technotes/tools/share/wsimport.html) can be done with execute command below on terminal and keep remember to execute this on __client__ directory.

```
wsimport -keep -verbose http://localhost:8080/server/AccountService\?wsdl -d src/main/java

```

Don't forget to specify directory target, put the code on `src/main/java` and delete `.class` files since we just need the `.java` files.
