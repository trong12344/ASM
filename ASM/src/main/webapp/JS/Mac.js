 angular.module("myapp",[]).controller("myctrl",function($scope){
    $scope.ip14 = [
    {
        name: "Macbook 2020 ",
        photo: "mac1.png",
        price: "25.490.000",
        discount: "30.990.000",
        status: "hotsale.png"
 
    },
    {
        name: "Macbook pro 2020 ",
        photo: "mac2.png",
        price: "28.290.000",
        discount: "34.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "Macbook 2022 ",
        photo: "mac1.png",
        price: "19.900.000",
        discount: "24.990.000",
        status: "hotsale.png"
 
    },
    {
        name: "Macbook pro 2022 ",
        photo: "mac3.png",
        price: "22.990.000",
        discount: "27.990.000",
        status: "hotsale.png"
 
    }];
    //
    $scope.ip11 = [{
        name: "Macbook 2023 ",
        photo: "mac1.png",
        price: "28.290.000",
        discount: "34.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "Macbook pro 2023",
        photo: "mac4.png",
        price: "25.490.000",
        discount: "30.990.000",
        status: "banchay.webp"
 
    }
   ];
   

$scope.prop = "price";
$scope.sortBy = function (prop) {
    $scope.prop = prop;
}
 });