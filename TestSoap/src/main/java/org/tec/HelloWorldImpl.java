
package org.tec;

import javax.jws.WebService;

@WebService(endpointInterface = "org.tec.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

