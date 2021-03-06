<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Heroes</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body background="http://www.lunadecals.com/images/WD/WD-DECAL-00098.jpg">
	<jsp:useBean id="nDAO" class="co.avengers.model.HeroeDAO"
		scope="request"></jsp:useBean>
	<div class="container">
		<header>
			<div class="row">
				<div class="col-12 col-md-3">
					<img class="img-logo"
						src="data:image/jpeg;base64,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">
				</div>
			</div>
		</header>



		<table class="table mb-5 table-hover">
			<thead class='bg-light'>
				<tr class="table-info">
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Id
						Heroe</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Nombre</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Heroe</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Fecha
						Nacimiento</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Fecha
						Aparicion</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Genero</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Estado</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Descripcion</th>
					<th scope='col'
						class='border-0 text-primary text-center text-uppercase'>Arma</th>
				</tr>
			</thead>
			<tbody>
					<tr>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.id}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.nombre}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.heroe}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.fechanacimiento}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.fechaaparicion}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.genero}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.estado}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.descripcion}" /></td>
						<td class="text-center font-weight-light"><c:out
								value="${heroe.arma}" /></td>
					</tr>
			</tbody>
		</table>
		<button type="submit" class="btn btn-primary"
				onclick="location.href='../index.jsp'">Volver</button>
		<div class="form-group">
			











			<footer class="footer">

				<div class="card w-75">
					<div class="card-body">
						<h5 class="card-title">Raphael Andres Fernandez Garay</h5>
						<p class="card-text">Codigo: 1151317</p>
						<p class="card-text">Ingenieria de Sistemas</p>
						<p class="card-text">Semestre 2019-2</p>
					</div>
				</div>

			</footer>








		</div>

















		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
			integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
			integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
			crossorigin="anonymous"></script>
</body>
</html>