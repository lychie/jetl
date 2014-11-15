<%@ page pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="e" uri="http://lychie.github.io/tags/jetl" %>
<html>
  <head>
    <title>pagination</title>
    <c:set value="${pageContext.request.contextPath}" var="ctx" />
    <link href="${ctx}/styles/table.css" rel="stylesheet" type="text/css"/>
    <script src="${ctx}/js/jquery-1.11.1.min.js" type="text/javascript"></script>
  </head>
  <body>
    <table class="bordered">
      <thead>
        <tr>
          <th>编号</th>
          <th>姓名</th>
          <th>性别</th>
          <th>年龄</th>
        </tr>
      </thead>
      <c:forEach items="${p.result}" var="item">
        <tr>
          <td>${item.id}</td>
          <td>${item.name}</td>
          <td>${item.sex}</td>
          <td>${item.age}</td>
        </tr>
      </c:forEach>
    </table>
    <e:pagination 
      link="${ctx}/demo/page/_index_" 
      pageitems="${p.pageSize}" 
      currentpage="${p.pageIndex}" 
      totalamount="${p.totalCount}" />
  </body>
</html>