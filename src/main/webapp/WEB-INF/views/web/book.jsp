<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>
	<title></title>
</head>
<body>
<div class="content">
	<h1>Chọn ghế ngồi</h1>
	<div class="main">
		<h2>Sơ Đồ Ghế Ngồi</h2>
		<div class="demo">
			<div id="seat-map">
				<div class="front">MÀN HÌNH</div>					
			</div>
			<div class="booking-details">
				<ul class="book-left">
					<li>Phim </li>
					<li>Thời gian </li>
					<li>Số vé</li>
					<li>Tổng tiền</li>
					<li>Chỗ ngồi</li>
				</ul>
				<ul class="book-right">
					<li>: Gingerclown</li>
					<li>: April 3, 21:00</li>
					<li>: <span id="counter">0</span></li>
					<li>: <b><i>$</i><span id="total">0</span></b></li>
				</ul>
				<div class="clear"></div>
				<ul id="selected-seats" class="scrollbar scrollbar1"></ul>
			
				<button class="checkout-button">Đặt Vé</button>	
				<div id="legend"></div>
			</div>
			<div style="clear:both"></div>
	    </div>

			<script type="text/javascript">
				var price = 10; //price
				$(document).ready(function() {
					var $cart = $('#selected-seats'), //Khu vực ghế ngồi
					$counter = $('#counter'), //Số ghế được chọn
					$total = $('#total'); //Tổng tiền
					
					var sc = $('#seat-map').seatCharts({
						map: [  //Định nghĩa sơ đồ chỗ ngồi
							'aaaaaaaaaa',
							'aaaaaaaaaa',
							'__________',
							'aaaaaaaaaa',
							'aaaaaaaaaa',
							'aaaaaaaaaa',
							'aaaaaaaaaa',
							'aaaaaaaaaa',
							'aaaaaaaaaa',
							'__aaaaaa__'
						],
						naming : {
							top : false,
							getLabel : function (character, row, column) {
								return column;
							}
						},
						legend : { //Definition legend
							node : $('#legend'),
							items : [
								[ 'a', 'available',   'Còn Trống' ],
								[ 'a', 'unavailable', 'Đã Bán'],
								[ 'a', 'selected', 'Đã Được Chọn']
							]					
						},
						click: function () {
							if (this.status() == 'available') { //optional seat
								$('<li>Row'+(this.settings.row+1)+' Seat'+this.settings.label+'</li>')
									.attr('id', 'cart-item-'+this.settings.id)
									.data('seatId', this.settings.id)
									.appendTo($cart);

								$counter.text(sc.find('selected').length+1);
								$total.text(recalculateTotal(sc)+price);
											
								return 'selected';
							} else if (this.status() == 'selected') { //Checked
									//Update Number
									$counter.text(sc.find('selected').length-1);
									//update totalnum
									$total.text(recalculateTotal(sc)-price);
										
									//Delete reservation
									$('#cart-item-'+this.settings.id).remove();
									//optional
									return 'available';
							} else if (this.status() == 'unavailable') { //sold
								return 'unavailable';
							} else {
								return this.style();
							}
						}
					});
					//sold seat
					sc.get(['1_2', '4_4','4_5','6_6','6_7','8_5','8_6','8_7','8_8', '10_1', '10_2']).status('unavailable');
						
				});
				//sum total money
				function recalculateTotal(sc) {
					var total = 0;
					sc.find('selected').each(function () {
						total += price;
					});
							
					return total;
				}
			</script>
	</div>
</div>
</body>
</html>
