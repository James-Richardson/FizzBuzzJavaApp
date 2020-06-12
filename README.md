# FizzBuzzJavaApp

To build the JAR, enter <code>./mvnw clean package</code>.
This will create the JAR in the <code>target</code> directory.
To run that JAR, enter <code>java -jar target/fizz-buzz-java-app-0.0.1-SNAPSHOT.jar</code>.

Alternatively, you can run the application with Maven, by entering
<code>./mvnw spring-boot:run</code>.

Once the application is running, go to http://localhost:8080/getPage to see the output.

An example of the response JSON object is shown below.

    {
      "values": [
        {
          "number": 11,
          "fizz": false,
          "buzz": false
        },
        {
          "number": 12,
          "fizz": true,
          "buzz": false
        },
        {
          "number": 13,
          "fizz": false,
          "buzz": false
        },
        {
          "number": 14,
          "fizz": false,
          "buzz": false
        },
        {
          "number": 15,
          "fizz": true,
          "buzz": true
        }
      ]
    }

Without specifying any optional request parameters, you are shown fizz buzz values for numbers 1 to 100.

Specify the page number with an optional <code>pageNum</code> request parameter
e.g. http://localhost:8080/getPage?pageNum=100. Note that the first page is 0, and this is the default page.

Specify the number of values per page with an optional <code>pageSize</code> request parameter
e.g. http://localhost:8080/getPage?pageSize=10. The default page size is 100.