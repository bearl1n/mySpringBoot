/**
 * Created by 1 on 17/04/2017.
 */
var app = angular.module("mySpringBoot1",[]);

app.controller("AppCtrl",function ($scope, $http) {
  /**  $scope.websites=[{
        iconImageUrl:"",
        id: "test",
        website: "test",
        description: "test"
    }];**/
     $scope.method='GET';
     $scope.url='http://localhost:8092/api/stackoverflow';

   /** $scope.websites=[{id:"site id",iconImageUrl:"icon",website:"name site",description:"description site"}];**/


    $http({method: 'GET', url: $scope.url}).
    then(function(response) {
        $scope.status = response.status;
        $scope.websites = response.data;
    }, function(response) {
        $scope.websites = response.data || 'Request failed';
        $scope.status = response.status;
    })
});