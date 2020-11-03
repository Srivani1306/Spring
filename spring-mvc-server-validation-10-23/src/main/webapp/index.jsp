<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<style>
  .error{color:red}
</style>

<script >
   function valodateLogin(){
   if(document.forms[0].username.value == ""){
   alert("please enter Username");
    return false;
   }
   
   if(document.forms[0].password.value == ""){
   alert("please enter Password");
    return false;
   }
     document.forms[0].submit();
   }
</script>

</head>
<body>
   
    <form:form action="login" method="post" modelAttribute="login">
     <h1>Login Screen</h1>
     Username: <input type="text" name="username">
     <form:errors path="username" cssClass="error"/></br>
     Password: <input type="text" name="password">
     <form:errors path="password" cssClass="error"/></br>
    <input type="submit" value="Login">
    </form:form>
</body>
</html>