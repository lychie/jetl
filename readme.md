# JETL ( Java Extend Tag Library ) #

----------

## Import the taglib into your jsp file ##

```html
<%@ taglib prefix="e" uri="http://lychie.github.io/tags/jetl" %>
```

----------

* &lt;e:pagination&gt;

```html
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
```