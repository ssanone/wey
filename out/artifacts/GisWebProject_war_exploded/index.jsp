<%--
  Created by IntelliJ IDEA.
  User: ssanone
  Date: 2017/6/20
  Time: 2:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hello World</title>
  </head>
  <body>
  <form action="inputForm"  method="post">
    <div style="text-align: center">
    <p style="color: burlywood">用户信息填写：</p>
      <hr style="color: brown">
    </div>
      <div style="text-align: center">
    用户名：<input type="text" name="user_name"/><br/>
    密  码：<input type="password" name="pass_word"/><br/>
    性别：<input name="sex" type="radio" value="女" />女<input type="radio" value="男"
          name="sex" />男<br />
    <input type="submit" value="提交" />
    <input type="reset" value="重置" />
    </div>
  <%--    name：<input type="text"name="name"><br>
    sex：<input type="radio"value="男" name="sex" checked="checked">男
    <input type="radio"value="女" name="sex">女<br>
    <input type="submit" value="提交" name="submit"/><br>--%>
  </form>
  </body>
</html>
