angular.module('app', [])
    .controller('ClientController', function ($scope, $http) {

        $scope.mensagem = {};

        $http.get('http://localhost:8080/message')
            .then(function(response) {
                console.log('success: '+ response.data);
                $scope.mensagem = response.data;
        }, function(response) {
            console.log('ERRO: ' + response);
        });

    });