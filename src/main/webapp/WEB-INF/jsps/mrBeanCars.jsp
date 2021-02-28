
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CAR DETAILS</title>
</head>

<style>
h1 {
	text-align: center;
}
</style>

<body>
	<h1>Mr Bean Car Store</h1>


	<form action="searchByKeyword" method="post">

		Search Car Here : <input type="text" name="keyword" /> <input
			type="submit" value="Search" />

	</form>
	<br />

	<form action="searchByPriceBetween" method="post">

		Search Car Here Minimum Price : <input type="text" name="from" />
		Maximum Price :<input type="text" name="to" /> <input type="submit"
			value="Search" />

	</form>

	<br />

	<form action="addCar">
		Click Here To Add New Car Details : <input type="submit"
			value="Add New Car">
	</form>
	<br />


	<h2>All Car Details</h2>

	<table border="1">
		<tr>
			<th>Id</th>
			<th>Company</th>
			<th>Model</th>
			<th>Color</th>
			<th>Date Of Purchase</th>
			<th>Price in Rs</th>
			<th>Engine Capacity in CC</th>
			<th>License Plate Number</th>
			<th>Seating Capacity</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${cars}" var="car">
			<tr>
				<td>${car.id}</td>
				<td>${car.company}</td>
				<td>${car.model}</td>
				<td>${car.colour}</td>
				<td>${car.dateOfPurchase}</td>
				<td>${car.price}</td>
				<td>${car.engineCapacity}</td>
				<td>${car.licencePlateNumber}</td>
				<td>${car.seatingCapacity}</td>
				<td><a href="deleteCar?id=${car.id}">Delete</a></td>
				<td><a href="updateCar?id=${car.id}">Update</a></td>
			</tr>
		</c:forEach>

	</table>
	<br /> ${UpdateMsg} ${msg }

</body>
</html>