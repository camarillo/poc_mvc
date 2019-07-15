// SE DEFINE UN CONTROLLER, LA LOGICA DE NEGOCIO
app.controller('ejemploCtrl', function($scope,$http) {
	$scope.name = "Hello world"
	$scope.usuario = {
			"nombre":"jorge",
			edad:24,
			"sexo":"H"
		}
	$scope.usuarios = [{
			"nombre":"jorge",
			edad:24,
			"sexo":"H"
		},
		{
			"nombre":"Rosita",
			edad:22,
			"sexo":"M"
		}]
	
});