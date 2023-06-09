angular.module("myapp",[]).controller("myctrl",function($scope){
    $scope.ip14 = [
    {
        name: "Apple Watch Series 7 Nhôm GPS ",
        photo: "watch-se-2022-nhom-gps_415.png",
        price: "7.490.000",
        discount: "11.990.000",
        status: "hotsale.png"
 
    },
    {
        name: "Apple Watch Series SE Nhôm GPS ",
        photo: "watch-se-2022-nhom-gps-cellular_415.png",
        price: "6.290.000",
        discount: "8.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "Apple Watch Series 8 Nhôm GPS + Cellular",
        photo: "watch-series-8-thep-gps-cellular_415.png",
        price: "17.900.000",
        discount: "19.990.000",
        status: "hotsale.png"
 
    },
    {
        name: "Apple Watch Series SE Nhôm GPS + Cellular ",
        photo: "watch-se-2022-nhom-gps_415.png",
        price: "7.990.000",
        discount: "10.990.000",
        status: "hotsale.png"
 
    }];
    //
    $scope.ip11 = [{
        name: "Apple Watch Series 3 Nhôm  ",
        photo: "0000897_apple-watch-series-3-nhom_415.png",
        price: "4.290.000",
        discount: "5.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "Apple Watch Ultra LTE",
        photo: "watch-ultra-lte-49mm-ocean-band_415.png",
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