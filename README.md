# StartingWithServlet

Servlets are Java-based web components used for developing web applications. They can handle various types of HTTP requests and generate dynamic web content.

## FirstServletApp 
It defines a simple servlet that responds to GET requests by sending an HTML page with a welcome message. It also includes lifecycle methods and demonstrates when these methods are invoked during the servlet's lifecycle. 

# Creating a Webapplication for static resource
# SecondServletApp
|=> webapp(public area)
|=> index.html(default landing page)

request(static request) :: http://localhost:9999/SecondServletApp/

response(static response) :: copy of index.html will be sent

# Steps followed by the client to handle the request
a. browser sends the request(either for static or for dynamic)

b. server traps the request and identifiers whether the request is for
    a. static resource
    b. dynamic resoure

c. If the request is for static resource,then server only will take the copy of
that resource and sends the copy of the resource as the response to the browser.

d. If the request is for static resource and if the resource is not available then
server will generate the response as
"404-page not found".

e. If the request is for dynamic resource, then server will identify for that
request which .java code should be executed.

f. To identify for a particular resource, which java file server will use
"web.xml/annotation".

g. Once the required java code is available then server will handover the control
to "container".

i. Container will execute the java code based on its "LifeCycle-Actions".

# How to install tomcat server?
a. Go to the following link
https://tomcat.apache.org/download-90.cgi

b. click on 32-bit/64-bit Windows Service Installer (pgp, sha512)

c. Once the download starts, double click and install the set up file

d. During the installation it will ask for password supply the password as
"root123" and change the http-port-no :: 9999.

e. Once the installation is ready, just go to C:\tomcat9.0\bin\tomcat9.exe

f. Double click on that file and check the status of te server(


++++++++++++++++++++++++++++++++++
# Configuring eclipse with tomcat9.0
++++++++++++++++++++++++++++++++++

1. Click on Server tab
2. Select Apache folder(tomcat9.0)
3. Click on next
4. Click on finsih(make sure the server tab is filled with tomcat file)
5. Select tomcat9.0 file and start the server(check in conosle for the information
like server startup)

+++++++++++++++++++++++++++++++++++++++++++++
# Configuring eclipse to create WebApplications
+++++++++++++++++++++++++++++++++++++++++++++
1. Create dynamic webproject and choose runtime environment as tomcat9.0
2. choose servlet version 3.1
3. Click on next
4. Type the userdefined servlet name as per your choice[Our class will be made as
a parent for HttpServlet].
5. Click on finsh

# Response form container(executes based on life cycle actions)
a. Servlet Loading

b. Servlet Instantiation

c. Servlet Initialization(init())

d. Request Processing(doXXXX(request,response)

e. Servlet De-Instantiation(destroy())
