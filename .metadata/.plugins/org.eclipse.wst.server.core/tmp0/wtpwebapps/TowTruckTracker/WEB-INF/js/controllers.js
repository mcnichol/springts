var towMappingApp = angular.module('towMappingApp', []);

towMappingApp.controller('TowMapCtrl', function($scope){
	$scope.towtrucks = [
	   {
		 'id':1,
		 'name':'Nice Trucky',
		 'lat':45,
		 'lng':-450,
		 'isActive':true
	   }
	];
})