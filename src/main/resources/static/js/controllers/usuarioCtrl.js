app.controller('usuarioCtrl', function($scope, usuarioService) {
	$scope.usuario = {};  // DECLARAR UN OBJETO
	$scope.usuarios = []; // DECLARAR UNA LISTA
	
	
	$scope.editar = function(usuario){
		console.log(usuario);
		$scope.usuario = usuario;
	}

	$scope.get = () => {
		usuarioService.get().then(data => {
			$scope.usuarios = data;
		}, error => {
			console.log(error);
			
		});
	};
	
	$scope.guardar = function(usuario) {
		
		usuarioService.post(usuario).then(data => {
			swal("EXITO","Se guardo correctamente", "success");
			$scope.usuario = {};
			$scope.get();
//			$scope.cambiarAccion(0);
//			$scope.consultarUsers();
		}, error => {
			console.log(error);
			
		});
	}

	$scope.actualizar = function(usuario) {
		
		usuarioService.put(usuario).then(data => {
			swal("EXITO","Se actualizo correctamente", "success");
			$scope.usuario = {};
			$scope.get();
//			$scope.cambiarAccion(0);
//			$scope.consultarUsers();
		}, error => {
			console.log(error);
		});
	}
	
	const initController = () => {
		$scope.get();	
	};
	
	angular.element(document).ready(function (){
		initController();
	});
});