<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD CAR DETAILS</title>
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

	<h2>Add Car details here</h2>
	<form action="saveCar">
		<table>
			<tr>
				<td>Id:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Company :</td>
				<td><input type="text" name="company" /></td>
			</tr>
			<tr>
				<td>Model:</td>
				<td><input type="text" name="model" /></td>
			</tr>
			<tr>
				<td>Color:</td>
				<td><input type="text" name="colour" /></td>
			</tr>
			<tr>
				<td>Date Of Purchase:</td>
				<td><input type="Date" name="dateOfPurchase" /></td>
			</tr>

			<tr>
				<td>Price in Rs:</td>
				<td><input type="text" name="price" /></td>
			</tr>
			<tr>
				<td>Engine Capacity in CC:</td>
				<td><input type="text" name="engineCapacity" /></td>
			</tr>
			<tr>
				<td>License Plate Number:</td>
				<td><input type="text" name="licencePlateNumber" /></td>
			</tr>
			<tr>
				<td>Seating Capacity:</td>
				<td><input type="text" name="seatingCapacity" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="Save" /></td>
			</tr>
		</table>

	</form>

	${Msg}

</body>
</html>