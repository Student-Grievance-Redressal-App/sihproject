<%-- 
    Document   : viewgrievances
    Created on : 17 Jan, 2020, 12:29:54 PM
    Author     : Pravesh Ganwani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Grievances | SGRC</title>
        <link href="css/tables.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="header.jsp"/>
        <sql:setDataSource driver="com.mysql.jdbc.Driver" 
                                       url="jdbc:mysql://localhost:3306/projectdb?autoReconnect=true&useSSL=false"
                                       user="root"
                                       password="root"
                                       var="con"
                                       />
        <div class="container" id="secondary-div">
        <div class="row">
        <div class="col-xs-12">
      <div class="table-responsive">
        <table class="table table-bordered table-hover">
          <caption class="text-center">Your Grievances</caption>
          <thead>
            <tr>
              <th>Grievance ID</th>
              <th>Grievance Title</th>
              <th>Grievance Description</th>
              <th>Grievance Category</th>
              <th>Date / Time</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
        <sql:query dataSource="${con}" var="data">
            select * from grievances where student_id=? and issolved=0
            <sql:param>${user.id}</sql:param>
        </sql:query>
            <c:forEach items="${data.rows}" var="row">
              <tr>
              <td>${row.complaint_id}</td>
              <td>${row.complaint_title}</td>
              <td>${row.complaint_detail}</td>
              <td>${row.category}</td>
              <td>${row.complaint_datetime}</td>
              <td><button><a href="grievancestatus.jsp?id=${row.complaint_id}">View Status</a></button></td>
            </tr>
            </c:forEach>
            </tbody>
          <tfoot>
            <tr>
              <td colspan="6" class="text-center">Data retrieved from Complaint Database.</td>
            </tr>
          </tfoot>
        </table>
      </div>
    </div>
  </div>
</div>
    </body>
</html>
