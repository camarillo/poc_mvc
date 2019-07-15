app.service('usuarioService', function($q, factory){
	const self = this;
	const path = 'usuario';
	
	self.get = () => {
		return $q((resolve, reject) => {
			factory.get(path+'/lista').then(data => {
				resolve(data);
			}, error => {
				reject(error);
			});
		});
	};
	
	self.post = (usuario) => {
		return $q((resolve, reject) => {
			factory.post(path+'/usuario',usuario).then(data => {
				resolve(data);
			}, error => {
				reject(error);
			});
		});
	};
	
	self.put = usuario => {
		return $q((resolve, reject) => {
			factory.put(path+'/usuario', usuario).then(data => {
				resolve(data);
			}, error => {
				reject(error);
			});
		});
	};
	
});
