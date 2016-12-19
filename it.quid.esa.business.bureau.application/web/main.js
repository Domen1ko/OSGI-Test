'use strict';

(function() {

	var MODULE = angular.module('it.quid.esa.business.bureau',
			[ 'ngRoute', 'ngResource' ]);

	MODULE.config( function($routeProvider) {
		$routeProvider.when('/', { controller: mainProvider, templateUrl: '/it.quid.esa.business.bureau/main/htm/home.htm'});
		$routeProvider.when('/about', { templateUrl: '/it.quid.esa.business.bureau/main/htm/about.htm'});
		$routeProvider.when('/console', { templateUrl: '/system/console/bundles'});
		$routeProvider.otherwise('/');
	});
	
	MODULE.run( function($rootScope, $location) {
		$rootScope.alerts = [];
		$rootScope.closeAlert = function(index) {
			$rootScope.alerts.splice(index, 1);
		};
		$rootScope.page = function() {
			return $location.path();
		}
	});
	
	
	
	var mainProvider = function($scope, $http) {
		
		$scope.upper = function() {
			var name = prompt("Insert NDG:");
			if ( name ) {
				$http.get('/rest/upper/'+name).then(
						function(d) {
							$scope.alerts.push( { type: 'success', msg: d.data });
						}, function(d) {
							$scope.alerts.push( { type: 'danger', msg: 'Failed with ['+ d.status + '] '+ d.statusText });
						}
				);
			}
		};
		
		$scope.gotoxray = function(){
			window.location= "http://localhost:8080/system/console/bundles";
		};
	
	}
	
})();
