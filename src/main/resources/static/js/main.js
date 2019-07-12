// NOMBRE DE LA APP QUE DECLARA QUE UTILZARA ANGULAR
var app = angular.module('usuarioApp', []);

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

app.controller('usuarioCtrl', function($scope,$http) {
	$scope.usuario = {};  // DECLARAR UN OBJETO
	$scope.usuarios = []; // DECLARAR UNA LISTA
	$http({
		url: '/usuario/lista',
		method: 'GET'
	}).then(function(response){
		console.log(response.data);
		$scope.usuarios = response.data;
	}, function(response){
		console.log(response);
	});
	
	$scope.editar = function(usuario){
		console.log(usuario);
		$scope.usuario = usuario;
	}

	
	$scope.guardar = function(usuario) {
		$http({
			url : '/usuario/usuario',
			method: "POST",
			data: usuario
		}).then(function(response){
			swal("EXITO","Se guardo correctamente", "success");
			$scope.usuario = {};
//			$scope.cambiarAccion(0);
//			$scope.consultarUsers();
		},function(response){
			console.log(response);
		});
	}

	$scope.actualizar = function(usuario) {
		$http({
			url : '/usuario/usuario',
			method: "PUT",
			data: usuario
		}).then(function(response){
			swal("EXITO","Se actualizo correctamente", "success");
			$scope.usuario = {};
//			$scope.cambiarAccion(0);
//			$scope.consultarUsers();
		},function(response){
			console.log(response);
		});
	}

	
});

