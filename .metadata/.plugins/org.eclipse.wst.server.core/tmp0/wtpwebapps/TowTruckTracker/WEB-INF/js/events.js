function Events($scope, $http){
	console.log("Angular Events");
	$http.get('http://localhost:8080/TowTruckTracker/events.json').
		success(function(data){
			$scope.events = data;
		});
}