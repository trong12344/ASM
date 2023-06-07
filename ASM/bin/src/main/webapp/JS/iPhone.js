 angular.module("myapp",[]).controller("myctrl",function($scope){
    $scope.ip14 = [
    {
        name: "iPhone 14 Pro ",
        photo: "ip14pro.png",
        price: "25.490.000",
        discount: "30.990.000",
        status: "hotsale.png"
 
    },
    {
        name: "iPhone 14 Pro Max ",
        photo: "ip14prm.png",
        price: "28.290.000",
        discount: "34.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "iPhone 14 ",
        photo: "ip14.png",
        price: "19.900.000",
        discount: "24.990.000",
        status: "hotsale.png"
 
    },
    {
        name: "iPhone 14 Plus ",
        photo: "ip14p.png",
        price: "22.990.000",
        discount: "27.990.000",
        status: "hotsale.png"
 
    }];
    //
    $scope.ip11 = [{
        name: "iPhone 11 ",
        photo: "ip1164gb.webp",
        price: "28.290.000",
        discount: "34.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "iPhone 11 Pro",
        photo: "ip11128gb.webp",
        price: "25.490.000",
        discount: "30.990.000",
        status: "banchay.webp"
 
    }
   ];
   //
   $scope.ip13 =[
        {
        name: "iPhone 13",
        photo: "ip13.webp",
        price: "25.490.000",
        discount: "30.990.000",
        status: "banchay.webp"
 
    },
    {
        name: "iPhone 13 Mini",
        photo: "ip13mini.webp",
        price: "25.490.000",
        discount: "30.990.000",
        status: "banchay.webp"
 
    }
   ];
   $scope.ipse =[
    {
    name: "iPhone SE(2020)",
    photo: "iphonese.webp",
    price: "25.490.000",
    discount: "30.990.000",
    status: "banchay.webp"

}

];
$scope.ip12 =[
    {
    name: "iPhone 12 ",
    photo: "ip12.webp",
    price: "25.490.000",
    discount: "30.990.000",
    status: "banchay.webp"

},
{
    name: "iPhone 12 Pro",
    photo: "ip11128gb.webp",
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