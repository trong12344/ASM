package com.asm.dao;




import java.util.Collection;

import com.asm.model.CartItems;




public interface CartDAO  {
	/**
	 * Lấy tất cả các mặt hàng trong giỏ
	 */
	Collection<CartItems> getItems();

	/**
	 * Thêm mặt hàng vào giỏ hoặc tăng số lượng lên 1 nếu đã tồn tại
	 * 
	 * @param id là mã mặt hàng cần thêm
	 * @return mặt hàng đã được thêm vào hoặc cập nhật số lượng
	 */
	void add(CartItems item);

	/**
	 * Xóa mặt hàng khỏi giỏ
	 * 
	 * @param id mã mặt hàng cần xóa
	 */
	void remove(Integer id);

	/**
	 * Thay đổi số lượng lên của mặt hàng trong giỏ
	 * 
	 * @param id  mã mặt hàng
	 * @param qty số lượng mới
	 * @return mặt hàng đã được thay đổi số lượng
	 */
	CartItems update(Integer id, int qty);

	/**
	 * Xóa sạch các mặt hàng trong giỏ
	 */
	void clear();

	/**
	 * Lấy tổng số lượng các mặt hàng trong giỏ
	 */
	int getCount();

	/**
	 * Lấy tổng số tiền tất cả các mặt hàng trong giỏ
	 */
	double getAmount();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Map<Integer, Product> map = new HashMap<Integer, Product>();
//
//	@Override
//	public Product add(Integer id) {
//		Product item = map.get(id);
//		if (item == null) {
//			item = ListProduct.items.get(id);
//			item.setSl(1);
//			map.put(id, item);
//		} else {
//			item.setSl(item.getSl() + 1);
//		}
//		return item;
//	}
//
//	@Override
//	public void remove(Integer id) {
//		map.remove(id);
//	}
//
//	@Override
//	public Product update(Integer id, String qty) {
//		Product item = map.get(id);
//		if (qty.equals("xoa") && item.getSl() > 0) {
//			item.setSl(item.getSl() - 1);
//			if (item.getSl() == 0) {
//				map.remove(item);
//			}
//		} else if (qty.equals("them") && item.getSl() < 100) {
//			item.setSl(item.getSl() + 1);
//		}
//		return item;
//	}
//
//	@Override
//	public void clear() {
//		map.clear();
//
//	}
//
//	@Override
//	public Collection<Product> getProduct () {
//		return map.values();
//	}
//
//	@Override
//	public int getCount() {
//		return map.values().stream().mapToInt(item -> item.getSl()).sum();
//	}
//
//	@Override
//	public double getAmout() {
//		// TODO Auto-generated method stub
//		return map.values().stream().mapToDouble(item -> item.getPrice() * item.getSl()).sum();
//	}
//
//	public Product getSanPham(Integer id) {	
//		Product item = map.get(id);
//		return item;		
//	}

}
