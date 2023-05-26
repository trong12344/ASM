<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">

<head>
<title>ShoDdunk - iPhone</title>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS v5.2.1 -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">

<script
	src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"
	integrity="sha384-oBqDVmMz9ATKxIep9tiCxS/Z9fNfEXiDAYTujMAeBAsjFuCZSmKbSSUnQlmh/jp3"
	crossorigin="anonymous">
	
</script>
<link rel="stylesheet" href="/css/iPhone.css">
<script src="Trang chủ.js"></script>


<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.8.2/angular.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.min.js"
	integrity="sha384-7VPbUDkoPSGFnVtYi0QogXtr74QeVeeIs99Qfg5YCF+TidwNdjvaKZX19NZ/e6oz"
	crossorigin="anonymous">
	
</script>
</head>

<body ng-app="myapp">
	<header>
		<nav class="navbar navbar-expand-lg bg-body-tertiary "
			style="height: 64px; background-color: #515154;">
			<div class="container-fluid" style="width: auto;">
				<a class="navbar-brand" href="/trang-chu"> <img
					src="/image/0000242_Logos Desktop.png" height="45" width="173">

				</a>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav">
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-4"
							aria-current="page" href="#">iPhone</a></li>
						<li class="nav-item"><a
							class=" textBox nav-link active text-light px-3 "
							aria-current="page" href="#">iPad</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-3 "
							aria-current="page" href="#">Mac</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-3 "
							aria-current="page" href="#">Watch</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-4 "
							aria-current="page" href="#">Âm thanh</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-3 "
							aria-current="page" href="#">Phụ kiện</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-3 "
							aria-current="page" href="#">Dịch vụ</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-3 "
							aria-current="page" href="#">Trả góp</a></li>
						<li class="nav-item"><a
							class="textBox nav-link active text-light px-4 "
							aria-current="page" href="#">Flash sale</a></li>
						<li class="nav-item"><i
							class="iconBox bi bi-search nav-link active px-4 "
							style="color: white;" aria-current="page" href="#"></i></li>
						<li class="nav-item"><i
							class="iconBox bi bi-bag nav-link active px-4 "
							style="color: white;" aria-current="page" href="#"></i></li>
						<li class="nav-item"><i
							class="iconBox bi bi-person nav-link active px-4 "
							style="color: white;" aria-current="page" href="#"></i></li>
					</ul>


				</div>
			</div>
		</nav>

		<!-- <img src="https://images.unsplash.com/photo-1561154464-82e9adf32764?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=800&q=60" class="card-img-top" alt="..."> -->

		</div>

	</header>
	<main>
		<div class="row my-5" style="width: 1310px;">
			<div class="col-6 product-picture" style="background-color: #f5f5f7; width: 641px">
				<!-- Carousel -->
				<div id="demo" class="carousel slide" data-bs-ride="carousel">

					<!-- Indicators/dots -->
					<div class="carousel-indicators">
						<button type="button" data-bs-target="#demo" data-bs-slide-to="0"
							class="active"></button>
						<button type="button" data-bs-target="#demo" data-bs-slide-to="1"></button>
						<button type="button" data-bs-target="#demo" data-bs-slide-to="2"></button>
					</div>

					<!-- The slideshow/carousel -->
					<div class="carousel-inner">
						<div class="carousel-item active">
							<img src="/image/${product.img}" alt="Los Angeles"
								class="d-block w-100">
						</div>
						<div class="carousel-item">
							<img src="/image/${product.img}" alt="Chicago" class="d-block w-100">
						</div>
						<div class="carousel-item">
							<img src="/image/${product.img}" alt="New York" class="d-block w-100">
						</div>
					</div>
					<!-- Left and right controls/icons -->
					<button class="carousel-control-prev" type="button"
						data-bs-target="#demo" data-bs-slide="prev">
						<span class="carousel-control-prev-icon"></span>
					</button>
					<button class="carousel-control-next" type="button"
						data-bs-target="#demo" data-bs-slide="next">
						<span class="carousel-control-next-icon"></span>
					</button>
				</div>
			</div>
			
			<div class="col-6" style="621px;">
				<h2>${product.name}</h2>
				<i class="text-warning bi bi-star"></i>
				<i class="text-warning bi bi-star"></i>
				<i class="text-warning bi bi-star"></i>
				<i class="text-warning bi bi-star"></i>
				<i class="text-warning bi bi-star"></i>
				<small class="text-primary">3 đánh giá </small>
				<h3>${product.price}VND</h3>
				<div class="fakeimg">Dung Lượng</div>
				<div class="">
					<button type="button" class="btn btn-secondary">128GB</button>
					<button type="button" class="btn btn-secondary">256GB</button>
					<button type="button" class="btn btn-secondary">512GB</button>
					<button type="button" class="btn btn-secondary">1TB</button>
				</div>
				<div class="pt-3">
					<div class="card">
						<div class="card-header">
							KHUYẾN MÃI
							<div class="form-check mt-3">
								<input type="checkbox" class="form-check-input" id="check1"
									name="option1" value="something" checked> <label
									class="form-check-label" for="check1">MUA THẲNG</label>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input" id="check2"
									name="option2" value="something"> <label
									class="form-check-label" for="check2">TRẢ GÓP </label>
							</div>
							<div class="form-check">
								<input type="checkbox" class="form-check-input" id="check2"
									name="option2" value="something"> <label
									class="form-check-label" for="check2">ƯU ĐÃI </label>
							</div>
						</div>
						<div class="card-footer">
							Giới thiệu
							<h5>iPad Pro M2 12.9” được trang bị công nghệ Liquid Retina
								XDR, tích hợp tới 10,000 đèn LED mini, chia thành 2500 vùng rải
								rác khắp màn hình. Tùy thuộc vào nội dung hiển thị mà độ
								sáng/tối của từng vùng có thể thay đổi, tạo nên sự tương phản
								màu sắc chân thực và phong phú. làm rất tốt trong việc mang đến
								chất lượng hiển thị mượt mà và sống động cho iPad Pro M2. Đây
								vẫn là ưu điểm lý tưởng dành cho những ai làm đồ họa chuyên
								nghiệp, thường xuyên phải chỉnh sửa hình ảnh/video hoặc chỉ đơn
								giản là muốn thưởng thức những bộ phim yêu thích.</h5>
						</div>
					</div>
				</div>
				
				<a href="/add/iphone-${product.id}" class="d-grid pt-4">
					<button type="button" class="btn btn-primary btn-block">MUA
						NGAY</button>
				</a>
				<div class="row">
					<div class="col-sm-6">
						<div class="d-grid pt-4">
							<button type="button" class="btn btn-outline-primary">ƯU
								ĐÃI</button>
						</div>
					</div>
					<div class="col-sm-6">
						<div class="d-grid pt-4">
							<button type="button" class="btn btn-outline-primary">TRẢ
								GÓP</button>
						</div>
					</div>
				</div>
			</div>
		</div>


	</main>
</body>


<footer class="bg-dark">
	<div class="container" style="border-bottom: 1px solid #515154;">
		<div class="row">
			<div class="col-4">
				<div
					style="padding: 64px 0 21px 0; text-align: justify; font-size: 15px;">
					<div style="height: 315px; width: 294px; padding: 0 0 20px 0;">
						<img src="/image/0000242_Logos Desktop.png" alt="" height="47px"
							width="184px">
						<p class=" text-light pt-3 ">Năm 2020, ShopDunk trở thành đại
							lý ủy quyền của Apple. Chúng tôi phát triển chuỗi cửa hàng tiêu
							chuẩn và Apple Mono Store nhằm mang đến trải nghiệm tốt nhất về
							sản phẩm và dịch vụ của Apple cho người dùng Việt Nam.</p>
						<div class="row">
							<div class="col-3"
								style="height: 50px;; width: 50px; border-radius: 100%;">
								<img src="/image/Face.png" alt="">
							</div>
							<div class="col-3 ms-2"
								style="height: 50px;; width: 50px; border-radius: 100%;">
								<img src="/image/Tiktok.png" alt="">
							</div>
							<div class="col-3 ms-2"
								style="height: 50px;; width: 50px; border-radius: 100%;">
								<img src="/image/Zalo.png" alt="">
							</div>
							<div class="col-3 ms-2"
								style="height: 50px;; width: 50px; border-radius: 100%;">
								<img src="/image/Youtube.png" alt="">
							</div>
						</div>

					</div>

				</div>
			</div>
			<div class="col-3 my-5 ps-5">
				<dl class="px-5">
					<div class="text-light pb-3" style="font-size: 15px;">Thông
						tin</div>
					<dd class="text-secondary" style="font-size: 14px">Tin tức</dd>
					<dd class="text-secondary" style="font-size: 14px">Gioi thiệu</dd>
					<dd class="text-secondary" style="font-size: 14px">Check IMEI</dd>
					<dd class="text-secondary" style="font-size: 14px">Phương thức
						thanh toán</dd>
					<dd class="text-secondary" style="font-size: 14px">Thuê điểm
						bán lẻ</dd>
					<dd class="text-secondary" style="font-size: 14px">Bảo hành và
						sửa chửa</dd>
					<dd class="text-secondary" style="font-size: 14px">Tuyển dụng</dd>
					<dd class="text-secondary" style="font-size: 14px">Đánh giá
						chất lượng, khiếu nại</dd>
				</dl>
			</div>
			<div class="col-2 my-5">
				<dl class="">
					<div class="text-light pb-3" style="font-size: 15px;">Chính
						sách</div>
					<dd class="text-secondary" style="font-size: 14px">Thu cũ đổi
						mới</dd>
					<dd class="text-secondary" style="font-size: 14px">Giao hàng</dd>
					<dd class="text-secondary" style="font-size: 14px">Giao
						hàng(ZaloPay)</dd>
					<dd class="text-secondary" style="font-size: 14px">Hủy giao
						dịch</dd>
					<dd class="text-secondary" style="font-size: 14px">Đổi trả</dd>
					<dd class="text-secondary" style="font-size: 14px">Bảo hành</dd>
					<dd class="text-secondary" style="font-size: 14px">Giải quyết
						khiếu nại</dd>
					<dd class="text-secondary" style="font-size: 14px">Bảo mật
						thông tin</dd>
					<dd class="text-secondary" style="font-size: 14px">Trả góp</dd>
				</dl>
			</div>
			<div class="col-3 my-5">
				<dl class="">
					<div class="text-light pb-3" style="font-size: 15px;">Địa chỉ
						& Liên hệ</div>
					<dd class="text-secondary" style="font-size: 14px">Tài khoản
						của tôi</dd>
					<dd class="text-secondary" style="font-size: 14px">Đơn đặt
						hàng</dd>
					<dd class="text-secondary" style="font-size: 14px">Hệ thống
						cửa hàng</dd>
					<dd class="text-secondary" style="font-size: 14px">Tìm Store
						trên map</dd>

					<dt class="text-secondary" style="font-size: 14px">Mua hàng:
						1900.6625</dt>
					<dd class="text-secondary" style="font-size: 14px">Nhánh 1:
						khu vực Hà Nội và các tỉnh phía bắc</dd>
					<dd class="text-secondary" style="font-size: 14px">Nhánh 2:
						khu vực Hồ Chí Minh và các tỉnh phía nam</dd>

					<dd class="text-secondary" style="font-size: 14px">Nhánh 3:
						Khiếu nại và góp ý</dd>

					<dd class="text-secondary" style="font-size: 14px">Doanh
						nghiệp: 0822.688.668</dd>
				</dl>
			</div>

		</div>
	</div>
	<div class="container">
		<div class="row">
			<div class="col-9">
				<p class="text-secondary"
					style="font-size: 13px; font-family: Arial">© 2016 Công ty Cổ
					Phần HESMAN Việt Nam GPDKKD: 0107465657 do Sở KH & ĐT TP. Hà Nội
					cấp ngày 08/06/2016. Địa chỉ: Số 76 Thái Hà, phường Trung Liệt,
					quận Đống Đa, thành phố Hà Nội, Việt Nam Đại diện pháp luật: PHẠM
					MẠNH HÒA | ĐT: 0247.305.9999 | Email: lienhe@shopdunk.com</p>
			</div>
			<div class="col-3 text-end">
				<img src="/image/Bocongthuong.png" alt="" height="42px"
					width="134px">
			</div>
		</div>
	</div>
</footer>

</html>