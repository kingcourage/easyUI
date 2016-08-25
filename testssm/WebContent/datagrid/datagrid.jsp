<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.5/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.5/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/js/jquery-easyui-1.5/demo/demo.css">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.5/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.5/plugins/jquery.datagrid.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-easyui-1.5/easyloader.js"></script>


<title>Insert title here</title>
<script type="text/javascript">
/* 	$('#tt').edatagrid({
		url: '${pageContext.request.contextPath }/user/getAllUsers',
		saveUrl: '${pageContext.request.contextPath }/user/addUser',
		updateUrl: '${pageContext.request.contextPath }/user/updateUser',
		destroyUrl: '${pageContext.request.contextPath }/user/deleteUser'
	});
	 */


</script>
</head>
<body>

<table id="tt" style="width:600px;height:200px"
		title="Editable DataGrid"
		url="${pageContext.request.contextPath }/user/getAllUser"
		singleSelect="true" >
	<thead>
		<tr>
			<th field="name" width="100" editor="{type:'validatebox',options:{required:true}}">Item ID</th>
			<th field="sex" width="100" editor="text">Product ID</th>
			<th field="age" width="100" align="right" editor="{type:'numberbox',options:{precision:1}}">List Price</th>
			<th field="email" width="100" align="right" editor="numberbox">Unit Cost</th>
			<th field="address" width="150" editor="text">Attribute</th>
		</tr>
	</thead>
</table>


</body>
</html>