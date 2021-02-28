<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE CAR DETAILS</title>
</head>
<style>
h1 {
	text-align: center;
}
</style>
<body>
	<h1>Mr Bean Car Store</h1>

	<form action="listOfCars" method="post">

		Click Here To View All Car Details : <input type="submit"
			value="List Of Cars" />

	</form>
	<br />

	<h2>Update Car details here</h2>
	<br /> ${Msg}
	<br />
	<form action="updatedCar">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" readonly value="${id }"></td>
			</tr>
			<tr>
				<td>Company:</td>
				<td><input type="text" name="company" value="${company }"></td>
			</tr>
			<tr>
				<td>Model:</td>
				<td><input type="text" name="model" value="${model }"></td>
			</tr>
			<tr>
				<td>Color:</td>
				<td><input type="text" name="colour" value="${colour }"></td>
			</tr>
			<tr>
				<td>Date Of Purchase:</td>
				<td><input type="Date" name="dateOfPurchase"
					value="${dateOfPurchase }"></td>
			</tr>
			<tr>
				<td>Price in Rs:</td>
				<td><input type="text" name="price" value="${price }"></td>
			</tr>
			<tr>
				<td>Engine Capacity in CC:</td>
				<td><input type="text" name="engineCapacity"
					value="${engineCapacity }"></td>
			</tr>
			<tr>
				<td>License Plate Number:</td>
				<td><input type="text" name="licencePlateNumber"
					value="${licencePlateNumber }"></td>
			</tr>
			<tr>
				<td>Seating Capacity:</td>
				<td><input type="text" name="seatingCapacity"
					value="${seatingCapacity }"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update" /></td>
			</tr>
		</table>

	</form>
	${Msg }
</body>
</html>