<%-- 
    Document   : response
    Created on : Aug 29, 2017, 9:28:52 PM
    Author     : jerem
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>The area of your ${hdrMsg}</title>
    </head>
    <body>

        <p>Your ${hdrMsg} is ${area} units<sup>2</sup></p>
        <p><script>
            document.write('<a href="' + document.referrer + '"><< Back to Calculator</a>');
            </script></p>

    </body>
</html>
